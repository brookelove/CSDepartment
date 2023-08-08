package com.example.CSDepartment.models.behavioral.observer;

public class AlertStudent implements Student {
    private String studentName;
    //get class list to check the status of the alert then do alert status

    public AlertStudent(String studentName, EnrollmentStatusAlert enrollmentStatus){
        this.studentName = studentName;
        enrollmentStatus.registerStudentStatus(this);
    }

    @Override
    public void update(String notification) {
        display(notification);
    }
    public void display(String notification){
        System.out.printf("Message received by %s : %s",studentName, notification);
    }
}