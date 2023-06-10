/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HW1;

/**
 *
 * @author BGR
 */
import java.util.Scanner;
public class HW1 {

   
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int midterm,midtermpoint,quiz,quizPoint,finalGrade,ınClass;
        double average;
        
        
        
       System.out.println("How many question you answered correctly in MIDTERM?");
       midterm =input.nextInt();
       
       if(midterm > 5 ){
           System.out.println("Enter valid number");
           midterm = input.nextInt();
           midtermpoint =midterm * 20 ;
           
       }
       
       else{
           midtermpoint = midterm *20;
       }
       
       
      
       System.out.println("How many question you answered correctly in QUIZ?");
       quiz =input.nextInt();
       
       if(quiz > 20 ){
           System.out.println("Enter valid number");
           quiz = input.nextInt();
           quizPoint = quiz * 5 ;
           
       }
       
       else{
           quizPoint = quiz * 5;
       }       
        
       
       System.out.println("What is your final grade?");
       finalGrade =input.nextInt();
       
       
       ınClass =  (int) ((Math.random() * 100) + 1) ;
       
       
       
       
       average =( (midtermpoint/4) + (quizPoint * 0.15) + (finalGrade / 2) + (ınClass / 10));
      
      System.out.println("MIDTERM POINT = " + midtermpoint);
      System.out.println("QUİZ POINT  = " + quizPoint);
      System.out.println("FİNAL POINT = " + finalGrade);
      System.out.println("INCLASS POINT = " +  ınClass);
      System.out.println("OVERALL POINT = " + average);
      
      
      
      if(average >= 90){
          System.out.println("Your Grade is A    SUCCESSFUL");
      }
      else if(average >= 80){
          System.out.println("Your grade is B    SUCCESSFUL ");
      }
      else if(average >=65){
          System.out.println("Your grade is C    SUCCESFULL  ");
      }
      else  if(average >= 50){
          System.out.println("Your grade is D    CONDİTİONAL PASS ");
      }
      else {
          System.out.println("Your grade is  F    FAIL");
      }
      
      
      
      

      
      
    }
}

    
