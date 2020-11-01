package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalTime;

@Configuration
public class CarFactory {

    private String season;
    private String timeOfDay;


    public void getSeason(int month) {
        if (month <= 2 || month == 12) {
            season = "winter";
        } else if (month <= 5) {
            season = "spring";
        } else if (month <= 8) {
            season = "summer";
        } else {
            season = "autumn";
        }
    }

    public void getTime(int hour) {
        if (hour < 20 && hour > 6) {
            timeOfDay = "day";
        } else {
            timeOfDay = "night";
        }
    }

    @Bean
    public LocalDate getLocalDate() {
        return LocalDate.of(2020, 4, 1);
    }

    @Bean
    public LocalTime getLocalTime() {
        return LocalTime.of(2, 0);
    }

    @Bean
    public Car rideACar() {
        getSeason(getLocalDate().getMonthValue());
        getTime(getLocalTime().getHour());
        Car car;
        if (season.equals("winter")) {
            car = new SUV();
        } else if (season.equals("summer")) {
            car = new Cabrio();
        } else {
            car = new Sedan();
        }
        boolean turnOnLights = car.hasHeadlightsTurnedOn(timeOfDay);
        String lights;
        if (turnOnLights) {
            lights = " and turn on the lights.";
        } else {
            lights = " and you don't need to turn on the lights.";
        }
        System.out.println("It's " + season + ". Get " + car.getCarType() + lights);
        return car;
    }
}