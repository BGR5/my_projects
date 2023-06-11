
package e.commerce;

//import java.util.Date;

import java.util.Scanner;

//import java.text.SimpleDateFormat;

public class User {
    private String username, name, surname ,password, email, homeAddress,workAdress;
    private CreditCard creditCard;
    private Product [] productsOrdered;
    private Product [] favoriteProducts;
    private String dateOfBirth;
    
    
    User(String username,String name,String surname,String dateOfBirth,String password){
    
         this.username = username;
         this.name     = name    ;
         this.surname  = surname ;
         this.dateOfBirth =dateOfBirth;
         this.password = password;
         this.productsOrdered = new Product[80]; 
  }
    
    
    public String getUsername() {
        return username;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public String getPassword() {
        return password;
    }
    public String getEmail() {   
        return email;
    }
    
    public String getHomeAddress() {
        return homeAddress;
    }
    public String getWorkAdress() {
        return workAdress;
    }
    public Product[] getProductsOrdered() {
        return productsOrdered;
    }
    public Product[] getFavoriteProducts() {
        return favoriteProducts;
    }
    public CreditCard getCreditCard() {
        return creditCard;
    }
    
  
   public void setUsername(String username) {
        this.username = username;
    }
   public void setName(String name) {
        this.name = name;
    }
   public void setSurname(String surname) {
        this.surname = surname;
    }
   public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
   public void setPassword(String password) {
        this.password = password;
    }
   public void setEmail(String email) {
        this.email = email;
    }
   public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }
   public void setWorkAdress(String workAdress) {
        this.workAdress = workAdress;
    }
   public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
   public void setProductsOrdered(Product[] productsOrdered) {
        this.productsOrdered = productsOrdered;
    }
   public void setFavoriteProducts(Product[] favoriteProducts) {
        this.favoriteProducts = favoriteProducts;
    }
   
   
   public void printProductsOrdered(){
      
             for(Product prod : productsOrdered){
                 System.out.println(prod);
             
             }
             
   }

   public void buyCreditCard(CreditCard creditCard){
          this.creditCard = creditCard ;
          creditCard.setCreditCardUser(this);
   }
  
           
   public void order(Product product,int number,CreditCard creditCard){
       while( this.creditCard != creditCard){
                   System.out.println(username + " this is not your card ." );
                   
                   return;
                   
        }
       
       Scanner input = new Scanner(System.in);
       
       
       boolean allConditions   = false   ;
       boolean logOut          = false   ;
       boolean passwordIsValid = false   ;
       boolean codeIsValid     = false   ;
       
      
       while( logOut != true ){
            System.out.println( username+ ",please type  the password of your account.To log out you can type \"LO\" ");
           while( passwordIsValid != true){
              
               String passwordControl = input.nextLine();
                   if( passwordControl.equals(password)){
                       System.out.println("Password is correct");
                        passwordIsValid = true ;
                        
                   }
                   
                   else if(passwordControl.equals("LO")){
                        logOut = true ;
                        return;
                   }
                   
                   else{ System.out.println("Password is invalid.Please try again! To log out you can type  \"LO\" ");}
           }
           
           System.out.println(username + ",please type  the security code of your card.To log out you can type \"LO\" ");
           while(codeIsValid != true){
           
           
           try {   
                String codeControl = input.nextLine();
               // int intCode = Integer.parseInt(codeControl); 
              
                if( codeControl.equals("LO") ){
                  
                    logOut = true ;
                    return;
                    
           }
                else  if( Integer.parseInt(codeControl) == creditCard.getSecurityCode() ){
                    System.out.println("Security Code is correct");
                    codeIsValid = true ;
           }
               else{
                    System.out.println("Security Code is invalid.Please try again! To log out you can type \"LO\" ");
           }
                
           }
                catch (NumberFormatException nfe) {
                    System.out.println("Security Code is invalid.Please try again! To log out you can type \"LO\" ");
           
                }
        
           }
               
           
               
           
           if( codeIsValid == true  && passwordIsValid ==  true){
               System.out.println( "Now we are sure that you are " + username );
               allConditions = true;
           }
           if(allConditions == true){
               logOut= true ;
           }
       }
       
      
           
             
             
       
     if ( allConditions == true && product.getNumberOfStock() >= number ){
            
       
            
        System.out.println(username + ", you ordered " + number  +" " + product.getProductName() + ". These are your product information : \n" + product.getProductDescription());
        
       for(int i=0 ; i < productsOrdered.length ; i++){
            if(productsOrdered[i] == null){
                productsOrdered[i] = product ;
            }
       }
        
            product.reduceNumberOfStock(number);
       }
       
       else if ( product.getNumberOfStock() == 0) {
              System.out.println("We are out of stock");
       }
       
       else {
            System.out.println("Sorry, there is not the quantity you want from this product.");
       }
      
      }

   public void addFavoriteProduct(Product product){
       
      for(int i=0 ; i < favoriteProducts.length ; i++){
            if(favoriteProducts[i] == null){
                favoriteProducts[i] = product ;
            }
       
       }
   
   }}
   
   
    



