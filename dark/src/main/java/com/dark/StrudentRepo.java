package com.dark;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//ato understand this repo manage to create bean0
public interface StrudentRepo extends JpaRepository<Student, Integer> {

    List<Student> findByfirstNameContaining(String firstName);
}
