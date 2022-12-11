/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sale;

/**
 *
 * @author movvakodandram
 */
public class Sales {
    private String productName;
    private int productId;
    private static int count=0;
    private double cost;
    
    public Sales(String productName, double cost){
      this.productName=productName;
      this.cost=cost;
      productId=count;
      count++;
    }
    
    @Override
    public String toString(){
        return this.productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Sales.count = count;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    
    
}
