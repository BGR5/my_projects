/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.commerce;

/**
 *
 * @author BGR
 */
public class Product {
    
    private String  productName,productColor,productCategory,productDescription;
    private int numberOfStock ;
    private double productWeight ;
    
   

   Product(String productCategory,String productName, String productColor,  String productDescription, int numberOfStock, double productWeight) {
        this.productName        = productName;
        this.productColor       = productColor;
        this.productCategory    = productCategory;
        this.productDescription = productDescription;
        this.numberOfStock      = numberOfStock;
        this.productWeight      = productWeight;
       
    }

    public String getProductName() {
        return productName;
    }
    public String getProductColor() {
        return productColor;
    }
    public String getProductDescription() {
        return productDescription;
    }
    public int getNumberOfStock() {
        return numberOfStock;
    }
    public String getProductCategory() {
        return productCategory;
    }
    public double getProductWeight() {
        return productWeight;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }
    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }
    public void setProductDescription(String productDescription) {
       this.productDescription = productDescription;
    }
    public void setProductWeight(double productWeight) {
        this.productWeight = productWeight;
    }
    public void setNumberOfStock(int numberOfStock) {
        this.numberOfStock = numberOfStock;
    }
    
    public void reduceNumberOfStock(int number){
                 setNumberOfStock( getNumberOfStock() - number );    
    }



}