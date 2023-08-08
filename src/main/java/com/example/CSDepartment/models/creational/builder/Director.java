package com.example.CSDepartment.models.creational.builder;

class Director {
    Builder builder;
    public void construct(Builder builder){
        this.builder = builder;
        builder.createCourse();
        builder.createName();
        builder.createDescription();
        builder.createSyllabus();
    }
}