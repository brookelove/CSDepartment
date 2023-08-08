package com.example.CSDepartment.models.creational.builder;

import com.example.CSDepartment.models.common.Course;

interface Builder {
    void createCourse();
    void createName();
    void createDescription();
    void createSeats();
    void createSyllabus();
    Course getCourse();
}