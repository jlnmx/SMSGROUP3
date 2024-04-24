package com.mycompany.sms;


public class Student {

    public Student(String bN0, String jullian_Maxxi_B_Sabando, byte par, String diploma_in_Information_Technology) {
    }
    String student_num;
    String name;
    byte age;
    String course;

   
    
    public void Student(String student_num, String name, byte age, String course){
        this.student_num = student_num;
        this.name = name;
        this.age = age;
        this.course = course;
        
    }
    
    public void setStudent_num(String student_num){
        this.student_num = student_num;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(byte age){
        this.age = age;
    }
    public void setCourse(String course){
        this.course = course;
    }
    public String getName(){
        return name;
    }
    public String getStudent_num(){
        return student_num;
    }
    public byte setAge(){
        return age;
    }
    public String getCourse(){
        return course;
    }

}
