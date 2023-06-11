package e.commerce;


public class Order {
    private User     orderingUser  ;
    private Product  orderedProduct;
    private CreditCard payCard;
    
    Order(User orderingUser ,Product orderedProduct ,CreditCard payCard){
         this.orderedProduct = orderedProduct;
         this.orderingUser   = orderingUser  ;
         this.payCard        = payCard       ;
          }
    
    public Product getOrderedProduct() {
        return orderedProduct;
    }

    public User getOrderingUser() {
        return orderingUser;
    }

    public CreditCard getPayCard() {
        return payCard;
    }
    

    public void setPayCard(CreditCard payCard) {
        this.payCard = payCard;
    }

    public void setOrderingUser(User orderingUser) {
        this.orderingUser = orderingUser;
    }

    public void setOrderedProduct(Product orderedProduct) {
        this.orderedProduct = orderedProduct;
    }
    public void setNumberOfStock(Product orderedProduct , int numberOfStock) {
        orderedProduct.setNumberOfStock(numberOfStock) ;
    }
    
     public void reduceNumberOfStock(Product orderedProduct,int number){
                 orderedProduct.setNumberOfStock( orderedProduct.getNumberOfStock() - number );    
    }

     public void displayOrderInfo(){
           
           System.out.println( orderingUser.getUsername() + " ordered " + orderedProduct.getProductName() + " with the credit card  has a number  " + payCard.getCreditCardNumber()  );
     }
    
    
}
