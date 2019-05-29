package com.abhishek;

public  class Student extends Person {
   private String courseName;
    private float total;
    private float percentage;
    private String result;
    private float marks[];

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public float getTotal() {
        return  total;
    }




    public float getPercentage() {
        return percentage;
    }




    public String getResult() {
        return result;
    }



    public float[] getMarks() {
        return marks;
    }

    public void setMarks(float[] marks) {
        this.marks = marks;
    }
    public void calctotal()
    {
        this.total = 0;
        System.out.println(marks[0]);
        for(int i=0; i<this.marks.length; i++)
        {
            this.total =this.total +marks[i];
        }
    }
    public void calcper()
    {
        this.percentage = 0;
        percentage = this.total / this.marks.length;
    }
    public void calculateresult() {
        int passedSubj = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 50.0f) {
                passedSubj++;
            }
        }
        if (passedSubj <= 2) {
            this.result = "Fail";
        } else {
            if (this.percentage >= 94) {
                this.result = "A+";
            } else if (this.percentage > 87) {
                this.result = "A";
            } else if (this.percentage > 80) {
                this.result = "A-";
            } else if (this.percentage > 77) {
                this.result = "B+";
            } else if (this.percentage > 73) {
                this.result = "B";
            } else if (this.percentage > 70) {
                this.result = "B-";
            } else if (this.percentage > 67) {
                this.result = "C+";
            } else if (this.percentage > 63) {
                this.result = "c";
            } else if (this.percentage > 60) {
                this.result = "c-";
            } else if (this.percentage > 50) {
                this.result = "D";
            } else {
                this.result = "E";
            }
        }
    }


    @Override
    public void display() {

    }
}
