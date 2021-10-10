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
public class Calculate {
    
    static ArrayList<Product> ProductList;
    static ArrayList<ShoppingItem> ShoppingList;

    public Calculate(ArrayList<Product> ProductList,ArrayList<ShoppingItem> ShoppingList ) {
        Calculate.ProductList = ProductList;
        Calculate.ShoppingList = ShoppingList;
    }        
    
    public ArrayList calculateTicket(){
        for(int i=0;i<ShoppingList.size();i++){
            String name =ShoppingList.get(i).getName();
            int amount = ShoppingList.get(i).getAmount();
            ShoppingList.get(i).setTotalPerProduct(calculatePricePerProduct(name, amount));
        }
        return ShoppingList;
    }
    
    public BigDecimal calculatePricePerProduct(String name,int amount){
        BigDecimal price = BigDecimal.ZERO;
        for(int i=0;i<ProductList.size();i++){
            if (ProductList.get(i).getName().equals(name)){
              price=ProductList.get(i).getPrice().multiply(new BigDecimal(amount));
            }
        }
        return price;
    }
    
    public BigDecimal calculateTotal(){
       BigDecimal total = BigDecimal.ZERO;
       for(int i=0;i<ShoppingList.size();i++){
           total=total.add(ShoppingList.get(i).getTotalPerProduct());
        }
       return total;
    }
}
