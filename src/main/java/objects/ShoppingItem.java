/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.math.BigDecimal;

/**
 *
 * @author juanjo
 */
public class ShoppingItem {
    
   private String name;
   private int  amount;
   private BigDecimal totalPerProduct;

    public ShoppingItem() {
       
    }
    
    public ShoppingItem(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public BigDecimal getTotalPerProduct() {
        return totalPerProduct;
    }

    public void setTotalPerProduct(BigDecimal totalPerProduct) {
        this.totalPerProduct = totalPerProduct;
    }
   
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }   
    
}
