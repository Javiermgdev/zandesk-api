package com.zendeskchallenge.demo.service.implementation;

import com.zendeskchallenge.demo.model.UniversityStudent;
import com.zendeskchallenge.demo.repository.UniversityStudentRepository;
import com.zendeskchallenge.demo.service.UniversityStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class UniversityStudentServiceImplementation implements UniversityStudentService{

    @Autowired
    UniversityStudentRepository universityStudentRepository;

    @Override
    public List<UniversityStudent> getAllStudents() {
        return universityStudentRepository.DB;
    }

    @Override
    public String saveUniversityStudent(UniversityStudent universityStudent) {
        int totalIds = universityStudentRepository.DB.size();
        int newId = totalIds +1;
        universityStudentRepository.DB.add(new UniversityStudent(newId, universityStudent.getNameStudent(), universityStudent.getUniversityCareer(), universityStudent.isActiveStatus()));
        return "the student is saved";
    }




    @Override
    public String changeStatusByName(String nameStudent) {
        Optional<UniversityStudent> particularStudent = universityStudentRepository.DB.stream()
                .filter(universityStudent -> universityStudent.getNameStudent().equals(nameStudent))
                .findFirst();
        if(particularStudent.get().isActiveStatus() == true){
            particularStudent.get().setActiveStatus(false);
            return "was changed to false";
        }else{
            particularStudent.get().setActiveStatus(true);
            return "was changed to true";
        }

    }

    @Override
    public Optional<UniversityStudent> getUniversityStudentByName(String nameStudent) {
        return universityStudentRepository.DB.stream()
                .filter(universityStudent -> universityStudent.getNameStudent().equals(nameStudent))
                .findFirst();
    }

    @Override
    public String deleteUniversityStudentByName(String nameStudent) {
        Optional<UniversityStudent> particularStudent = getUniversityStudentByName(nameStudent);
        universityStudentRepository.DB.remove(particularStudent.get().getIdStudent());
        return "OK deleted";
    }

}
