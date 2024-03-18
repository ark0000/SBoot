package com.dark;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class SchoolController {
   private final SchoolRepo schoolRepo;

    public SchoolController(SchoolRepo schoolRepo) {
        this.schoolRepo = schoolRepo;
    }

    @PostMapping("/schools")
    public SchoolDTO create(@RequestBody SchoolDTO schoolDTO)
    {        var school=toSchool(schoolDTO);

               schoolRepo.save(school);
                  return schoolDTO;
       }
    School  toSchool(SchoolDTO school){
           return new School(
                   school.name()
           );
       }
    @GetMapping("/schools")
    public List<SchoolDTO> findAll(){
        return schoolRepo.findAll()
                .stream()
                .map(this::toSchoolDTO).collect(Collectors.toList());
    }
    private SchoolDTO toSchoolDTO(School school){
        return new SchoolDTO(school.getName());
    }
}
