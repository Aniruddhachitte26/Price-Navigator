/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.OrderManagement;

import model.ProductManagement.Product;

/**
 *
 * @author Sameer
 */
public class OrderItem {
    Product selectedproduct;   
    int actualPrice;
    int quantity;

    public OrderItem(Product p, int paidprice, int q) {
        selectedproduct = p;
        p.addOrderItem(this); //make sure product links back to the item
        quantity = q;
        this.actualPrice = paidprice;
    }


    public OrderItem(Product p, int actualprice, double sp, double sup, double tp, double cp) {
         selectedproduct = p;
          p.addOrderItem(this);
            this.actualPrice = actualprice;
                  
    }
    public int getOrderItemTotal() {
        return actualPrice * quantity;
    }

//The following calculates what the price gain would have been if products were sold at target price
    public int getOrderItemTargetTotal() {
        return selectedproduct.getTargetPrice() * quantity;
    }

    //returns positive if seller is making higher margin than target
    //returns negative if seller is making lower margin than target
    //otherwise zero meaning neutral
    public int calculatePricePerformance() {
        return (actualPrice - selectedproduct.getTargetPrice()) * quantity;
    }

    public boolean isActualAboveTarget() {
        if (actualPrice > selectedproduct.getTargetPrice()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isActualBelowTarget() {
        if (actualPrice < selectedproduct.getTargetPrice()) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isActualATTarget() {
        if (actualPrice == selectedproduct.getTargetPrice()) {
            return true;
        } else {
            return false;
        }

    }

    public Product getSelectedProduct() {
        return selectedproduct;
    }

    public int getActualPrice() {
        return actualPrice;

    }

    public int getQuantity() {
        return quantity;
    }
        public void setActualPrice(int actualPrice) {
        this.actualPrice = actualPrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
