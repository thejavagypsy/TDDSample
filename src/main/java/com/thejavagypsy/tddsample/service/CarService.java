package com.thejavagypsy.tddsample.service;

import com.thejavagypsy.tddsample.domain.Car;
import org.springframework.stereotype.Component;

@Component
public class CarService {
    public Car getCarDetails(String name) {
        return new Car("prius","hybrid");
    }
}
