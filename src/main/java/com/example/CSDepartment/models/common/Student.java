package com.example.CSDepartment.models.common;
import com.example.CSDepartment.models.creational.abstractfactory.Certificate;
import com.example.CSDepartment.models.creational.abstractfactory.Degree;
import com.example.CSDepartment.models.creational.abstractfactory.Program;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.UUID;


@Entity
public class Student implements com.example.CSDepartment.models.behavioral.observer.Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID studentId;
    private String name;
    private String email;
    @OneToOne
    @JoinColumn(name="degree_id")
    private Degree degree;
    @OneToOne
    @JoinColumn(name="certificate_id")
    private Certificate certificate;
    private String thesisTopic;
    @OneToMany
    private ArrayList<Course> currClasses;
    @OneToMany
    private ArrayList<Course> pastClasses;
    public Student(UUID id, String name, String email, Degree degree,Certificate certificate, ArrayList<Course> pastClasses, ArrayList<Course> currClasses, String thesisTopic){
        this.name = name;
        this.email = email;
        this.degree = degree;
        this.certificate = certificate;
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
        if(degree !=null){
            return degree;
        } else if (certificate !=null) {
            return certificate;
        } else {
            return null;
        }
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