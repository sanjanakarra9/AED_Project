/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WorkQueue;

import Sale.OnlineSales;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Sonur
 */
public class SalesRequest  extends workRequest{
     private HashMap<OnlineSales, Integer> itemOrder;
    
     @Override
    public String toString(){
        String result = "";
        for(Map.Entry<OnlineSales, Integer> e : itemOrder.entrySet())
            result += e.getKey().getItemname();
        return result;
    }
    
    public int getQuantity(){
        int quantity = 0;
        for(Map.Entry<OnlineSales, Integer>e: itemOrder.entrySet())
            quantity += e.getValue();
        return quantity;
    }
    
    public double getTotalPrice(){
        double price = 0;
        for(Map.Entry<OnlineSales, Integer> e : itemOrder.entrySet())
            price += e.getKey().getPrice() * e.getValue();
        return price;
    }

    public SalesRequest(){
        itemOrder = new HashMap();
    }

    public HashMap<OnlineSales, Integer> getItemOrder() {
        return itemOrder;
    }

    public void setItemOrder(HashMap<OnlineSales, Integer> itemOrder) {
        this.itemOrder = itemOrder;
    }
}
