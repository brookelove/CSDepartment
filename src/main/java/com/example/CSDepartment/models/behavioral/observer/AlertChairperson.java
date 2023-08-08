package com.example.CSDepartment.models.behavioral.observer;

public class AlertChairperson implements Chairperson{
    private String chairpersonName;

    public AlertChairperson(String chairpersonName, EnrollmentStatusAlert enrollmentStatus){
        this.chairpersonName = chairpersonName;
        enrollmentStatus.registerChairpersonStatus(this);

    }
    @Override
    public void update(String notification) {
        display(notification);
    }
    public void display(String notification){
        System.out.printf("Message received by %s : %s",chairpersonName, notification);
    }
}