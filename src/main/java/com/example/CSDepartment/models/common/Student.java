package com.example.CSDepartment.models.common;

public class Student implements com.example.CSDepartment.models.behavioral.observer.Student {

    @Override
    public void update(String status) {
        status = "Pending...";

    }
}