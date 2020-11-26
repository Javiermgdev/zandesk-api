package com.zendeskchallenge.demo.service;

import com.zendeskchallenge.demo.model.UniversityStudent;

import java.util.List;
import java.util.Optional;

public interface UniversityStudentService {

    List<UniversityStudent> getAllStudents();

    String saveUniversityStudent(UniversityStudent universityStudent);

    String changeStatusByName(String nameStudent);

    Optional<UniversityStudent> getUniversityStudentByName(String nameStudent);

    String deleteUniversityStudentByName(String nameStudent);

}
