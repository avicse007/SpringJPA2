package com.example.university.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * JPA Entity for a Department of study at the University.
 * <p>
 * Created by maryellenbowman
 */
@Entity
@Table(name = "Department")
public class Department {
    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String name;

    @OneToMany(mappedBy = "department", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Course> courses = new ArrayList<Course>();

    @OneToOne
    private Staff chair;
    
    public Department(String name) {
        this.name = name;
    }
    
    public Department(String name, Staff chair) {
        this.name = name;
        this.chair = chair;
    }

    protected Department() {
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", name='" + name + '\'' +
                ", courses=" + courses + '}';
    }
}
