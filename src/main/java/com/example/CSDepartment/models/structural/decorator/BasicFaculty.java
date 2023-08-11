package com.example.CSDepartment.models.structural.decorator;

import com.example.CSDepartment.models.common.Course;
import jakarta.persistence.Entity;

import java.util.ArrayList;

@Entity
public abstract class BasicFaculty implements Faculty {
    protected String name;
    protected String email;
    protected String number;
    protected Integer courseCap;
    protected ArrayList<Course> courseList;
    protected ArrayList<String> queryList;

    public BasicFaculty(String name, String email, String number, Integer courseCap, ArrayList<Course> courseList, ArrayList<String> queryList) {
        this.name = name;
        this.email = email;
        this.number = number;
        this.courseCap = courseCap;
        this.courseList = courseList;
        this.queryList = queryList;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public FacultyType getFacultyType() {
        return FacultyType.Faculty;
    }

    @Override
    public ArrayList<Course> getCourseLoad() {
        return courseList;
    }

    @Override
    public Boolean checkCourseLoad() {
        return courseList.size() >= courseCap;
    }

    @Override
    public ArrayList<String> getQueries() {
        return queryList;
    }
}