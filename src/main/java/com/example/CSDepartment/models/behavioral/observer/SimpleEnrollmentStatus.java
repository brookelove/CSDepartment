package com.example.CSDepartment.models.behavioral.observer;

import java.util.ArrayList;

public class SimpleEnrollmentStatus implements EnrollmentStatusAlert{
    private ArrayList<Student> studentList;
    private ArrayList<Chairperson> chairpersonArrayList;
    private String value;
    @Override
    public void registerChairpersonStatus(Chairperson chairperson) {
        chairpersonArrayList.add(chairperson);
    }

    @Override
    public void registerStudentStatus(Student student) {
        studentList.add(student);
    }

    @Override
    public void notifyStudentObserver() {
        for(Student student : studentList){
            student.update(value);
        }
    }

    @Override
    public void notifyChairpersonObserver() {
        for(Chairperson chairperson : chairpersonArrayList){
            chairperson.update(value);
        }
    }

    public void setStudentValue(String value) {
        this.value = value;
        notifyStudentObserver();
    }
    public void setChairpersonValue(String value) {
        this.value = value;
        notifyChairpersonObserver();
    }
}