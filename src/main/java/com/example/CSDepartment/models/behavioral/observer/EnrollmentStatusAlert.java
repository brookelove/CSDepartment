package com.example.CSDepartment.models.behavioral.observer;

public interface EnrollmentStatusAlert {
    public void registerChairpersonStatus(Chairperson chairperson);
    public void registerStudentStatus(Student student);
    public void notifyStudentObserver();
    public void notifyChairpersonObserver();

}