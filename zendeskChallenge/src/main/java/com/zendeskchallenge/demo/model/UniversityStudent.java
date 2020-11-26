package com.zendeskchallenge.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UniversityStudent {

    private int idStudent;
    private String nameStudent;
    private String universityCareer;
    private boolean activeStatus;

    public UniversityStudent(int idStudent, String nameStudent, String universityCareer, boolean activeStatus) {
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        this.universityCareer = universityCareer;
        this.activeStatus = activeStatus;
    }
}

