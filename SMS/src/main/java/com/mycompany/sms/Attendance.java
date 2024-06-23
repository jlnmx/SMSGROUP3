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

        
        btnBack =  new JButton("Back");
        btnBack.setBounds(350,250,100,30);
        btnBack.setFont(new Font("Arial", Font.BOLD,15));
        btnBack.addActionListener(this); 

     
        
        
        JPanel panel = new JPanel();
        String[] items = {"Absent", "Present"};
        cmbAttend = new JComboBox(items);
        cmbAttend.setBounds(120, 100, 70, 20);
        panel.add(cmbAttend);
        
        add(panel);
        add(lblReason);
        add(lblStatus);
        add(lblTitle);
        add(txtfldReason);
        add(btnSubmit);
        add(btnBack);
        add(cmbAttend);
        
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnBack) {
            dispose();
            Menu m = new Menu();
            m.setVisible(true);
            
        } else if (e.getSource() == btnSubmit) {
            dispose();
            Grades gr = new Grades();
            gr.setVisible(true);
        }    
    }        
   
}