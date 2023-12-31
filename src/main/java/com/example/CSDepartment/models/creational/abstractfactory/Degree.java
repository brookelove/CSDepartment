package com.example.CSDepartment.models.creational.abstractfactory;

import com.example.CSDepartment.models.common.Course;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


import java.util.ArrayList;
@Entity
public class Degree implements Program{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String programType = "Degree";
    private String programName;
    private ArrayList<Course> coreCourses;
    private Integer year;
    public String getProgramType(){
        this.programType = programType;
        return programType;
    }
    public void getCoreCourses(){
        for(Course course : coreCourses){
            System.out.println(course);
        }
    }
    public Integer getProgramYears(){
        this.year = year;
        return year;
    }
}