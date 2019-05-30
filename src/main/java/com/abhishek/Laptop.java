package com.abhishek;

public class Laptop extends Computer {
    private int screensize;
    private float weight;

    public Laptop() {
    }

    public Laptop(int screensize, float weight) {
        this.screensize = screensize;
        this.weight = weight;
    }

    public Laptop(int id, String manufacturerName, int screensize, float weight) {
        super(id, manufacturerName);
        this.screensize = screensize;
        this.weight = weight;
    }

    public int getScreensize() {
        return screensize;
    }

    public void setScreensize(int screensize) {
        this.screensize = screensize;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
