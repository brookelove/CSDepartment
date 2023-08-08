package com.example.CSDepartment.models.creational.abstractfactory;

public class DegreeProgramFactory implements ProgramFactory{
    @Override
    public Program createProgram() {
        return new Degree();
    }
}