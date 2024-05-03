import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;


public class  Grades{
    
    private JFrame f = new JFrame("Grades");
    private JLabel lblName, lblSubject,lblGrades;
    private JTextField txtfldName = new JTextField();
    private JTextField txtfldSubject = new JTextField();
    private JButton btnProceed;
    private JTextArea txtareaLoginResults = new JTextArea();

    Grades (){


        f.setSize(500,600);
        f.setLayout(null);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        
        
        
    lblGrades = new JLabel("RECORDS");
    lblGrades.setBounds(200, 100, 250, 100);
    lblGrades.setFont(new Font("Castellar", Font.BOLD, 20)); 
          
    lblName = new JLabel("Name:");
    lblName.setBounds(80, 200, 250, 30);
    lblName.setFont(new Font("Castellar", Font.BOLD, 15)); 
   
    lblSubject = new JLabel("Subject:");
    lblSubject.setBounds(80, 250, 250, 30);
    lblSubject.setFont(new Font("Castellar", Font.BOLD, 15));
    
    
    
    
    txtfldName.setBounds(170, 250, 150,30);
    txtfldName.setFont(new Font("Castellar", Font.BOLD, 15));
     
    txtfldSubject.setBounds(170, 200, 150,30);
    txtfldSubject.setFont(new Font("Castellar", Font.BOLD, 15));
    
    
    
    btnProceed = new JButton("Proceed to view grade");
    btnProceed.setBounds(100, 300, 300, 30);
    btnProceed.setFont(new Font("Castellar", Font.BOLD, 15));
    
    
   
    
    
    
    
    f.add(lblGrades);
    f.add(lblName);
    f.add(lblSubject);
    f.add(txtfldName);
    f.add(txtfldSubject);
    f.add(btnProceed);
 

   
    f.setVisible(true);
    f.setResizable(false);
    
    }
    }
