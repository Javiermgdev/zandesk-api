package com.zendeskchallenge.demo.repository;

import com.zendeskchallenge.demo.model.UniversityStudent;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class UniversityStudentRepository {

    public List<UniversityStudent> DB = Arrays.asList(
            new UniversityStudent(1,"Javier Alejandro", "Computer Science", true),
            new UniversityStudent(2,"Julia Sagas", "Medical", true),
            new UniversityStudent(3,"Allysson Rojas", "Civil Engineer", true),
            new UniversityStudent(4,"Paola Robles", "Criminal Law", false),
            new UniversityStudent(5,"Henry Bravo", "Civil Engineer", false),
            new UniversityStudent(6,"Jessica Torres", "Design Graphics", true),
            new UniversityStudent(7,"Ismael Gonzalez", "Mathematics", true)
    );



}
