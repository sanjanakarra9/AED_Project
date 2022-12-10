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
public class SalesDirectory {
 
    private ArrayList<Sales> SalesList;
    public SalesDirectory(){
        this.SalesList=new ArrayList();
    }

    public ArrayList<Sales> getSalesList() {
        return SalesList;
    }

    public void setSalesList(ArrayList<Sales> SalesList) {
        this.SalesList = SalesList;
    }

    
}
