package KSI.studentEvaluation.SpringWebApp.Domain;

import javax.persistence.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Class {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int capacityt;

    @OneToMany(mappedBy = "studentClass")
    private Set<Student> studentSet = new HashSet<>();

    public Class() {
    }

    public Class(Long id, String name, int capacityt) {
        this.id = id;
        this.name = name;
        this.capacityt = capacityt;
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

    public int getCapacityt() {
        return capacityt;
    }

    public void setCapacityt(int capacityt) {
        this.capacityt = capacityt;
    }

    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }
}
