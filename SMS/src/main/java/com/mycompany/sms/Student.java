package com.mycompany.sms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student extends JFrame {
    private JLabel lblName, lblStudentnum, lblAge, lblCourse;
    private JTextField txtfldName = new JTextField();
    private JTextField txtfldStudentnum = new JTextField();
    private JTextField txtfldAge = new JTextField();
    private JTextField txtfldCourse = new JTextField();
    private JButton btnSubmit;

    public Student() {
        setTitle("Student Information");
        setLayout(null);

        lblName = new JLabel("Name");
        lblName.setBounds(20, 20, 100, 20);
        lblName.setFont(new Font("Arial", Font.BOLD, 15));

        lblStudentnum = new JLabel("Student No.");
        lblStudentnum.setBounds(20, 50, 100, 20);
        lblStudentnum.setFont(new Font("Arial", Font.BOLD, 15));

        lblAge = new JLabel("Age");
        lblAge.setBounds(20, 80, 100, 20);
        lblAge.setFont(new Font("Arial", Font.BOLD, 15));

        lblCourse = new JLabel("Course");
        lblCourse.setBounds(20, 110, 100, 20);
        lblCourse.setFont(new Font("Arial", Font.BOLD, 15));

        txtfldName.setBounds(120, 20, 150, 20);
        txtfldName.setFont(new Font("Arial", Font.PLAIN, 15));

        txtfldStudentnum.setBounds(120, 50, 150, 20);
        txtfldStudentnum.setFont(new Font("Arial", Font.PLAIN, 15));

        txtfldAge.setBounds(120, 80, 50, 20);
        txtfldAge.setFont(new Font("Arial", Font.PLAIN, 15));

        txtfldCourse.setBounds(120, 110, 150, 20);
        txtfldCourse.setFont(new Font("Arial", Font.PLAIN, 15));

        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(100, 150, 200, 30);
        btnSubmit.setFont(new Font("Arial", Font.BOLD, 15));

        add(lblName);
        add(lblStudentnum);
        add(lblAge);
        add(lblCourse);
        add(txtfldName);
        add(txtfldStudentnum);
        add(txtfldAge);
        add(txtfldCourse);
        add(btnSubmit);

        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);

        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String studentnum = txtfldStudentnum.getText();
                String name = txtfldName.getText();
                byte age = Byte.parseByte(txtfldAge.getText());
                String course = txtfldCourse.getText();

                System.out.println("Submitted student information: ");
                System.out.println("Student Number: " + studentnum);
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Course: " + course);
            }
        });
    }

   
}
