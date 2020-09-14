package ru.sinys.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.sinys.dto.CarDTO;
import ru.sinys.service.CarService;

@RestController
public class TestController {
    private final CarService carService;

    public TestController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/car/{id}")
    public CarDTO getCar(
            @PathVariable Long id
    ){
        return carService.getCar(id);
    }
}
