package com.mycompany.sms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student extends JFrame {
    private JLabel lblSurname, lblFirstname, lblStudentnum, lblAge, lblCourse, lblTitle;
    private JTextField txtfldSurname = new JTextField();
    private JTextField txtfldFirstname = new JTextField();
    private JTextField txtfldStudentnum = new JTextField();
    private JTextField txtfldAge = new JTextField();
    private JTextField txtfldCourse = new JTextField();
    private JButton btnSubmit;
    
    public Student() {
        setTitle("Student Information");
        setLayout(null);

        lblTitle = new JLabel("Student Manager");
        lblTitle.setBounds(150, 5, 200, 20);
        lblTitle.setFont(new Font("Bell MT", Font.BOLD, 20));
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);

        lblSurname = new JLabel("Surname");
        lblSurname.setBounds(20, 40, 100, 20);
        lblSurname.setFont(new Font("Arial", Font.BOLD, 15));

        lblFirstname = new JLabel("First Name");
        lblFirstname.setBounds(20, 70, 100, 20);
        lblFirstname.setFont(new Font("Arial", Font.BOLD, 15));

        lblStudentnum = new JLabel("Student No.");
        lblStudentnum.setBounds(20, 100, 100, 20);
        lblStudentnum.setFont(new Font("Arial", Font.BOLD, 15));

        lblAge = new JLabel("Age");
        lblAge.setBounds(20, 130, 100, 20);
        lblAge.setFont(new Font("Arial", Font.BOLD, 15));

        lblCourse = new JLabel("Course");
        lblCourse.setBounds(20, 160, 100, 20);
        lblCourse.setFont(new Font("Arial", Font.BOLD, 15));

        txtfldSurname.setBounds(120, 40, 150, 20);
        txtfldSurname.setFont(new Font("Arial", Font.PLAIN, 15));

        txtfldFirstname.setBounds(120, 70, 150, 20);
        txtfldFirstname.setFont(new Font("Arial", Font.PLAIN, 15));

        txtfldStudentnum.setBounds(120, 100, 150, 20);
        txtfldStudentnum.setFont(new Font("Arial", Font.PLAIN, 15));

        txtfldAge.setBounds(120, 130, 50, 20);
        txtfldAge.setFont(new Font("Arial", Font.PLAIN, 15));

        txtfldCourse.setBounds(120, 160, 150, 20);
        txtfldCourse.setFont(new Font("Arial", Font.PLAIN, 15));

        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(100, 200, 200, 30);
        btnSubmit.setFont(new Font("Arial", Font.BOLD, 15));

        add(lblTitle);
        add(lblSurname);
        add(lblFirstname);
        add(lblStudentnum);
        add(lblAge);
        add(lblCourse);
        add(txtfldSurname);
        add(txtfldFirstname);
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
                String surname = txtfldSurname.getText();
                String firstname = txtfldFirstname.getText();
                byte age = Byte.parseByte(txtfldAge.getText());
                String course = txtfldCourse.getText();

                System.out.println("Submitted student information: ");
                System.out.println("Student Number: " + studentnum);
                System.out.println("Surname: " + surname);
                System.out.println("First Name: " + firstname);
                System.out.println("Age: " + age);
                System.out.println("Course: " + course);
            }
        });
    }
}
 