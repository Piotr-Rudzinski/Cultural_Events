package com.pr.reservation.model;

public class Car {
    private String model;
    private String mark;

    public Car(String model, String mark) {
        this.model = model;
        this.mark = mark;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}
