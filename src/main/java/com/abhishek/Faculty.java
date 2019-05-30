package com.abhishek;

import java.util.Date;

public class Faculty extends  Person {
    private Date joiningDate;
    private String deptName;
    private String designation;
    private float salary;

    public Faculty() {
    }

    public Faculty(Date joiningDate, String deptName, String designation, float salary) {
        this.joiningDate = joiningDate;
        this.deptName = deptName;
        this.designation = designation;
        this.salary = salary;
    }

    public Faculty(int id, String firstName, String lastName, String email, String gender, Date birthday, String computer, Date joiningDate, String deptName, String designation, float salary) {
        super(id, firstName, lastName, email, gender, birthday, computer);
        this.joiningDate = joiningDate;
        this.deptName = deptName;
        this.designation = designation;
        this.salary = salary;
    }

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


    @Override
    public void display() {
        System.out.println("faculty id"+getId());
        System.out.println("First Name"+getFirstName());
        System.out.println("Last Name"+getLastName());
        System.out.println("Full Name"+getfullname());
        System.out.println("email"+getEmail());
        System.out.println("gender"+getGender());
        System.out.println("birthday"+getBirthday());
        System.out.println("computer"+getComputer());
        System.out.println("joining date"+getJoiningDate());
        System.out.println("dept name"+getDeptName());
        System.out.println("designation"+getDesignation());
        System.out.println("salary"+getSalary());


    }
}
