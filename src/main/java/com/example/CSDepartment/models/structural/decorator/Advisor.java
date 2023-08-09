package com.example.CSDepartment.models.structural.decorator;

import com.example.CSDepartment.models.common.Course;

import java.util.ArrayList;
public abstract class Advisor implements Faculty{
    Faculty faculty;
    private String advisorType;
    public abstract String getAdvisorType();
}
class Undergraduate extends Advisor{
    Faculty faculty;
    private String advisorType;
    private String name;
    private String email;
    public Undergraduate(Faculty faculty, String advisorType) {
        this.faculty = faculty;
        this.advisorType = advisorType;
    }
    public String getAdvisorType(){
        return "Undergraduate";
    };

    @Override
    public String getName() {
        return faculty.getName();
    }

    @Override
    public String getEmail() {
        return faculty.getEmail();
    }

    @Override
    public String getNumber() {
        return faculty.getNumber();
    }

    @Override
    public FacultyType getFacultyType() {
        return faculty.getFacultyType();
    }

    @Override
    public ArrayList<Course> getCourseLoad() {
        return faculty.getCourseLoad();
    }

    @Override
    public Boolean checkCourseLoad() {
        return faculty.checkCourseLoad();
    }

    @Override
    public ArrayList<String> getQueries() {
        return faculty.getQueries();
    }
}
class Graduate extends Advisor{
    Faculty faculty;
    private String advisorType;
    private String name;
    private String email;
    public Graduate(Faculty faculty, String advisorType) {
        this.faculty = faculty;
        this.advisorType = advisorType;
    }
    public String getAdvisorType(){
        return "Graduate";
    };

    @Override
    public String getName() {
        return faculty.getName();
    }

    @Override
    public String getEmail() {
        return faculty.getEmail();
    }

    @Override
    public String getNumber() {
        return faculty.getNumber();
    }

    @Override
    public FacultyType getFacultyType() {
        return faculty.getFacultyType();
    }

    @Override
    public ArrayList<Course> getCourseLoad() {
        return faculty.getCourseLoad();
    }

    @Override
    public Boolean checkCourseLoad() {
        return faculty.checkCourseLoad();
    }

    @Override
    public ArrayList<String> getQueries() {
        return faculty.getQueries();
    }

}