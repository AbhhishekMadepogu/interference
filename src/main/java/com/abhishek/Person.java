package com.abhishek;

import java.util.Date;

public abstract class Person implements IDisplay{
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private Date birthday;
    private String  computer;

    public Person() {
    }

    public Person(int id, String firstName, String lastName, String email, String gender, Date birthday, String computer) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.birthday = birthday;
        this.computer = computer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getComputer() {
        return computer;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setComputer(String computer) {
        this.computer = computer;
    }

    public String getfullname() {
     return firstName+" "+lastName;
    }


}
