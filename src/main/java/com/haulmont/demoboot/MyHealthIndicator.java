package com.haulmont.demoboot;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MyHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        if(new Random().nextBoolean()){
            return Health.down().build();
        }
        return Health.up().build();
    }
}
