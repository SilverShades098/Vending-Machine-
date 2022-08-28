/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product.dispenser;
import java.util.Scanner;/**
 *
 * @author Faizan
 */
public class testProduct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProductDispensers pd = new ProductDispensers();
        Scanner in = new Scanner(System.in);
        pd.Display_Options();
        String selectProduct = in.nextLine();
        pd.Select_Product(selectProduct);
    }
}