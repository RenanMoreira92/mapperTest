package ru.sinys.entity;

public class Wheel {
    private int diameter;
    private String id;

    public Wheel(int diameter, String id) {
        this.diameter = diameter;
        this.id = id;
    }

    public Wheel() {
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
