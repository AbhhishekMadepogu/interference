package com.abhishek;

public class Computer {
    private int id;
    private String manufacturerName;

    public Computer() {
    }

    public Computer(int id, String manufacturerName) {
        this.id = id;
        this.manufacturerName = manufacturerName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }
}
