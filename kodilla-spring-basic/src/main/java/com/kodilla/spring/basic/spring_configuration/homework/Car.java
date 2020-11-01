package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;

public interface Car {

    @Bean
    boolean hasHeadlightsTurnedOn(String timeOfDay);

    @Bean
    String getCarType();
}