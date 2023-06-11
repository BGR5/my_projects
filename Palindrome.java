/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q210315012;


 
import java.util.Scanner;
public class Palindrome {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number,birlerbasamağı,yüzlerbasamağı;
        
        System.out.println("Enter three digit number");
        number = input.nextInt();
        birlerbasamağı = number % 10;
        yüzlerbasamağı = number / 100;
        System.out.println();
        if(birlerbasamağı == yüzlerbasamağı){
            System.out.println("İt is palindrome");}
       
        else {
                System.out.println("Not palindrome");
                }
            
        }
        
        
        
        
        
        
        
    }
    
