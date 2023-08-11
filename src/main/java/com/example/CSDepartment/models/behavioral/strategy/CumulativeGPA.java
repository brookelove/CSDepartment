package com.example.CSDepartment.models.behavioral.strategy;

import com.example.CSDepartment.models.common.Course;

import java.util.ArrayList;

public class CumulativeGPA implements CalculateGPA {

    @Override
    public double calculateGPA(ArrayList<Course> courses) {
        double totalCreditHours = 0;
        double weight = 4;
        for(Course course: courses){
            double gradeValue = course.getCredit();
            int credits = 0; //course.getCredits();
        }
        return totalCreditHours/weight;
    }
}