package com.thejavagypsy.tddsample.domain;

import lombok.Data;

@Data
public class Car {

    private String name;
    private String type;


    public Car(String name, String type) {
        this.name = name;
        this.type = type;
    }
}
