package com.example.CSDepartment.models.structural.decorator;

import com.example.CSDepartment.models.common.Course;
import jakarta.persistence.Entity;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.ArrayList;
enum FacultyType{
    Part_Time,
    Full_Time,
    Chairperson,
    Faculty;
}
public interface Faculty {
    String getName();
    String getEmail();
    String getNumber();
    FacultyType getFacultyType();
    ArrayList<Course> getCourseLoad();
    Boolean checkCourseLoad();
    ArrayList<String> getQueries();


}

class PartTime extends Instructor {
    public PartTime(String name, String email, String number, Integer courseCap, ArrayList<Course> courseList, ArrayList<String> queryList) {
        super(name, email, number, courseCap, courseList, queryList);
    }

    @Override
    public FacultyType getFacultyType() {
        return FacultyType.Part_Time;
    }
}
class FullTime extends Instructor {
    private ArrayList<Advisor> advisors;
    public FullTime(String name, String email, String number, Integer courseCap, ArrayList<Course> courseList, ArrayList<String> queryList) {
        super(name, email, number, courseCap, courseList, queryList);
    }
    @Override
    public FacultyType getFacultyType() {
        return FacultyType.Full_Time;
    }
}

class Chairperson extends Instructor implements com.example.CSDepartment.models.behavioral.observer.Chairperson {
    private ArrayList<Advisor> advisors;
    public Chairperson(String name, String email, String number, Integer courseCap, ArrayList<Course> courseList, ArrayList<String> queryList) {
        super(name, email, number, courseCap, courseList, queryList);
    }
    @Override
    public FacultyType getFacultyType() {
        return FacultyType.Chairperson;
    }

    @Override
    public void update(String status) {
        status = "Pending...";
    }
}