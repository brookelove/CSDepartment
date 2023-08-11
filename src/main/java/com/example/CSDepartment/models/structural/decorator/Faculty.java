package com.example.CSDepartment.models.structural.decorator;

import com.example.CSDepartment.models.common.Course;
import jakarta.persistence.Entity;

import java.util.ArrayList;
enum FacultyType{
    Part_Time,
    Full_Time,
    Chairperson,
    Faculty;
}
interface Faculty {
    String getName();
    String getEmail();
    String getNumber();
    FacultyType getFacultyType();
    ArrayList<Course> getCourseLoad();
    Boolean checkCourseLoad();
    ArrayList<String> getQueries();


}

class PartTime extends BasicFaculty {
    public PartTime(String name, String email, String number, Integer courseCap, ArrayList<Course> courseList, ArrayList<String> queryList) {
        super(name, email, number, courseCap, courseList, queryList);
    }

    @Override
    public FacultyType getFacultyType() {
        return FacultyType.Part_Time;
    }
}
class FullTime extends BasicFaculty {
    private ArrayList<Advisor> advisors;
    public FullTime(String name, String email, String number, Integer courseCap, ArrayList<Course> courseList, ArrayList<String> queryList) {
        super(name, email, number, courseCap, courseList, queryList);
    }
    @Override
    public FacultyType getFacultyType() {
        return FacultyType.Full_Time;
    }
}
class Chairperson extends BasicFaculty {
    private ArrayList<Advisor> advisors;
    public Chairperson(String name, String email, String number, Integer courseCap, ArrayList<Course> courseList, ArrayList<String> queryList) {
        super(name, email, number, courseCap, courseList, queryList);
    }
    @Override
    public FacultyType getFacultyType() {
        return FacultyType.Chairperson;
    }
}