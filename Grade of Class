
package javaapplication49;

import java.util.Scanner;
public class JavaApplication49 {

   
    public static void main(String[] args) {
 
       double[][] student = createArray();

      displayArray(calcSuccessGrade(student));
     
      unsuccessfulStd(student);
    }
    
    public static double[][] createArray() {
   double[][] student = {{55.0, 83.0, 0},
                         {84.0, 75.0, 0}, 
                         {68.0, 90.0, 0}, 
                         {26.0, 45.0, 0}, 
                         {87.0, 93.0, 0}};
 return student;
 }
    
   public static double[][] calcSuccessGrade(double[][] student){
 for(int i = 0; i < student.length; i++){
 student[i][2] = student[i][0]*0.4 + student[i][1]*0.6; 
 }
 return student;}
    
  public static void displayArray(double[][] student){
   for(int i = 0; i < student.length; i++){
  System.out.print(i + ".student midterm:" + student[i][0] + " final:" + student[i][1] + " success:" + student[i][2]);
   System.out.println();
 }
 }

    
   
    public static char[] scoreChar(double[][] student){
    char[] letterGrade = new char[5];
    for(int i = 0; i < student.length; i++){
 if(student[i][2] <= 100 && student[i][2] >= 90)
 letterGrade[i] = 'A';
 else if(student[i][2] <= 89 && student[i][2] >= 80)
 letterGrade[i] = 'B';
 else if(student[i][2] <= 79 && student[i][2] >= 70)
 letterGrade[i] = 'C';
 else if(student[i][2] <= 69 && student[i][2] >= 60)
 letterGrade[i] = 'D';
 else
 letterGrade[i] = 'F';
 }
 return letterGrade;
    }
   
    
    public static void unsuccesfullStudent(char[] scoreChar){
        for(int i=0; i<scoreChar.length ; i++){
       if(scoreChar[i]== 'F'){
        System.out.println(i + ".student is unseccesfull");
        }
            
        }
        
        
    
    }
    public static void unsuccessfulStd(double[][] student){
 char[] letterGrade = scoreChar(student);
 for(int i = 0; i < letterGrade.length; i++){
 if(letterGrade[i] == 'F')
 System.out.println(i + " " + student[i][2]);
 }
 }

 }


