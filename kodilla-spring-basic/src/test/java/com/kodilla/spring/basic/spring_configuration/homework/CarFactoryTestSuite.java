package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


class CarFactoryTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");

    @Test
    public void shouldReturnTrueIfTimeOfDayIsNight() {
        // Given
        Car car = context.getBean(Car.class);
        // When
        boolean lights = car.hasHeadlightsTurnedOn("night");
        // Then
        Assertions.assertTrue(lights);
    }

    @Test
    public void shouldReturnProperCarDependingOnSeason() {
        // Given
        CarFactory car = context.getBean(CarFactory.class);
        // When
        Car carSelect = car.rideACar();
        // Then
        Assertions.assertEquals("Sedan", carSelect.getCarType());
    }
}