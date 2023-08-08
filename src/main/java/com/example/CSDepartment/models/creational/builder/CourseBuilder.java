package com.example.CSDepartment.models.creational.builder;

import com.example.CSDepartment.models.common.Course;

class CourseBuilder implements Builder {
    private String courseName;
    private Integer seats;
    private String description;
    private String syllabus;
    Course course;

    @Override
    public void createCourse() {

    }

    @Override
    public void createName() {
        this.courseName = courseName;
    }

    @Override
    public void createDescription() {
        this.description = description;
    }

    @Override
    public void createSeats() {
        this.seats = seats;
    }

    @Override
    public void createSyllabus() {
        this.syllabus = syllabus;
    }

    @Override
    public Course getCourse() {
        return course;
    }
}