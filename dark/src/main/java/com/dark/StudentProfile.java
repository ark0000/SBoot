package com.dark;

import jakarta.persistence.*;

@Entity
public class StudentProfile {
@Id
    @GeneratedValue
    Integer id;
String bio;
@OneToOne
@JoinColumn(
        name = "std_ID"
)
private Student student;
    public StudentProfile() {
    }

    public StudentProfile(Integer id, String bio) {
        this.id = id;
        this.bio = bio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
