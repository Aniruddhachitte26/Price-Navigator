/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.OrderManagement;

import java.util.ArrayList;
import java.util.List;
import model.SuperMarketManagement.SuperMarketProfile;
import model.DistributorManagement.DistributorPersonProfile;

/**
 *
 * @author Sameer
 */

public class MasterOrderList {
    ArrayList<Order> orders;
    MasterOrderReport masterorderreport;
    private List<Order> orderList;
    private List<OrderStatusObserver> observers;
    
    public MasterOrderList(){
        orders = new ArrayList();
        this.orderList = new ArrayList<Order>();
        observers = new ArrayList<>();
       
    }
    
    public Order newOrder(SuperMarketProfile sp){
        Order o= new Order(sp);
        orders.add(o);
        return o;
            
 
    }
    public Order newOrder(SuperMarketProfile cp, DistributorPersonProfile spp){
        Order o= new Order(cp, spp);
        orders.add(o);
        return o;
            
 
    }
    
    public MasterOrderReport generateMasterOrderReport(){
    masterorderreport = new MasterOrderReport();
        
    return masterorderreport;
    }

    public int getSalesVolume(){

        int sum = 0;
        for(Order order: orders){
            sum = sum + order.getOrderTotal();
        }
        return sum;
    }


    public ArrayList<Order> getOrders() {
        return orders;
    }
 
     public Order findOrderById(int orderId) {
        for (Order order : orders) {
            if (order.getOrderId() == orderId) {
                return order; // Return the matching order
            }
        }
        return null; // If no matching order is found, return null
    }
     
     
     public void addOrder(Order order) {
        this.orders.add(order); // Add directly to the orders list
        notifyOrderStatusChanged(order);
    }

 
     public void registerObserver(OrderStatusObserver observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public void notifyOrderStatusChanged(Order order) {
        for (OrderStatusObserver observer : observers) {
            observer.updateOrderStatus(order);
        }
    }
    
}
