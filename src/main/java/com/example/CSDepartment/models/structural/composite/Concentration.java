package com.example.CSDepartment.models.structural.composite;

import java.util.ArrayList;

public class Concentration implements ConcentrationComponent{
    private String description;
    private ArrayList<ConcentrationComponent> components = new ArrayList<>();
    public Concentration(String description) {
        this.description = description;
    }
    public void addComponent(ConcentrationComponent component) {
        components.add(component);
    }
    public String getDescription() {
        return description;
    }
    public String format() {
        StringBuilder formattedOutput = new StringBuilder();
//        need to implement the use of the code from here to actually generate the HTML output
        return formattedOutput.toString();
    }
}