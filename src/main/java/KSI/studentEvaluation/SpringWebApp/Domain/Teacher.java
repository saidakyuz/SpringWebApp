package KSI.studentEvaluation.SpringWebApp.Domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String lastname;
    private String e_mail;

    @ManyToMany(mappedBy = "teacherSet")
    private Set<Lesson> lessonSet = new HashSet<>();

    public Teacher() {
    }

    public Teacher(Long id, String name, String lastname) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
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

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public Set<Lesson> getLessonSet() {
        return lessonSet;
    }

    public void setLessonSet(Set<Lesson> lessonSet) {
        this.lessonSet = lessonSet;
    }
}
