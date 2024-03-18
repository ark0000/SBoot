package com.dark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FirstController {
private final StrudentRepo repo;

@Autowired
    public FirstController(StrudentRepo repo) {
        this.repo = repo;
    }
    @PostMapping("/students")
    StudentResopnseDTO post(@RequestBody StudentDTO student){
     var res=repo.save(toStudent(student));//resturn S entity
return toStudentResponse(res);
    }
    private Student toStudent( StudentDTO dto){
        var student= new Student();
        student.setFirstName(dto.firstName());
        student.setLastName(dto.lastName());
        student.setEmail(dto.email());
        var school=new School();
        school.setId(dto.SchoolID());
        student.setSchool(school);
        return student;
    }

private StudentResopnseDTO toStudentResponse(Student student){
         return  new StudentResopnseDTO(
                 student.getFirstName(),student.getLastName(),student.getEmail()
         );
}
    @GetMapping("/students/{studentId}")
    Student getStudent(@PathVariable("studentId") Integer id){
return repo.findById(id).orElse(new Student());
}
    @GetMapping("/students")
    List<Student> getStudent(){
     return repo.findAll();
    }
    @GetMapping("/students/search/{studName}")
    List<Student> findByname(@PathVariable("studName") String name){
      return repo.findByfirstNameContaining(name);
    }
    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/students/{id}")
         void delete(@PathVariable int id){
             repo.deleteById(id);
    }
}
