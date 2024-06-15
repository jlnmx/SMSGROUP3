package com.mycompany.sms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Admin extends JFrame implements ActionListener {
    private JLabel lblLogin, lblUser, lblPass;
    private JButton btnLogin, btnHome;
    private JTextField txtuser;
    private JPasswordField pass;

    public Admin() {
        // Initialize components
        lblLogin = new JLabel("Admin Login");
        lblUser = new JLabel("Username:");
        lblPass = new JLabel("Password:");
        
        btnLogin = new JButton("Login");
        btnHome = new JButton("Home");

        txtuser = new JTextField();
        pass = new JPasswordField();
        
        txtuser.setBounds(230, 80, 150, 30);
        pass.setBounds(230, 130, 150, 30);

      
        lblLogin.setBounds(250, 30, 100, 30);
        lblUser.setBounds(150, 80, 80, 30);
        lblPass.setBounds(150, 130, 80, 30);
        
        txtuser.setBounds(230, 80, 150, 30);
        pass.setBounds(230, 130, 150, 30);
        
        btnLogin.setBounds(200, 200, 100, 30);
        btnHome.setBounds(320, 200, 100, 30);

        // Add components to the frame
        add(lblLogin);
        add(lblUser);
        add(lblPass);
        add(txtuser);
        add(pass);
        add(btnLogin);
        add(btnHome);

        // Set frame properties
        setTitle("Administrative Mode");
        setLayout(null);
        setSize(600, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        
       btnLogin.addActionListener(this);
        btnHome.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLogin) {
            String username = txtuser.getText();
            String password = new String(pass.getPassword());

            if (validateLogin(username, password)) {
                dispose();
                new DatabaseManager().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password.", "Login Failed", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == btnHome) {
                dispose();
            new Menu().setVisible(true);
        }
    }

    private boolean validateLogin(String username, String password) {
        
        return "admin".equals(username) && "admin".equals(password);
    }

    }
            
    
    

