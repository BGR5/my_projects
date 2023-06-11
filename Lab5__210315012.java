//201315012 Buğra Kafa
package labassignment5tocomplete.java;

import java.util.Scanner;
public class Lab5__210315012 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                
  
        int operation;
        do{
           System.out.println("which operation do you want to do?");
           System.out.println("1- Write all even numbers between an interval");
           System.out.println("2- Generate and printout a random matrice");
           System.out.println("3- Generate a password and printout");
           System.out.println("0- for exit");  
           operation = input.nextInt();
           selectOperation(operation);
        }while(operation != 0);
        
    }
    static void selectOperation(int operation){
        Scanner input = new Scanner(System.in);
        switch(operation){
            
            case 0:System.out.println("Bye Bye");break;
            case 1:System.out.println("write two integers as boundaries");
                    int x = input.nextInt();
                    int y = input.nextInt();
                    printEvenNumbers(x, y);
                    break;
            case 2:System.out.println("write two integers as matrice size");
                    int a = input.nextInt();
                    int b = input.nextInt();
                    printRandomMatrice(a, b);
                    break;
            case 3:System.out.println("how much lenght password should be");
                    int l = input.nextInt();
                    String generatedPassword = generatePassword(l);
                    System.out.println("password: " + generatedPassword);
                    break;
            default :System.out.println("Invalid.Try again");break;
            
        }}
    static void printEvenNumbers(int x,int y){
    
    
        for(int i=x+1 ; i<y ; i++){
           if(i % 2 == 0){
               System.out.print(i  + "  ");
           
           }
         
           
        }
         System.out.println("");
        
    
        
}
    
    static String generatePassword(int length){
        String password;
        password = "";
        for(int i=0;i<length;i++){
            password += (char) (Math.random()*95 + 33) ;//bu aralıktaki ascıı karakterleri şifre olmaya daha uygun
            
        }
        
        return password ;
}  
    
    
    
 public static void printRandomMatrice(int a , int b){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                int m = (int) (Math.random()*10);
                System.out.print(m + "\t");
            }
            System.out.print("\n");
        }

    }


}
