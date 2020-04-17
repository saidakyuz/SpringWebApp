package KSI.studentEvaluation.SpringWebApp.Domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private int lessonCredit;

    @ManyToMany
    @JoinTable(name = "student_lesson",
            joinColumns = @JoinColumn(name = "lesson_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    private Set<Student> studentSet = new HashSet<>();
    //private Set<Lesson> requiredLessonSet = new HashSet<>();
    // TODO: 4/16/2020 Lesson seti oluşturarak bu dersi alabilmek için gerekli dersleri doldurmayı düşünüyordum. İlişkinin nasıl olacağını belirleyeceğim. 

    @ManyToMany
    @JoinTable(name = "teacher_lesson",
            joinColumns = @JoinColumn(name = "lesson_id"),
            inverseJoinColumns = @JoinColumn(name = "teacher_id")
    )
    private Set<Teacher> teacherSet = new HashSet<>();

    public Lesson() {
    }

    public Lesson(Long id, String name, int lessonCredit) {
        this.id = id;
        this.name = name;
        this.lessonCredit = lessonCredit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLessonCredit() {
        return lessonCredit;
    }

    public void setLessonCredit(int lessonCredit) {
        this.lessonCredit = lessonCredit;
    }

    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }

    public Set<Teacher> getTeacherSet() {
        return teacherSet;
    }

    public void setTeacherSet(Set<Teacher> teacherSet) {
        this.teacherSet = teacherSet;
    }


}
