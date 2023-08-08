package com.example.CSDepartment.models.creational.abstractfactory;

public class CertificateProgramFactory implements ProgramFactory {
    @Override
    public Program createProgram() {
        return new Certificate();
    }
}