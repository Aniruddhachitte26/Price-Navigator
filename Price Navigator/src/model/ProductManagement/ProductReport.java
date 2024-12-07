/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.ProductManagement;

import java.util.List;
import model.Supplier.Supplier;
import model.OrderManagement.OrderItem;
/**
 *
 * @author josephjoshiaerrolla
 */
public class ProductReport {
    
    private int newTargetPrice;

    public int getNewTargetPrice() {
        return newTargetPrice;
    }

    public void setNewTargetPrice(int newTargetPrice) {
        this.newTargetPrice = newTargetPrice;
    }
    
    
    public String getSupplierName(Supplier supplier) {
    return supplier.getName();
    }

    public String getProductName(Product product) {
        return product.getName();
    }

    public double getTargetPrice(Product product) {
        return product.getTargetPrice();
    }

    public double getPreviousMarginAroundTarget(Product product, List<OrderItem> orderItems) {
    double totalPreviousMargin = 0;
    double[] improvementPercentages = {0.2, 0.5, 0.7};  // Improvement targets
    
    for (OrderItem item : orderItems) {
        if (item.getSelectedProduct().equals(product)) {
            double sellingPrice = item.getActualPrice();
            double costPrice = product.getFloorPrice();
            int quantity = item.getQuantity();
            double initialMargin = (sellingPrice - costPrice) * quantity;
            
            for (double improvementPercentage : improvementPercentages) {
                double targetMargin = initialMargin * (1 + improvementPercentage);
                // Here you might decide to aggregate or just evaluate these margins
                totalPreviousMargin += targetMargin;  // This could also be a condition to check or store target margins
            }
        }
    }
    return totalPreviousMargin;
}


public double getCurrentMargin(Product product, List<OrderItem> orderItems) {
    double totalCurrentMargin = 0;
    for (OrderItem item : orderItems) {
        if (item.getSelectedProduct().equals(product)) {
            double sellingPrice = item.getActualPrice();
            double costPrice = product.getFloorPrice();  // Assuming the floor price is the cost price
            int quantity = item.getQuantity();
            double margin = (sellingPrice - costPrice) * quantity;
            totalCurrentMargin += margin;
        }
    }
    return totalCurrentMargin;
}
        
}
