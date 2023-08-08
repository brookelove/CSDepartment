package com.example.CSDepartment.models.behavioral.strategy;

import com.example.CSDepartment.models.common.Course;

import java.util.ArrayList;

public class WeightedGPA implements CalculateGPA{
    public double calculateGPA(ArrayList<Course> courses) {
        double totalCreditHours = 0;
        double totalWeight = 0;
        for (Course course : courses){
            double gradeValue = 0; //this is going to be courses.getGrade().getValue()
            double allWeights = 0; // student.getCourses().getGrade()getValue() to recursively call to grades to get value
            totalCreditHours += gradeValue * allWeights;
            totalCreditHours += allWeights;
        }
        return totalCreditHours/totalWeight;
    }
}