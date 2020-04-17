package KSI.studentEvaluation.SpringWebApp.Domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String lastname;
    private String eMail;

    @ManyToOne
    @JoinColumn(name = "studentClass_id")
    private Class studentClass;

    @ManyToMany(mappedBy = "studentSet")
    private Set<Lesson> lessonSet = new HashSet<>();

    // TODO: 4/16/2020 Buraya lesson seti ekle ve bağlantısını yap

    public Student() {
    }

    public Student(Long id, String name, String lastname, String eMail, Class studentClass) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.eMail = eMail;
        this.studentClass = studentClass;
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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public Class getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(Class studentClass) {
        this.studentClass = studentClass;
    }

    public Set<Lesson> getLessonSet() {
        return lessonSet;
    }

    public void setLessonSet(Set<Lesson> lessonSet) {
        this.lessonSet = lessonSet;
    }
}
