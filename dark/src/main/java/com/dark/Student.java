package com.dark;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "T_Students")
public class Student {
    @Id//primary key
    @GeneratedValue//auto generate conjunction with ID annotation only
    /*
     * Generated Type TABLE,SEQUENCE
     * create table to schema to store id of entity use
     * dbsequence - have seq of values
     * Identity- db identity to quto gen ids
     * UUID-
     * AUTO- auto hibernate
     * */
    private Integer id;
    @Column(
            name = "f_name"//alias firstName
            , length = 20

    )
    private String firstName;
    private String lastName;
    @Column(
            unique = true
    )
    private String email;
    private int age;
@OneToOne(
        mappedBy = "student",
        cascade=CascadeType.ALL
)
 private StudentProfile studentProfile;
@ManyToOne
@JoinColumn(
        name="school_id"
)
@JsonBackReference
private School school;
    public Student() {

    }

    public Student(Integer id, String firstName, String lastName, String email, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    public StudentProfile getStudentProfile() {
        return studentProfile;
    }

    public void setStudentProfile(StudentProfile studentProfile) {
        this.studentProfile = studentProfile;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
