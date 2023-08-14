package com.example.CSDepartment.models.structural.decorator;

import com.example.CSDepartment.models.common.Course;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.UUID;

@Entity
public abstract class Instructor implements Faculty {
    @Id
    protected UUID ID;
    protected String name;
    protected String email;
    protected String number;
    protected Integer courseCap;
    protected ArrayList<Course> courseList;
    protected ArrayList<String> queryList;

    public Instructor(String name, String email, String number, Integer courseCap, ArrayList<Course> courseList, ArrayList<String> queryList) {
        this.ID = UUID.randomUUID();
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