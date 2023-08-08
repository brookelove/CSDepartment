package com.example.CSDepartment.models.behavioral.observer;

public interface EnrollmentStatusAlert {
    public void registerChairpersonStatus(Chairperson chairperson);
    public void registerStudentStatus(Student student);
    public void notifyObserver();

    void update(String notification);
}