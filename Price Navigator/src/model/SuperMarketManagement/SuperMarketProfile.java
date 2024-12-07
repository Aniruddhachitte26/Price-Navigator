/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.SuperMarketManagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.OrderManagement.Order;
import model.OrderManagement.OrderItem;
import model.Personnel.Person;
import model.Personnel.Profile;
import model.ProductManagement.Product;

/**
 *
 * @author manikanta
 */
public class SuperMarketProfile extends Profile {

    ArrayList<Order> orders;
    Person person;
    private double distance; // distance from user
    
    // Additional attribute to track product quantities
    private Map<Product, Integer> productQuantities = new HashMap<>();

    public SuperMarketProfile(Person p) {
        super(p);
        person = p;
        orders = new ArrayList();

    }
    
    @Override
    public String getRole(){
        return "SuperMarket";
    }
    
    public double getDistance() {
    return this.distance;
}

public void setDistance(double distance) {
    this.distance = distance;
}
    
    

    public int getTotalPricePerformance() {

        //for each order in the customer orderlist 
        //calculate order price performance and add it to the sum
        return 0;
    }

    public int getNumberOfOrdersAboveTotalTarget() {
        //for each order in the customer order list 
        //calculate if order is positive (actual order total is greater than sum of item targets
        //if yes then add 1 to total 
        int sum = 0;
        for (Order o : orders) {
            if (o.isOrderAboveTotalTarget() == true) {
                sum = sum + 1;
            }
        }

        return sum;
    }

    public int getNumberOfOrdersBelowTotalTarget() {
        return 0;
    }
    //for each order in the customer order list 
    //calculate if order is negative
    //if yes then add 1 to total 

    public boolean isMatch(String id) {
        if (person.getPersonId().equals(id)) {
            return true;
        }
        return false;
    }

    public void addCustomerOrder(Order o) {
        orders.add(o);
    }

    @Override
    public String toString() {
        return person.getPersonId();
         
    }
    
 
    

    public String getCustomerId() {
        return person.getPersonId();
    }

    public Person getPerson() {
        return person;
    }
    
       public ArrayList<Order> getOrders() {
    return orders;
       }
       
       
    public void addCustomerOrderNew(Order o) {
        orders.add(o);
        // Update the productQuantities map when an order is added
        for (OrderItem item : o.getOrderItems()) {
            Product product = item.getSelectedProduct();
            int existingQty = productQuantities.getOrDefault(product, 0);
            productQuantities.put(product, existingQty + item.getQuantity());
        }
    }

    public boolean deductProductQuantity(Product product, int quantity) {
        int currentQty = productQuantities.getOrDefault(product, 0);
        if (currentQty < quantity) {
            return false; // Not enough inventory
        }
        productQuantities.put(product, currentQty - quantity);
        return true;
    }

       
       public List<ProductInfo> getAvailableProducts() {
        List<ProductInfo> availableProducts = new ArrayList<>();
        for (Order o : orders) {
            for (OrderItem oi : o.getOrderItems()) {
                Product product = oi.getSelectedProduct();
                int quantity = oi.getQuantity();
                int actualPrice = oi.getActualPrice();
                availableProducts.add(new ProductInfo(product, quantity, actualPrice));
            }
        }
        return availableProducts;
    }

    public static class ProductInfo {
        private Product product;
        private int quantity;
        private int actualPrice;

        public ProductInfo(Product product, int quantity, int actualPrice) {
            this.product = product;
            this.quantity = quantity;
            this.actualPrice = actualPrice;
        }

        public Product getProduct() {
            return product;
        }

        public int getQuantity() {
            return quantity;
        }

        public int getActualPrice() {
            return actualPrice;
        }
    }
       
    
}
