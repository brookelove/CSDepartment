package com.example.CSDepartment.models.creational.abstractfactory;

import com.example.CSDepartment.models.common.Course;

import java.util.ArrayList;

public class Degree implements Program{
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