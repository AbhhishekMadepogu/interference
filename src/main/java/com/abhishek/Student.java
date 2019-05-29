package com.abhishek;

public class Student extends Person {
   private String courseName;
    private int total;
    private float percentage;
    private float result;
    private float marks[];

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public float getPercentage() {
        return percentage;
    }




    public float getResult() {
        return result;
    }



    public float[] getMarks() {
        return marks;
    }

    public void setMarks(float[] marks) {
        this.marks = marks;
    }
}
