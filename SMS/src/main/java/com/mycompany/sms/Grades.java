import java.awt.Font;
import javax.swing.*;


public class  Grades{
   
    private JFrame f = new JFrame("Grades");
    
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


        f.setSize(500,600);
        f.setLayout(null);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        
        
        
    lblGrades = new JLabel("GRADES");
    lblGrades.setBounds(100,1, 250, 150);
    lblGrades.setFont(new Font("Castellar", Font.BOLD, 50)); 
          
    lblName = new JLabel("Name:");
    lblName.setBounds(30,130, 200, 30);
    lblName.setFont(new Font("Arial", Font.BOLD, 30)); 
    
    lblSubject = new JLabel("Subject:");
    lblSubject.setBounds(30,190, 200, 30);
    lblSubject.setFont(new Font("Arial", Font.BOLD, 30)); 
    
    lblMidterm = new JLabel("Midterm:");
    lblMidterm.setBounds(30,230, 200, 30);
    lblMidterm.setFont(new Font("Arial", Font.BOLD, 30)); 
   
    lblFinal = new JLabel("Finals:");
    lblFinal.setBounds(30,270, 200, 30);
    lblFinal.setFont(new Font("Arial", Font.BOLD, 30));
    
    
    txtfldName.setBounds(190,130, 200,30);
    txtfldName.setFont(new Font("Castellar", Font.BOLD, 15));
    
    txtfldSubject.setBounds(190,190, 200,30);
    txtfldSubject.setFont(new Font("Castellar", Font.BOLD, 15));
    
    txtfldMidterm.setBounds(190,230, 200,30);
    txtfldMidterm.setFont(new Font("Castellar", Font.BOLD, 15));
     
    txtfldFinal.setBounds(190, 270, 200,30);
    txtfldFinal.setFont(new Font("Castellar", Font.BOLD, 15));
    
    
    
    btnCompute = new JButton("Compute");
    btnCompute.setBounds(30, 500, 130, 30);
    btnCompute.setFont(new Font("Castellar", Font.BOLD, 15));
    
    btnClear = new JButton("Clear");
    btnClear.setBounds(200, 500, 90, 30);
    btnClear.setFont(new Font("Castellar", Font.BOLD, 15));
   
    btnBack = new JButton("Back");
    btnBack.setBounds(350, 500, 100, 30);
    btnBack.setFont(new Font("Castellar", Font.BOLD, 15));
    
    
    
    f.add(lblGrades);
    f.add(lblName);
    f.add(lblSubject);
    f.add(lblMidterm);
    f.add(lblFinal);
    f.add(txtfldName);
    f.add(txtfldSubject);
    f.add(txtfldMidterm);
    f.add(txtfldFinal);
    f.add(btnCompute);
    f.add(btnClear);
    f.add(btnBack);

 

   
    f.setVisible(true);
    f.setResizable(false);
    
    }
    }
