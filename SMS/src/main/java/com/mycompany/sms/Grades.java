/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author delar
 */
public class Grades {
     int scores;
     String name;
     String subject;
     
     Grades(int scores, String name, String subject){
         this.scores = scores;
         this.name = name;
         this.subject = subject;
     }
     
    public void setScores(int scores){
        this.scores = scores;   
    }
    
    public void setName(String name){
        this.name = name;   
    }
    public void setSubject(String subject){
       this.subject = subject;
    }
    
    public int getScores (){
        return scores;
    }
    
    public String getName(){
        return name;
    }
    public String getSubject(){
        return subject;
    }
   
}
