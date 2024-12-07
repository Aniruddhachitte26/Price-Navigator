/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.RegulatoryBody;

import java.util.ArrayList;
import model.OrderManagement.Order;
import model.Personnel.Person;
import model.Personnel.Profile;

/**
 *
 * @author diviyansjemni
 */
public class RegulatoryBodyProfile extends Profile {
    
    ArrayList<Order> salesorders;


    public RegulatoryBodyProfile(Person p) {

        super(p); 
        salesorders = new ArrayList();

    }
    
    public ArrayList<Order> getSalesOrders() {
    return this.salesorders;
}
    public void addSalesOrder(Order o){
        salesorders.add(o);
    }
    
    @Override
    public String getRole(){
        return  "RegulatoryBodyUser";
    }
}