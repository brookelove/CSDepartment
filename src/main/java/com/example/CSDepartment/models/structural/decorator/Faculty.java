package com.example.CSDepartment.models.structural.decorator;

import com.example.CSDepartment.models.common.Course;

import java.util.ArrayList;

public abstract class Faculty {
    String name = "facultyName";
    String number = "000-000-0000";
    String email = "email@email.com";
    String faculty = "Faculty";
    Boolean checkClass = false;
    ArrayList<Course> currClassList = new ArrayList<Course>();
    public String getName(){
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getNumber() {
        return number;
    }
    public ArrayList<Course> getCourseLoad() {
        return currClassList;
    }
    public Boolean checkCourseLoad() {
        return checkClass;
    }
    public ArrayList<String> getQueries(ArrayList<String> queries) {
        return queries;
    }
    public String getFaculty(){
        return faculty;
    }

}
class PartTime extends Faculty {
    public PartTime() {
    }

}
class FullTime extends Faculty {
    public FullTime(){

    }

}
class Chairperson extends Faculty implements com.example.CSDepartment.models.behavioral.observer.Chairperson {

    @Override
    public void update(String status) {
//        needs to update when course seats are too large maybe if not in the query
    }
}