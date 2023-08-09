package com.example.CSDepartment.models.structural.composite;

class Course implements ConcentrationComponent{
    private String description;
    private String syllabus;
    public Course(String description, String syllabus){
        this.description = description;
        this.syllabus = syllabus;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String format() {
        return syllabus; // this has to be created in HTML format
    }
}