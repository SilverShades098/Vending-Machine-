/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product.dispenser;

/**
 *
 * @author mubeen
 */
public class Product {
private String name;
private int quantityInStock;
private double price;

public Product(String name, int quantityInStock, double price) {
this.name = name;this.quantityInStock = quantityInStock;this.price = price;}
public void setName(String name) {
        this.name = name;
    }
public void setQuantityInStock(int quantityInStock){
        this.quantityInStock = quantityInStock;
    }
public void setPrice(double price){
        this.price = price;
    }
 public String getName(){
        return name;
    }
 public int getQuantityInStock(){
        return quantityInStock;
    }
public double getPrice(){
        return price;
    }
public void retrieveProduct(Product product)
    {
        int DecreaseQuantity = product.getQuantityInStock() - 1;
       product.setQuantityInStock(DecreaseQuantity);
        System.out.println("Please receive your product,Thankyou for buying " + product.getName());
        
    }
    
    
}
