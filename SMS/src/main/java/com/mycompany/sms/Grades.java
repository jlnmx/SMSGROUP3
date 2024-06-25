package com.mycompany.sms;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Grades extends JFrame implements ActionListener {
    
    private JLabel lblStudID, lblSubject, lblSurName, lblFirstName, lblFinal, lblMidterm;
    
    private JTextField txtfldStudID = new JTextField();
    private JTextField txtfldSurName = new JTextField();
    private JTextField txtfldFirstName = new JTextField();
    private JTextField txtfldSubject = new JTextField();        
    private JTextField txtfldMidterm = new JTextField();
    private JTextField txtfldFinal = new JTextField();
    
    private JButton btnResult;
    private JButton btnClear;
    private JButton btnBack;
    
    private JTextArea txtareaLoginResults = new JTextArea();

    Grades() {
        setTitle("Student Grades");
        setSize(800, 1000);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Labels
        lblStudID = new JLabel("StudentID:");
        lblStudID.setBounds(20, 40, 200, 40);
        lblStudID.setFont(new Font("Arial", Font.BOLD, 30));

        lblSurName = new JLabel("Surname:");
        lblSurName.setBounds(20, 90, 200, 40);
        lblSurName.setFont(new Font("Arial", Font.BOLD, 30));

        lblFirstName = new JLabel("Firstname:");
        lblFirstName.setBounds(20, 140, 200, 40);
        lblFirstName.setFont(new Font("Arial", Font.BOLD, 30));

        lblSubject = new JLabel("Subject:");
        lblSubject.setBounds(20, 190, 200, 40);
        lblSubject.setFont(new Font("Arial", Font.BOLD, 30));

        lblMidterm = new JLabel("Midterm:");
        lblMidterm.setBounds(20, 250, 200, 40);
        lblMidterm.setFont(new Font("Arial", Font.BOLD, 30));

        lblFinal = new JLabel("Finals:");
        lblFinal.setBounds(20, 300, 200, 40);
        lblFinal.setFont(new Font("Arial", Font.BOLD, 30));

        // Text fields
        txtfldStudID.setBounds(240, 40, 250, 40);
        txtfldStudID.setFont(new Font("Arial", Font.BOLD, 30));

        txtfldSurName.setBounds(240, 90, 250, 40);
        txtfldSurName.setFont(new Font("Arial", Font.BOLD, 30));

        txtfldFirstName.setBounds(240, 140, 250, 40);
        txtfldFirstName.setFont(new Font("Arial", Font.BOLD, 30));

        txtfldSubject.setBounds(240, 190, 250, 40);
        txtfldSubject.setFont(new Font("Arial", Font.BOLD, 30));

        txtfldMidterm.setBounds(240, 250, 250, 40);
        txtfldMidterm.setFont(new Font("Arial", Font.BOLD, 30));

        txtfldFinal.setBounds(240, 300, 250, 40);
        txtfldFinal.setFont(new Font("Arial", Font.BOLD, 30));

        // Buttons
        btnResult = new JButton("Result");
        btnResult.setBounds(20, 750, 200, 30);
        btnResult.setFont(new Font("Arial", Font.BOLD, 30));
        btnResult.addActionListener(this);
        btnResult.setBackground(Color.green);

        
        btnClear = new JButton("Clear");
        btnClear.setBounds(290, 750, 200, 30);
        btnClear.setFont(new Font("Arial", Font.BOLD, 30));
        btnClear.addActionListener(this); 
        btnClear.setBackground(Color.red);

        btnBack = new JButton("Back");
        btnBack.setBounds(570, 750, 200, 30);
        btnBack.setFont(new Font("Arial", Font.BOLD, 30));
        btnBack.addActionListener(this); 

        txtareaLoginResults.setFont(new Font("Arial", Font.BOLD, 20));
        txtareaLoginResults.setBounds(20, 350, 600, 390);
        txtareaLoginResults.setEditable(false);
       
        
        add(lblStudID);
        add(lblSurName);
        add(lblFirstName);
        add(lblSubject);
        add(lblMidterm);
        add(lblFinal);

        add(txtfldStudID);
        add(txtfldSurName);
        add(txtfldFirstName);
        add(txtfldSubject);
        add(txtfldMidterm);
        add(txtfldFinal);

        add(btnResult);
        add(btnClear);
        add(btnBack); 
        add(txtareaLoginResults);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnBack) {
            dispose();
            Attendance at = new Attendance();
            at.setVisible(true);  
        } 
            
        else if (e.getSource() == btnClear) {
            // Clear all text fields
            txtfldStudID.setText("");
            txtfldSurName.setText("");
            txtfldFirstName.setText("");
            txtfldSubject.setText("");
            txtfldMidterm.setText("");
            txtfldFinal.setText("");
            txtareaLoginResults.setText("");    
        } 
            
        else if (e.getSource() == btnResult) {
            try {
                String studentID = txtfldStudID.getText();
                String surname = txtfldSurName.getText();
                String firstname = txtfldFirstName.getText();
                String subject = txtfldSubject.getText();
                
                double midterm = Double.parseDouble(txtfldMidterm.getText());
                double finals = Double.parseDouble(txtfldFinal.getText());
                double average = (midterm + finals) / 2;

                String remarks;
                
                if (average <= 3.0) {
                    remarks = "Passed";
                } 
                    
                else {
                    remarks = "Failed";
                }

                txtareaLoginResults.setText("Student ID: " + studentID 
                                            + "\nSurname: " + surname 
                                            + "\nFirstname: " + firstname 
                                            + "\nSubject: " + subject 
                                            + "\n\nMidterm Grade: " + midterm 
                                            + "\nFinal Grade: " + finals 
                                            + "\n\nAverage Grade: " + average 
                                            + "\nRemarks: " + remarks);
                
                } 
            catch (NumberFormatException ex) {
            }
        }
    }

   
    }

