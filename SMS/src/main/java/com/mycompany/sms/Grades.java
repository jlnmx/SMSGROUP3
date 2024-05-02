/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sms;

/**
 *
 * @author saban
 */
public class Grades {
    private String name;
    private String studentnum;
    private String course;
    private double grades;
    
    public void Grades(String name, String studentnum, String course, double grades){
        this.name = name;
        this.studentnum = studentnum;
        this.course = course;
        this.grades = grades;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public void setStudentnum(String studentnum){
        this.studentnum = studentnum;
        
    }
    public void setCourse(String course){
        this.course = course;  
        
    }
    public void setGrades(double grades){
        this.grades = grades;
        
    }
    public String getName(String name){
        return name;
        
    }  
    public String getStudentnum(String studentnum){
        return studentnum;
        
    }
    public String getCourse(String course){
        return course;
    
    }
    public double getGrades(double grades){
        return grades;
        
    }
    public void display() {
        System.out.println(name + ":" + studentnum + ":" + course + ":" + grades + ":");
    }
}