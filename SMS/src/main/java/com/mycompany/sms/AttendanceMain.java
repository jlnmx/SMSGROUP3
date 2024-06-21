
package com.mycompany.sms;

import java.awt.EventQueue;

public class AttendanceMain {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                Attendance at = new Attendance ();
                at.setVisible(true);
            }
        });
                
                
                
                
                
                

    }
    
}
