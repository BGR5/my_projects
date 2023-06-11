/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e.commerce;

/**
 *
 * @author BGR
 */
public class ECommerce {

    
    public static void main(String[] args) {
      
       User user1 = new User("BGR" , "Buğra" , "Kafa" , "25/06/2003" , "**aabb**");
       CreditCard card1 = new CreditCard("00001" , 125 , "08/28");
       CreditCard card2 = new CreditCard("00002" , 315 , "08/28");
       
       Product product1 = new Product("Fashion","T-shirt" , "Blue","XL",100,2);
       Product product2 = new Product("Laptop","Asus" , "Black","8gb ram , ryzhen5 5700h ",55,1.8);
       Product product3 = new Product("Phone","Iphone" , "White","8gb ram , 6.5 inç ",12,0.7);
       
       
       user1.buyCreditCard(card1);
       
   
        
     //   user1.order(product3, 2, card2);
        
        
        
      //  user1.order(product3, 13, card1);
       
        
        
       
        System.out.println(product1.getNumberOfStock());
        user1.order(product1, 5, card1);
        System.out.println(product1.getNumberOfStock());
        
        //order1.displayOrderInfo();
        
        
        
        
     //   System.out.println(user1.printOrderedProducts());
       // user1.printProductsOrdered();
       

        
       
               
      
    }
    
}
