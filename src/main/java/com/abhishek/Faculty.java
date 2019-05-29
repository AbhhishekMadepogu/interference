package com.abhishek;

import java.util.Date;

public class Faculty extends  Person {
    private Date joiningDate;
    private String deptName;
    private String designation;
    private float salary;

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary, double v) {
        this.salary = salary;
    }
}
