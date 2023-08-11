package com.example.CSDepartment.models.common;

import com.example.CSDepartment.models.behavioral.observer.Chairperson;
import com.example.CSDepartment.models.behavioral.observer.Student;
import com.example.CSDepartment.models.creational.abstractfactory.Program;
import com.example.CSDepartment.models.structural.composite.ConcentrationComponent;
import com.example.CSDepartment.models.structural.decorator.BasicFaculty;
import com.zaxxer.hikari.util.ClockSource;
import jakarta.persistence.Entity;
import org.aspectj.asm.internal.ProgramElement;

import java.util.ArrayList;
import java.util.UUID;
//used in structural-composite,

@Entity
public class Course implements ConcentrationComponent {
    private String description;
    private String syllabus;
    private String title;
    private Integer seats;
    private UUID ID;
    private char grade;
    private BasicFaculty instructor;
    private ArrayList<Student> enrolledStudents;
    private ArrayList<Student> waitList;

    public Course(BasicFaculty instructor, String title, String description, String syllabus, Character grade, ArrayList<Student> enrolledStudents, ArrayList<Student> waitList, Integer seats){
        this.description = description;
        this.syllabus = syllabus;
        this.ID = UUID.randomUUID();
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
    public BasicFaculty getInstructor(){return instructor;}
    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
    public ArrayList<Student> getWaitList() {
        return waitList;
    }
    public void addStudent(Student student){
        if(enrolledStudents.size() == seats){
            waitList.add(student);
            //alert the chairperson
            //alert the student that they have been wait listed
        } else {
            enrolledStudents.add(student);
        }
    }
    //may need to do
    public void dropStudent(Student student){
        enrolledStudents.remove(student);
        if (waitList.size() > 0 ){
            Student newStudent = waitList.remove(0);
            enrolledStudents.add(newStudent);
            //alert chairperson
            // alert student they have been enrolled
        }
    }
    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String format() {
        return syllabus; // this has to be created in HTML format can be a string
    }
}