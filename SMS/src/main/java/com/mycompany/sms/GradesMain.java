
package com.mycompany.sms;

import java.awt.EventQueue;

public class GradesMain {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run() {
              Grades gr = new Grades ();
              gr.setVisible(true);
                
            }
            
        });
        
      
    }
    
}
