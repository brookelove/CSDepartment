package com.example.CSDepartment.models.creational.abstractfactory;

import com.example.CSDepartment.models.common.Course;

import java.util.ArrayList;

public class Certificate implements Program{
    private String programType = "Certificate";
    private ArrayList<Course> coreCourses;
    private Integer year;

    @Override
    public String getProgramType() {
        this.programType = programType;
        return programType;
    }

    @Override
    public void getCoreCourses(){
        for(Course course : coreCourses){
            System.out.println(course);// will change to course.getName()
        }
    }
    public Integer getProgramYears(){
        this.year = year;
        return year;
    }
}