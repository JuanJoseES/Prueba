/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.HashMap;
import objects.Product;
import objects.ShoppingItem;
import tools.Calculate;
import tools.PoblateData;
import tools.PrintData;


/**
 *
 * @author juanjo
 */
public class Main {
    
    
    static String ProductListPath ="C:\\Shop\\Products.txt";
    static String ShoppingListPath="C:\\Shop\\ShoppingList.txt";
    HashMap<String, Integer> ProductLista = new HashMap<String, Integer>();
    static ArrayList<Product> ProductList;
    static ArrayList<ShoppingItem> ShoppingList;

    public static void main(String args[]) {
       
       PoblateData poblateData= new PoblateData(ProductListPath,ShoppingListPath);
       ProductList=poblateData.poblateProductsData();
       ShoppingList=poblateData.poblateShoppingData();
       
       Calculate calculate =new Calculate(ProductList,ShoppingList);
       ShoppingList=calculate.calculateTicket();
       
       for(int i=0; i<ShoppingList.size(); i++  ){
           
           System.out.println(ShoppingList.get(i).getName()+ " " + ShoppingList.get(i).getAmount() + " " + ShoppingList.get(i).getTotalPerProduct() );
       }
       
       System.out.print("Total " +calculate.calculateTotal());
       
       //PrintData printData =new PrintData();
       
       

    }
        
    
        
    
}
    

