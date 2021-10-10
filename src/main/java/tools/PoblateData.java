/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.math.BigDecimal;
import java.util.ArrayList;
import objects.Product;
import objects.ShoppingItem;



/**
 *
 * @author juanjo
 */
public class PoblateData {
    private String ProductListPath;
    private  String ShoppingListPath;

    public PoblateData(String ProductListPath, String ShoppingListPath) {
        this.ProductListPath = ProductListPath;
        this.ShoppingListPath = ShoppingListPath;
    }
       
      
    public ArrayList poblateProductsData(){
        ReadFile readFile= new ReadFile(ProductListPath);
        Product product;
        ArrayList<Product> ListProducts= new ArrayList<>();

        for(int i=0;i<readFile.getFileContent().size(); i++){
            product=new Product();
            String[] parts = readFile.getFileContent().get(i).split(" ");
            String NamePart = parts[0]; 
            product.setName(NamePart);
            String PricePart = parts[1]; 
            BigDecimal price = new BigDecimal(PricePart);
            product.setPrice(price);
            ListProducts.add(product);
        } 
        return ListProducts;
    }
    
    public ArrayList poblateShoppingData(){
        ReadFile readFile= new ReadFile(ShoppingListPath);
        ShoppingItem shoppingItem;
        ArrayList<ShoppingItem> ShoppingList= new ArrayList<>();

        for(int i=0;i<readFile.getFileContent().size(); i++){
            shoppingItem = new ShoppingItem();
            String[] parts = readFile.getFileContent().get(i).split(" ");
            String NamePart = parts[0]; 
            shoppingItem.setName(NamePart);
            String amount = parts[1]; 
            shoppingItem.setAmount(Integer.parseInt(amount));
            ShoppingList.add(shoppingItem);
        } 
        
        return ShoppingList;
    }
    
}
