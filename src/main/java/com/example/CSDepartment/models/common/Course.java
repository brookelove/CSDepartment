package com.example.CSDepartment.models.common;
import com.example.CSDepartment.models.behavioral.observer.AlertStudent;
import com.example.CSDepartment.models.behavioral.observer.SimpleEnrollmentStatus;
import com.example.CSDepartment.models.structural.decorator.Instructor;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.UUID;
//used in structural-composite,

@Entity
public class Course {
    private String description;
    private String syllabus;
    private String title;
    private Integer seats;
   @Id
    private UUID ID;
    private char grade;
    private Instructor instructor;
    private ArrayList<Student> enrolledStudents;
    private ArrayList<Student> waitList;

    public Course(Instructor instructor, String title, String description, String syllabus, Character grade, ArrayList<Student> enrolledStudents, ArrayList<Student> waitList, Integer seats){
        this.description = description;
        this.syllabus = syllabus;
        this.title = title;
        this.instructor = instructor;
        this.grade = grade;
        this.enrolledStudents = enrolledStudents;
        this.waitList = waitList;
        this.seats = seats;
    }

    public double getCredit() {
        switch (grade) {
            case 'A':
                return 4.0;
            case 'B':
                return 3.0;
            case 'C':
                return 2.0;
            case 'D':
                return 1.0;
            default:
                return 0.0;
        }
    }
    public UUID getId() {
        return ID;
    }
    public String getTitle() {
        return title;
    }
    public Character getGrade(){
        return grade;
    }
    public Instructor getInstructor(){return instructor;}
    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
    public ArrayList<Student> getWaitList() {
        return waitList;
    }
    public void addStudent(Student student){
        if(enrolledStudents.size() == seats){
            SimpleEnrollmentStatus capSize = new SimpleEnrollmentStatus();
            String studentName = student.getName();
//            String chairpersonName = chairperson.;
            AlertStudent studentAlert = new AlertStudent(studentName,capSize);
//            AlertChairperson chairpersonAlert = new AlertChairperson(chairpersonName,capSize);
            capSize.setStudentValue(studentName + ": There are no more seats in " + title + "you will be wait listed");
            capSize.setChairpersonValue(title + "This class has ben wait listed.");
            waitList.add(student);
            //alert the chairperson========================================
        } else if (enrolledStudents.size() < seats) {
            enrolledStudents.add(student);
        } else {
            enrolledStudents.add(student);
        }
    }
    //may need to do
    public void dropStudent(Student student){
//        need to find student then drop them after
        enrolledStudents.remove(student);
        if (waitList.size() > 0 ){ // and enrolled students are not the current size
            Student newStudent = waitList.remove(0);
            String newStudentName = newStudent.getName();
            enrolledStudents.add(newStudent);
            SimpleEnrollmentStatus capSize = new SimpleEnrollmentStatus();
            String studentName = student.getName();
            AlertStudent studentAlert = new AlertStudent(newStudentName,capSize);
            capSize.setStudentValue(newStudentName + "You have been added to " + title);
        }
    }
}