package com.example.CSDepartment.models.behavioral.strategy;

import com.example.CSDepartment.models.common.Course;

import java.util.ArrayList;

public class WeightedGPA implements CalculateGPA{
    public double calculateGPA(ArrayList<Course> courses) {
        double totalCreditHours = 0;
        double totalWeight = 0;
        for (Course course : courses){
            double gradeValue = course.getCredit();
            double weights = 4;
            totalCreditHours += gradeValue * weights;
            totalCreditHours += weights;
        }
        return totalCreditHours/totalWeight;
    }
}