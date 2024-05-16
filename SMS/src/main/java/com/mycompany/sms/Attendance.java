 
//shanepart
package com.mycompany.sms;
 

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Attendance extends JFrame {
    private JLabel lblName, lblAge, lblStudentnum, lblCourse, lblTitle;
    private JTextField txtfldName = new JTextField();
    private JTextField txtfldAge = new JTextField();
    private JTextField txtfldStudentnum = new JTextField();
    private JTextField txtfldCourse = new JTextField();
    
    private JButton btnPresent;
    private JButton btnAbsent;
    private JButton btnSubmit;
    private JButton btnDelete;
    
    public Attendance() {
        setTitle("Attendance");
        setLayout(null);

        lblTitle = new JLabel("Attendance");
        lblTitle.setBounds(150, 5, 200, 20);
        lblTitle.setFont(new Font("Bell MT", Font.BOLD, 20));
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);

        lblName = new JLabel("Name");
        lblName.setBounds(20, 40, 100, 20);
        lblName.setFont(new Font("Arial", Font.BOLD, 15));

        lblAge = new JLabel("Age");
        lblAge.setBounds(20, 70, 100, 20);
        lblAge.setFont(new Font("Arial", Font.BOLD, 15));

        lblStudentnum = new JLabel("Student No.");
        lblStudentnum.setBounds(20, 100, 100, 20);
        lblStudentnum.setFont(new Font("Arial", Font.BOLD, 15));

        lblCourse = new JLabel("Course");
        lblCourse.setBounds(20, 160, 100, 20);
        lblCourse.setFont(new Font("Arial", Font.BOLD, 15));
        
        

        txtfldName.setBounds(120, 40, 150, 20);
        txtfldName.setFont(new Font("Arial", Font.PLAIN, 15));

        txtfldAge.setBounds(120, 130, 50, 20);
        txtfldAge.setFont(new Font("Arial", Font.PLAIN, 15));

        txtfldStudentnum.setBounds(120, 100, 150, 20);
        txtfldStudentnum.setFont(new Font("Arial", Font.PLAIN, 15));

        txtfldCourse.setBounds(120, 160, 150, 20);
        txtfldCourse.setFont(new Font("Arial", Font.PLAIN, 15));
        
//jamespart
        
        btnPresent = new JButton("Absent");
        btnPresent.setBounds(100, 200, 200, 30);
        btnPresent.setFont(new Font("Arial", Font.BOLD, 15));
        
        btnAbsent = new JButton("Submit");
        btnAbsent.setBounds(100, 200, 200, 30);
        btnAbsent.setFont(new Font("Arial", Font.BOLD, 15));
        
        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(100, 200, 200, 30);
        btnSubmit.setFont(new Font("Arial", Font.BOLD, 15));
        
        btnDelete = new JButton("Submit");
        btnDelete.setBounds(100, 200, 200, 30);
        btnDelete.setFont(new Font("Arial", Font.BOLD, 15));
        

    f.add(lblName);
    f.add(lblAge);
    f.add(lblStudentnum);
    f.add(lblCourse);
    f.add(txtfldName);
    f.add(txtfldStudentnum);
    f.add(txtfldCourse);
    f.add(btnPresent);
    f.add(btnAbsent);
    f.add(btnSubmit);
    f.add(btnDelete);

    setVisible(true);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500, 400);
        

    btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = txtfldName.getText();
                byte age = Byte.parseByte(txtfldAge.getText());
                String studentnum = txtfldStudentnum.getText();
                String course = txtfldCourse.getText();

                System.out.println("Submitted student information: ");
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Studentnum: " + studentnum);
                System.out.println("Course: " + course);
            }
        })
    }


        
        
        
        //james
                
        btnPresent = new JButton("Absent");
        btnPresent.setBounds(100, 200, 200, 30);
        btnPresent.setFont(new Font("Arial", Font.BOLD, 15));
        
        btnAbsent = new JButton("Submit");
        btnAbsent.setBounds(100, 200, 200, 30);
        btnAbsent.setFont(new Font("Arial", Font.BOLD, 15));
        
        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(100, 200, 200, 30);
        btnSubmit.setFont(new Font("Arial", Font.BOLD, 15));
        
        btnDelete = new JButton("Submit");
        btnDelete.setBounds(100, 200, 200, 30);
        btnDelete.setFont(new Font("Arial", Font.BOLD, 15));
        

    f.add(lblName);
    f.add(lblAge);
    f.add(lblStudentnum);
    f.add(lblCourse);
    f.add(txtfldName);
    f.add(txtfldStudentnum);
    f.add(txtfldCourse);
    f.add(btnPresent);
    f.add(btnAbsent);
    f.add(btnSubmit);
    f.add(btnDelete);

    setVisible(true);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500, 400);
        

    btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = txtfldName.getText();
                byte age = Byte.parseByte(txtfldAge.getText());
                String studentnum = txtfldStudentnum.getText();
                String course = txtfldCourse.getText();

                System.out.println("Submitted student information: ");
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Studentnum: " + studentnum);
                System.out.println("Course: " + course);
            }
        })
    }

}
