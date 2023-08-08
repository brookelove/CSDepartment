package com.example.CSDepartment.models.creational.abstractfactory;

import com.example.CSDepartment.models.common.Course;

import java.util.ArrayList;

interface Program {
    public String getProgramType( );
    public void getCoreCourses();
    public Integer getProgramYears();


}