package ru.sinys.dto;

public class WheelDTO {
    private int diameter;
    private String id;


    public WheelDTO() {
    }

    public WheelDTO(int diameter, String model) {
        this.diameter = diameter;
        this.id = model;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
