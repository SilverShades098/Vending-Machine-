/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product.dispenser;

import java.util.Scanner;

/**
 *
 * @author Faizan
 */
public class ProductDispensers {
    Product coke = new Product("pepsi",10,50);
    Product water = new Product("nestle",10,30);
    Product selectedProduct;
    public int storedCoins = 100;
    public int insertedCoin = 0;
    
    public void Display_Options()
    {
        //Scanner scan = new Scanner(System.in);
        System.out.println("Enter pepsi for coke :"+coke.getPrice()+"\nEnter nestle for water :"+water.getPrice()+"\nPlease!Enter a selection :");
        /*String selectProduct = scan.next();
        Select_Product(selectProduct);IN DIRECT CASE*/
    }
    
    public void Select_Product(String selectProduct)
    {
        if("pepsi".equals(selectProduct))
        {
            coke.getQuantityInStock();
            selectedProduct = coke;
             Scanner scan = new Scanner(System.in);
            System.out.println("Please!Insert Rupees : ");
            insertedCoin = scan.nextInt();
            Insert_Rupees(selectedProduct,insertedCoin);
            
        }
        else if("nestle".equals(selectProduct))
        {
            selectedProduct = water;
            Scanner scan = new Scanner(System.in);
            System.out.print("Insert Rupees : ");
            water.getQuantityInStock();
            insertedCoin = scan.nextInt();
            Insert_Rupees(selectedProduct,insertedCoin);
            
        }
        
    }
    
    public void Insert_Rupees(Product p,int InsertedRs)
    {
        double extraCoins;
        extraCoins = 0;
        int neededCoins =0;
        if(insertedCoin == p.getPrice())
        {
            storedCoins +=insertedCoin;
            dispenseProduct(p);
            
        }
        else if(insertedCoin > p.getPrice())
        {
            storedCoins +=insertedCoin;
            extraCoins = insertedCoin - p.getPrice();
            dispenseProduct(p);
            System.out.println("Please recieve your change : " + Dispense_Coin(extraCoins));
        }
        else if(insertedCoin < p.getPrice())
        {
            neededCoins +=p.getPrice() - insertedCoin;
            System.out.println("You need " + neededCoins + "more Rupees to receive your product,Get Rupees and Try Again!");
        }
      
    }
    public double Dispense_Coin(double CoinChange)
    {
        storedCoins -= CoinChange;
        return CoinChange;
        
    }
    
    public void dispenseProduct(Product product_Name)
    {
        if(product_Name.getName() == "pepsi")
        {
            if(checkAvailability(product_Name))
            {
               product_Name.retrieveProduct(product_Name);
            }
            else
            {
            System.out.println(product_Name.getName()+" not available right now and this is returned coins : " + Dispense_Coin(insertedCoin));
            }
            
        }
        else if(product_Name.getName() == "nestle")
        {
            if(checkAvailability(product_Name))
            {
               product_Name.retrieveProduct(product_Name);              
            }
            else
            {
            System.out.println(product_Name.getName()+" not available right now and this is returned coins : " + Dispense_Coin(insertedCoin));
            }
    }
    }
    public boolean checkAvailability(Product availableProduct)
    {
        if(availableProduct.getQuantityInStock() > 0){return true;}
        else{return false;}
    }
}