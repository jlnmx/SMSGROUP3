package com.mycompany.sms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Attendance extends JFrame implements ActionListener{
    private JLabel lblStatus, lblReason, lblTitle;
    private JTextField txtfldReason; 
    private JButton btnSubmit; 
    private JButton btnBack;
    private JComboBox<String> cmbAttend;
    
    public Attendance() {
        setTitle("Attendance");
        setSize(500, 400);
        setLayout(null);
        
        lblTitle = new JLabel("Attendance");
        lblTitle.setBounds(150, 60, 200, 20);
        lblTitle.setFont(new Font("Arial", Font.BOLD, 20));
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);

        lblStatus = new JLabel("Status");
        lblStatus.setBounds(40, 100, 100, 20);
        lblStatus.setFont(new Font("Arial", Font.BOLD, 15));

        lblReason = new JLabel("Reason");
        lblReason.setBounds(40, 130, 100, 20);
        lblReason.setFont(new Font("Arial", Font.BOLD, 15));
        
        txtfldReason = new JTextField();
        txtfldReason.setBounds(120, 130, 150, 20);
        txtfldReason.setFont(new Font("Arial", Font.PLAIN, 15));
     
        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(350, 250, 100, 30);
        btnSubmit.setFont(new Font("Arial", Font.BOLD, 15));
        btnBack.addActionListener(this); 

        
    