/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sale;

import java.util.ArrayList;

/**
 *
 * @author movvakodandram
 */
public class OnlineSalesDirectory {
 
    private ArrayList<OnlineSales> SalesList;
    public OnlineSalesDirectory(){
        this.SalesList=new ArrayList();
    }

    public ArrayList<OnlineSales> getSalesList() {
        return SalesList;
    }

    public void setSalesList(ArrayList<OnlineSales> SalesList) {
        this.SalesList = SalesList;
    }

    
}
