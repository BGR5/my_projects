/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;

/**
 *
 * @author BGR
 */

import java.util.Scanner;
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        
        Calculator calculator = new Calculator();
        Scanner input= new Scanner(System.in);
        
        Integer operation,firstNumber,secondNumber;
        System.out.println("Choose operation with a number ");
        System.out.println(" 1 - for addition     ");
        System.out.println(" 2 - for subtraction ");
        System.out.println(" 3 - for multiplying  ");
        System.out.println(" 4 - for dividing     ");
        operation = input.nextInt();
        
        System.out.println("Enter 2 numbers");
        firstNumber = input.nextInt();
        secondNumber= input.nextInt();
        
      
        
        
        switch(operation){
            case 1:
                System.out.println(calculator.add(firstNumber, secondNumber));
                break;
            case 2:
                System.out.println(calculator.subtract(firstNumber, secondNumber));
                break;
            case 3:
                System.out.println(calculator.multiply(firstNumber, secondNumber));
                break;
            case 4:
                System.out.println(calculator.divide(firstNumber, secondNumber));
                break;
            default:
                System.out.println("Enter a valid number for operation");
                break;
                
            
                
                
            
        
        
                     
        
        }
                
      
        
        
        
    }
}
