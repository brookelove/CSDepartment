package com.example.CSDepartment.models.common;
import com.example.CSDepartment.models.creational.abstractfactory.Program;
import com.example.CSDepartment.models.structural.decorator.BasicFaculty;
import jakarta.persistence.Entity;
import java.util.ArrayList;
import java.util.UUID;


@Entity
public class Student implements com.example.CSDepartment.models.behavioral.observer.Student {
    private UUID studentId;
    private String name;
    private String email;
    private Program program;
    private String thesisTopic;
    private ArrayList<Course> currClasses;
    private ArrayList<Course> pastClasses;
    public Student(UUID id, String name, String email, Program program, ArrayList<Course> pastClasses, ArrayList<Course> currClasses, String thesisTopic){
        this.studentId = UUID.randomUUID();
        this.name = name;
        this.email = email;
        this.program = program;
        this.thesisTopic = thesisTopic;
        this.currClasses = currClasses;
        this.thesisTopic = thesisTopic;
    }
    public UUID getStudentId() {
        return studentId;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public Program getProgram() {
        return program;
    }
    public String getThesisTopic() {
       return thesisTopic;
    }
    public ArrayList<Course> getCurrClasses() {
        return currClasses;
    }
    public ArrayList<Course> getPastClasses() {
        return pastClasses;
    }


    @Override
    public void update(String status) {
        status = "Pending...";

    }
}