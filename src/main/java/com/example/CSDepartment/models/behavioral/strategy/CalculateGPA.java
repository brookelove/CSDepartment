package com.example.CSDepartment.models.behavioral.strategy;

import com.example.CSDepartment.models.common.Course;

import java.util.ArrayList;

public interface CalculateGPA {
    public double calculateGPA(ArrayList<Course> courses);
}