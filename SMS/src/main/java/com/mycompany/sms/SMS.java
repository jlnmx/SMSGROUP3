/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sms;

/**
 *
 * @author saban
 */
public class SMS {

    public static void main(String[] args) {
        
        Student student = new Student("2022-00282-BN-0", "Jullian Maxxi B. Sabando", (byte) 20, "Diploma in Information Technology");

        System.out.println("Student number: " + student.getStudent_num());
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.setAge());
        System.out.println("Course: " + student.getCourse());
       
        Attendance attendance = new Attendance(student.getName(), student.getStudent_num(), true);

   
        System.out.println("Student name: " + attendance.getName());
        System.out.println("Student number: " + attendance.getStudent_num());
        System.out.println("Present: " + attendance.getPresent());
    }
}
   

    

