
package e.commerce;

import java.util.Date;
import java.text.SimpleDateFormat;
public class CreditCard {
     private User creditCardUser ;
     private String creditCardNumber;
     private int securityCode    ; 
     private String expirationDate ;
    
     
     
     CreditCard(String creditCardNumber,int securityCode , String expirationDate){
         this.creditCardNumber = creditCardNumber;
         this.securityCode     = securityCode    ;
         this.expirationDate   = expirationDate  ;
     }
     
    
    public String getCreditCardNumber() {
        return creditCardNumber;
    }
    public int getSecurityCode() {
        return securityCode;
    }
    public String getExpirationDate() {
        return expirationDate;
    }
    public User getCreditCardUser() {
        return creditCardUser;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }
    public void setExpirationDate(String expirationDate)  {
        this.expirationDate = expirationDate;
    }
    public void setCreditCardUser(User creditCardUser) {
        this.creditCardUser = creditCardUser;
    }

    
}
