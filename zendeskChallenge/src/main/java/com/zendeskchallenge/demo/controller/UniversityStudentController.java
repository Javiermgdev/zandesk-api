package com.zendeskchallenge.demo.controller;

import com.zendeskchallenge.demo.model.UniversityStudent;
import com.zendeskchallenge.demo.service.implementation.UniversityStudentServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("universitystudent")
public class UniversityStudentController {

    @Autowired
    UniversityStudentServiceImplementation universityStudentServiceImplementation;

    @GetMapping
    public List<UniversityStudent> getAllUniversityStudent(){
        return universityStudentServiceImplementation.getAllStudents();
    }

    @GetMapping("/findbyname")
    public Optional<UniversityStudent> getStudentByName(@RequestParam(value = "name") String nameStudent){
        return universityStudentServiceImplementation.getUniversityStudentByName(nameStudent);
    }

    @GetMapping("/{nameStudent}/status")
    public String statusStudentByName(@PathVariable String nameStudent){
        return universityStudentServiceImplementation.changeStatusByName(nameStudent);
    }
    //funcionalidad incompleta
    @DeleteMapping("/{nameStudent}")
    public String deleteStudentByName(@PathVariable String nameStudent){
        return universityStudentServiceImplementation.deleteUniversityStudentByName(nameStudent);
    }

    //funcionalidad incompleta
    @PostMapping("/save")
    public String saveStudentByName(@RequestBody UniversityStudent universityStudent){
        return universityStudentServiceImplementation.saveUniversityStudent(universityStudent);
    }
}