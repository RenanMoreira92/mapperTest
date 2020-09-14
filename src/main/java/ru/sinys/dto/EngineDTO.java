package ru.sinys.dto;

public class EngineDTO {
    private String power;

    public EngineDTO() {
    }

    public EngineDTO(String power) {
        this.power = power;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }
}
