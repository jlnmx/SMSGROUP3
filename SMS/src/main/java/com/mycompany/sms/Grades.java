package com.mycompany.sms;

import java.awt.Font;
import javax.swing.*;


public class  Grades extends JFrame{
   
    
    private JLabel lblGrades,lblSubject,lblName ,lblFinal,lblMidterm;
    
    private JTextField txtfldName = new JTextField();
    private JTextField txtfldSubject = new JTextField();        
    private JTextField txtfldMidterm = new JTextField();
    private JTextField txtfldFinal = new JTextField();
    

    private JButton btnCompute;
    private JButton btnClear;
    private JButton btnBack;
    
    private JTextArea txtareaLoginResults = new JTextArea();

    Grades (){

        setTitle("Grades");
        setSize(500,500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
    lblGrades = new JLabel("GRADES");
    lblGrades.setBounds(200 ,1, 250, 150);
    lblGrades.setFont(new Font("Arial", Font.BOLD, 20)); 
          
    lblName = new JLabel("Name:");
    lblName.setBounds(50, 160, 200, 20);
    lblName.setFont(new Font("Arial", Font.BOLD, 15)); 
    
    lblSubject = new JLabel("Subject:");
    lblSubject.setBounds(50, 190, 200, 20);
    lblSubject.setFont(new Font("Arial", Font.BOLD, 15)); 
    
    lblMidterm = new JLabel("Midterm:");
    lblMidterm.setBounds(50 ,220, 200, 20);
    lblMidterm.setFont(new Font("Arial", Font.BOLD, 15)); 
   
    lblFinal = new JLabel("Finals:");
    lblFinal.setBounds(50 ,250, 200, 20);
    lblFinal.setFont(new Font("Arial", Font.BOLD, 15));
    
    
    txtfldName.setBounds(150, 160, 200,20);
    txtfldName.setFont(new Font("Arial", Font.BOLD, 15));
    
    txtfldSubject.setBounds(150,190, 200,20);
    txtfldSubject.setFont(new Font("Arial", Font.BOLD, 15));
    
    txtfldMidterm.setBounds(150,220, 100,20);
    txtfldMidterm.setFont(new Font("Arial", Font.BOLD, 15));
     
    txtfldFinal.setBounds(150, 250, 100,20);
    txtfldFinal.setFont(new Font("Arial", Font.BOLD, 15));
    
    
    
    btnCompute = new JButton("Compute");
    btnCompute.setBounds(30, 350, 130, 30);
    btnCompute.setFont(new Font("Arial", Font.BOLD, 15));
    
    btnClear = new JButton("Clear");
    btnClear.setBounds(200, 350, 90, 30);
    btnClear.setFont(new Font("Arial", Font.BOLD, 15));
   
    btnBack = new JButton("Back");
    btnBack.setBounds(350, 350, 100, 30);
    btnBack.setFont(new Font("Arial", Font.BOLD, 15));
    
    
    
    add(lblGrades);
    add(lblName);
    add(lblSubject);
    add(lblMidterm);
    add(lblFinal);
    add(txtfldName);
    add(txtfldSubject);
    add(txtfldMidterm);
    add(txtfldFinal);
    add(btnCompute);
    add(btnClear);
    add(btnBack);

 

   
    setVisible(true);
    setResizable(false);
    
    }
}
