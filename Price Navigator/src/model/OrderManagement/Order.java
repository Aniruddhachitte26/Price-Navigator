/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.OrderManagement;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID; 
import model.SuperMarketManagement.SuperMarketProfile;
import model.ProductManagement.Product;
import model.DistributorManagement.DistributorPersonProfile;
import model.RegularUser.RegularUserProfile;

/**
 *
 * @author Sameer
 */

public class Order {
    
    private static int idCounter = 0; // Static counter to generate unique IDs
    private int orderId; // Unique identifier for each order
    ArrayList<OrderItem> orderitems;
    SuperMarketProfile customer;
    DistributorPersonProfile salesperson;
    String status;
    private String orderIdC;
    private String supermarketName;
    RegularUserProfile regularUser;
    private List<OrderItem> items;
    private String orderSource;
    private Date timestamp;
    private String penalty;
    

    public Order(SuperMarketProfile cp) {
        this(cp, null);
    }
    
    public Order() {
        this.orderIdC = UUID.randomUUID().toString(); // Generate unique UUID for each order
        this.orderitems = new ArrayList<>();
        this.status = "New";
        this.timestamp = new Date(); // sets the current time
        this.penalty = "No penalty"; // Initialize penalty to zero
    }
    
    
    public Order(SuperMarketProfile cp, DistributorPersonProfile sp) {
        orderitems = new ArrayList();
        this.orderId = generateUniqueID(); // Generate unique ID for the order
        this.orderitems = new ArrayList<>();
        this.customer = cp;
        this.salesperson = sp;
        this.status = "Order Placed"; 
        this.timestamp = new Date(); // sets the current time
        this.penalty = "No penalty";// Initialize penalty to zero// Default status
        if (cp != null) {
            cp.addCustomerOrder(this); // Link the order to the customer
        }
        if (sp != null) {
            sp.addSalesOrder(this); // Link the order to the salesperson
        }
    }
    
    
    public Order(RegularUserProfile rup) {
        orderitems = new ArrayList<OrderItem>();
        this.orderId = generateUniqueID(); // Generate unique ID for the order
        this.status = "Order Placed"; // New status for new order
        this.regularUser = rup;
        this.timestamp = new Date(); // sets the current time
        this.penalty = "No penalty"; // Initialize penalty to zero
        if (rup != null) {
        rup.addOrder(this);
    }
        
    }
    
    // Getter method for RegularUserProfile
    public RegularUserProfile getRegularUser() {
        return regularUser;
    }

    // A method to check if the order has a RegularUserProfile
    public boolean isRegularUserOrder() {
        return regularUser != null;
    }
    

    
    
    public OrderItem newOrderItem(Product p, int actualprice, int q) {
        OrderItem oi = new OrderItem(p, actualprice, q);
        orderitems.add(oi);
        return oi;
    }
    
       public OrderItem newOrderItem(Product p, int actualprice, double sp,double sup,double tp,double cp) {
        OrderItem oi = new OrderItem(p, actualprice, sp,sup,tp,cp);
        orderitems.add(oi);
        return oi;
    }
       
        public void submitOrder(String supermarketName) {
        this.supermarketName = supermarketName;
        this.status = "Submitted"; // Assuming you have a status field
        this.orderIdC = UUID.randomUUID().toString(); // Ensure each order has a unique string ID
        if (customer != null) {
            customer.addCustomerOrder(this); // Link the order to the customer's profile
        }
    }
        
         public int getTotalItems() {
             
          int totalItems = 0;
          for (OrderItem item : orderitems) {
              totalItems += item.getQuantity(); // Ensure quantity is a defined field in OrderItem
    }
          return totalItems;
    }
        
        public double getTotalCost() {
            double totalCost = 0;
               for (OrderItem item : orderitems) {
                   totalCost += item.getActualPrice() * item.getQuantity(); // Assuming actualPrice and quantity are fields in OrderItem
    }
               return totalCost;
        
    }
    
    public void setSupermarketName(String supermarketName) {
        this.supermarketName = supermarketName;
    }

    // Getter method for supermarketName
    public String getSupermarketName() {
        return this.supermarketName;
    }
       
       
    public int getOrderId() {
        return orderId;
    }
    
    public String getOrderIdC() {
        return orderIdC;
    }
   
    private synchronized static int generateUniqueID() {
        return ++idCounter;
    }
    //order total is the sumer of the order item totals
    public int getOrderTotal() {
        int sum = 0;
        for (OrderItem oi : orderitems) {
            sum = sum + oi.getOrderItemTotal();
        }
        return sum;
    }

     public String getStatus() {
        return status;
    }

     
    public SuperMarketProfile getCustomer() {
    return this.customer;
    }  
     
    public void setStatus(String status) {
        this.status = status;
    }
    public int getOrderPricePerformance() {
        int sum = 0;
        for (OrderItem oi : orderitems) {
            sum = sum + oi.calculatePricePerformance();     //positive and negative values       
        }
        return sum;
    }

    public int getNumberOfOrderItemsAboveTarget() {
        int sum = 0;
        for (OrderItem oi : orderitems) {
            if (oi.isActualAboveTarget() == true) {
                sum = sum + 1;
            }
        }
        return sum;
    }
    
   private void assignUniqueStringIdForCustomerOrder() {
        this.orderIdC = UUID.randomUUID().toString();
    }
    
    
    //sum all the item targets and compare to the total of the order 
    public boolean isOrderAboveTotalTarget(){
        int sum = 0;
        for (OrderItem oi: orderitems){
            sum = sum + oi.getOrderItemTargetTotal(); //product targets are added
        }
        if(getOrderTotal()>sum) {return true;}
        else {return false;}
        
    }
    
    
    public void CancelOrder(){
    status = "Cancelled";
    }
    
    public void Submit(){
    status = "Order Placed";
    }

    public ArrayList<OrderItem> getOrderItems() {
        return orderitems;
    }

    public DistributorPersonProfile getSalesperson() {
        return salesperson;
    }
    
        public String getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource;
    }
    
    
    // Getter and Setter for timestamp
    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    // Getter and Setter for penalty
    public String getPenalty() {
        return penalty;
    }

    public void setPenalty(String penalty) {
        this.penalty = penalty;
    }

    
}
