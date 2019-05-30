package com.abhishek;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Inheritance
{
    public static void main(String [] args) throws ParseException {
        Student s1= new Student();





        Faculty f1=new Faculty();


        s1.setId(1);
        s1.setFirstName("abhishek");
        s1.setLastName("Madepogu");
        s1.setEmail("abhishek.madepogu@gmail.com");
        s1.setCourseName("Mobile Application Design and Development");
        s1.setGender("male");
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/mm/dd");
        String dateinstring="1997/05/10";
        Date date=sdf.parse(dateinstring);
        s1.setBirthday(date);
        s1.setComputer("Laptop");
        float marks[]={50,60,70,80};
        s1.setMarks(marks);
        s1.display();


        f1.setId(2);
        f1.setFirstName("pritesh");
        f1.setLastName("patel");
        f1.setEmail("priteshpatel@gmail.com");
        f1.setGender("male");
        SimpleDateFormat sdf3=new SimpleDateFormat("yyyy/mm/dd");
        String dateinString="1997/05/10";
         date=sdf3.parse(dateinstring);
         f1.setBirthday(date);
        f1.setComputer("laptop");
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy/mm/dd");
        String dateInString="2017/12/15";
        date = sdf1.parse(dateInString);
        f1.setDeptName("computer science");
        f1.setDesignation("professor");
        f1.setSalary(70000.00f);
        f1.display();





    }
}
