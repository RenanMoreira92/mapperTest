package ru.sinys.entity;

import java.util.List;

public class Car {
    private long id;
    private String model;
    private Boolean isActive;
    private List<Wheel> wheels;
//    private Engine engine;


    public Car(long id, String model) {
        this.id = id;
        this.model = model;
    }

    public Car() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }
}
