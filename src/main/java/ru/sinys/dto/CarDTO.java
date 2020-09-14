package ru.sinys.dto;

import ru.sinys.entity.Wheel;

import java.util.List;

public class CarDTO {
    private long id;
    private String modelName;
    private Boolean isActive;
    private List<WheelDTO> wheels;
    private EngineDTO engine;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public List<WheelDTO> getWheels() {
        return wheels;
    }

    public void setWheels(List<WheelDTO> wheels) {
        this.wheels = wheels;
    }

    public EngineDTO getEngine() {
        return engine;
    }

    public void setEngine(EngineDTO engine) {
        this.engine = engine;
    }
}
