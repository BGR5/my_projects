

package hw210315012.q3;
import java.util.Scanner;

public class Valid_Account {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
 
 int condition=0;//since question has 3 condition for valid  number.I created condition variable.When all condition is true loop is gonna end.
 String accountNumber;
 
 char firstDigit,secondDigit;

 
while(condition!=3){
System.out.println("Enter a account number.");
accountNumber=input.nextLine();


if(accountNumber.length()==16){
    
    firstDigit=accountNumber.charAt(0);//extracting first character
    secondDigit=accountNumber.charAt(1);//extracting second character
    boolean firstDigitIsUpper=Character.isUpperCase(firstDigit);//checking the letter if uppercase
    boolean secondDigitIsUpper=Character.isUpperCase(secondDigit);//checking the letter if uppercase
    int ascııOfFirstDigit=(int) firstDigit;//This shows the ascıı value of the letter.We can now which letter is  higher   through ascıı 
    int ascııOfSecondDigit=(int)secondDigit;//asccı value of the letter
    
    if( firstDigitIsUpper && secondDigitIsUpper && ascııOfFirstDigit < ascııOfSecondDigit){//if first 2 letters are uupercase and first letter lower than second ,,this runs       
        condition++;//first condition is fulfilled
        
    }
    String twoDigitsAfterTheLettersS=accountNumber.substring(2,4);//extracting after 2 digits to control next condition
boolean onlyDigits=twoDigitsAfterTheLettersS.matches("[0-9]+");//controll  whether it  only contains numbers or not.If not it is already invalid
if(onlyDigits ){
  int twoDigitsAfterTheLetters=Integer.parseInt(twoDigitsAfterTheLettersS);//translating into integer from string for calculation
  
    boolean prime=true;//time to understand whether it is prime or not
   int i=2;
   
    for(i=2;i<twoDigitsAfterTheLetters;i++){
        if(twoDigitsAfterTheLetters % i ==0 ){
            
            prime=false;
            break;//if the number can dividing by  any number expect 1 and itself,prime is gonna be return false value
        }
        
    }
    if(prime){//if prime variable is still returning to true, that means it is aprime number
         condition++;//Second conditiıon is fulfilled. 
    
    }
    
 
  }



String lastTwelveDigitS=accountNumber.substring(4);//extracting the remaining string 
boolean lastTwelve_isDigit=lastTwelveDigitS.matches("[0-9]+");//checks if it only contains number or not.İf not it is already invalid.
if(lastTwelve_isDigit){
    int i;
    int count=0;//all wanted results is gonna be adding this variable
    for(i=0;i<11;i+=2){//every second from right to left
        int number=Integer.parseInt(lastTwelveDigitS.substring(i,i+1));//return of  numbers respectively in iteration 
       
        int doubling=number * 2;//multiple by 2 each digit
        String doublingS=Integer.toString(doubling);//To find out how many digits are there in this result,I translated integer  to string 
        if(doublingS.length()==2){//if the result of doubling has 2 digit
            count += Integer.parseInt(doublingS.substring(0,1));//extracting first digit as a integer
            count += Integer.parseInt(doublingS.substring(1));//extracting second digit as a integer
            
        }
        else if(doublingS.length()==1){
        count += doubling;
        }
        
    }
    for(i=1;i<12;i+=2){//odd places in the last twelve digits
        
        count += Integer.parseInt(lastTwelveDigitS.substring(i,i+1));
        
       
    }
    
    
    if(count % 10 == 0){
    condition++;  // third condition is fulfilled
   }
    
}

}

if(condition !=3){
        System.out.println("Invalid account number.Try again");
        condition=0;
        
    }

    

else if(condition==3)
{System.out.println("The account number " + accountNumber + " is a valid.");}

}

    }
    
}
