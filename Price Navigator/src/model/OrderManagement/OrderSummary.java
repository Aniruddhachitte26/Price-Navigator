/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.OrderManagement;

/**
 *
 * @author Sameer
 */
public class OrderSummary {
    Order subjectorder;
    int salesvolume;
    boolean totalabovetarget;
    int orderpriceperformance;
    int numberofOrderitemsabovetarget;
    int numberofOrdeitemsbelowtarget;
    
    public OrderSummary(Order o){
    subjectorder = o;
    salesvolume = o.getOrderTotal();
    totalabovetarget = o.isOrderAboveTotalTarget();
    orderpriceperformance = o.getOrderPricePerformance();
    numberofOrderitemsabovetarget = o.getNumberOfOrderItemsAboveTarget();
//numberofOrdeitemsbelowtarget = o.getNumberOfOrderItemsBelowTarget();
    }

    public Order getSubjectOrder(){ return subjectorder;}

    public int getOrderProfit(){
    return orderpriceperformance;
    }
 
}
