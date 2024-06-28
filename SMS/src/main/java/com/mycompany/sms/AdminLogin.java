
package com.mycompany.sms;

import java.awt.*;
import javax.swing.*;

public class Login {
        
     private JFrame log = new JFrame("Log In");
     private JLabel name, pass, title;
     private JTextField tname = new JTextField();
     private JPasswordField pw = new JPasswordField();
     private JButton submit;
    
    public Login() {
        log.setTitle("Student Information");  
        log.setSize(500, 400);
        
        title = new JLabel("Student Manager Log-In");
        title.setFont(new Font("Bell MT", Font.BOLD, 20));
        title.setBounds(110, 5, 500, 100);
        
        name = new JLabel("Name: ");
        name.setBounds(50, 70, 90, 90);
        
        tname.setBounds(130, 100, 200, 25);
        
        pass = new JLabel("Password: ");
        pass.setBounds(50, 100, 90, 90);
        
        pw.setBounds(130, 130, 200, 25);
        
        submit = new JButton("Login");
        submit.setBounds(230, 180, 70, 25);
        
        log.add(title);
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
