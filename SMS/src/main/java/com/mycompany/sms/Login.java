
package com.mycompany.sms;

import java.awt.Font;
import javax.swing.*;

public class Login {
        
     private JFrame log = new JFrame("Log In");
     private JLabel admin, name, pass;
     private JTextField tname = new JTextField();
     private JPasswordField pw = new JPasswordField();
     private JButton submit;
    
    public Login() {
        
     
        log.setSize(500, 400);
        
        admin = new JLabel("Admin Login ");
        admin.setFont(new Font("Arial", Font.BOLD, 20));
        admin.setBounds(170, 5, 150, 100);
        
        name = new JLabel("Name: ");
        name.setBounds(50, 70, 90, 90);
        
        tname.setBounds(130, 100, 170, 25);
        
        pass = new JLabel("Password: ");
        pass.setBounds(50, 100, 90, 90);
        
        pw.setBounds(130, 130, 170, 25);
        
        submit = new JButton("Login");
        submit.setBounds(230, 180, 70, 25);
        
        log.add(admin);
        log.add(name);
        log.add(tname);
        log.add(pass);
        log.add(pw);
        log.add(submit);
        
        log.setLayout(null);            
        log.setVisible(true);
        log.setResizable(false);
        log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}