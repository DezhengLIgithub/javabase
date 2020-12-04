package com.para.springlearn.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

public class Car {

    private String serialNum;

    private String brand;

    public String getSerialNum() {
        return serialNum;
    }
    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
