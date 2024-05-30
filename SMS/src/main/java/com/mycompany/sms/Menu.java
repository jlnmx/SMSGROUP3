package com.mycompany.sms;

import java.awt.*;
import javax.swing.*;


public class Menu extends JFrame{
    private JLabel lblTitle, lblQuestion;
    private JButton btnStudent, btnAdmin;
    
    public Menu(){
        
      setLayout(null);  

        lblTitle = new JLabel("Student Management System");
        lblTitle.setFont(new Font("Bell MT", Font.BOLD, 24));
        lblTitle.setBounds(150, 50, 400, 60);  

        lblQuestion = new JLabel("Are You A?");
        lblQuestion.setFont(new Font("Bell MT", Font.BOLD, 20));
        lblQuestion.setBounds(250, 100, 200, 60);  

        btnStudent = new JButton("Student");
        btnStudent.setBounds(150, 200, 100, 50);  

        btnAdmin = new JButton("Admin");
        btnAdmin.setBounds(350, 200, 100, 50); 

        add(lblTitle);
        add(lblQuestion);
        add(btnStudent);
        add(btnAdmin);

        setTitle("Student Management System");
        setSize(600, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
       
    }
}
