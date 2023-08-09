package com.example.CSDepartment.models.structural.decorator;

import com.example.CSDepartment.models.common.Course;

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
abstract class BasicFaculty implements Faculty {
    protected String name;
    protected String email;
    protected String number;
    protected Integer courseCap;
    protected ArrayList<Course> courseList;
    protected ArrayList<String> queryList;
    public BasicFaculty(String name, String email, String number, Integer courseCap, ArrayList<Course> courseList, ArrayList<String> queryList){
        this.name = name;
        this.email = email;
        this.number = number;
        this.courseCap = courseCap;
        this.courseList = courseList;
        this.queryList = queryList;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public FacultyType getFacultyType() {
        return FacultyType.Faculty;
    }
    @Override
    public ArrayList<Course> getCourseLoad() {
        return courseList;
    }

    @Override
    public Boolean checkCourseLoad() {
        return courseList.size() >= courseCap;
    }

    @Override
    public ArrayList<String> getQueries() {
        return queryList;
    }
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