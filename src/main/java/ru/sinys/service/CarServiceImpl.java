package ru.sinys.service;

import org.springframework.stereotype.Component;
import ru.sinys.converter.CarConverter;
import ru.sinys.dto.CarDTO;
import ru.sinys.entity.Car;
import ru.sinys.entity.Engine;
import ru.sinys.entity.Wheel;

import java.util.Arrays;

@Component
public class CarServiceImpl implements CarService {
    private final CarConverter carConverter;

    public CarServiceImpl(CarConverter carConverter) {
        this.carConverter = carConverter;
    }

    @Override
    public CarDTO getCar(Long id) {
        Car car = new Car(id, "Oka");
        car.setActive(true);
        car.setWheels(Arrays.asList(new Wheel(10, "first"), new Wheel(10, "second")));
        car.setEngine(new Engine());
        return carConverter.entityToDto(car);
    }
}
