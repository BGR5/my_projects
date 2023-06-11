// BUĞRA KAFA 210315012
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package secondassignmnet;

/**
 *
 * @author BGR
 */
import java.util.Scanner;
public class Secondassignmnet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double weight,height,weightPounds,heightInches;
        int BMI;
        
        System.out.println("Welcome To the BMI measuring");
        System.out.println("Enter your weight in pounds:");
        weightPounds= input.nextDouble();
        System.out.println("Enter your height in inches");
        heightInches = input.nextDouble();
        
        weight= weightPounds * 0.45359237 ;
        height= heightInches * 0.0254 ;
        BMI =(int)(weight / (height*height)) ;
        
        
        
        System.out.println("Your BMI is : " + BMI );
        double x;
       
        
        
        
        
        
       
       
        
       
    }
    
}
