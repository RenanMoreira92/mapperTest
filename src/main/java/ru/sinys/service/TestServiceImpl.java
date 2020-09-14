package ru.sinys.service;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class TestServiceImpl implements TestService {
    private final Random random = new Random();

    @Override
    public String getPower() {
        return "Power: " + random.nextInt(100);
    }
}
