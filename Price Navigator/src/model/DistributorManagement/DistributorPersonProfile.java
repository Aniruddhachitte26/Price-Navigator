/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DistributorManagement;


import java.util.ArrayList;
import model.OrderManagement.Order;
import model.Personnel.Person;
import model.Personnel.Profile;
import model.ProductManagement.PriceChangeRequest;
import model.ProductManagement.Product;
import model.Supplier.Supplier;

/**
 *
 * @author Aniruddha
 */
public class DistributorPersonProfile extends Profile {
    ArrayList<Order> distributororders;


    
    
    
    public DistributorPersonProfile(Person p) {

        super(p); 
        distributororders = new ArrayList();

    }
    
    public ArrayList<Order> getSalesOrders() {
    return this.distributororders;
}
    public void addSalesOrder(Order o){
        distributororders.add(o);
    }
    
    public void submitPriceChangeRequest(Product product, int newTargetPrice, Supplier supplier) {
        PriceChangeRequest request = new PriceChangeRequest();
        request.setProductName(product.getName());
        request.setNewTargetPrice(newTargetPrice);
        request.setSalesPersonName(this.getPerson().getName());
        request.setSupplierName(supplier.getName());
        request.setIsApproved(false);
        
        supplier.addPriceChangeRequest(request);
    }
    
    
    @Override
    public String getRole(){
        return  "Sales";
    }

}
