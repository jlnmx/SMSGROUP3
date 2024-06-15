package com.mycompany.sms;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;

public class AdminRegister extends JFrame implements ActionListener {
    private JLabel lblTitle, lblUser, lblPass, lblConfirmPass;
    private JTextField txtUser;
    private JPasswordField txtPass, txtConfirmPass;
    private JButton btnSignUp, btnBack;

    public AdminRegister() {
        
        lblTitle = new JLabel("Admin Sign-Up");
        lblUser = new JLabel("Username:");
        lblPass = new JLabel("Password:");
        lblConfirmPass = new JLabel("Confirm Password:");

        txtUser = new JTextField();
        txtPass = new JPasswordField();
        txtConfirmPass = new JPasswordField();

        btnSignUp = new JButton("Sign Up");
        btnBack = new JButton("Back");

        // Set bounds (x, y, width, height)
        lblTitle.setBounds(200, 30, 150, 30);
        lblTitle.setFont(new Font("Arial", Font.BOLD, 20));

        lblUser.setBounds(100, 80, 100, 30);
        lblPass.setBounds(100, 130, 100, 30);
        lblConfirmPass.setBounds(100, 180, 150, 30);

        txtUser.setBounds(250, 80, 150, 30);
        txtPass.setBounds(250, 130, 150, 30);
        txtConfirmPass.setBounds(250, 180, 150, 30);

        btnSignUp.setBounds(200, 250, 100, 30);
        btnBack.setBounds(320, 250, 100, 30);

        
        add(lblTitle);
        add(lblUser);
        add(txtUser);
        add(lblPass);
        add(txtPass);
        add(lblConfirmPass);
        add(txtConfirmPass);
        add(btnSignUp);
        add(btnBack);

    
        setTitle("Admin Sign-Up");
        setLayout(null);
        setSize(500, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        btnSignUp.addActionListener(this);
        btnBack.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSignUp) {
            String username = txtUser.getText();
            String password = new String(txtPass.getPassword());
            String confirmPassword = new String(txtConfirmPass.getPassword());
            dispose();
            DatabaseManager db = new DatabaseManager();
           db.setVisible(true);

            if (password.equals(confirmPassword)) {
                if (registerAdmin(username, password)) {
                    JOptionPane.showMessageDialog(this, "Admin registered successfully!");
                    this.dispose();
                    new Admin().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "Username already exists or registration failed.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Passwords do not match.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == btnBack) {
            dispose();
            Menu menu = new Menu();
            menu.setVisible(true);
        }
    }

    private boolean registerAdmin(String username, String password) {
        String url = "jdbc:mysql://localhost:3306/your_database";
        String user = "username";
        String pass = "password";
        String queryCheck = "SELECT * FROM admin WHERE username = ?";
        String queryInsert = "INSERT INTO admin (username, password) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, pass);
             PreparedStatement stmtCheck = conn.prepareStatement(queryCheck);
             PreparedStatement stmtInsert = conn.prepareStatement(queryInsert)) {

            // Check if username already exists
            stmtCheck.setString(1, username);
            ResultSet rs = stmtCheck.executeQuery();
            if (rs.next()) {
                return false; // Username already exists
            }

            // Insert new admin
            stmtInsert.setString(1, username);
            stmtInsert.setString(2, password);
            stmtInsert.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
