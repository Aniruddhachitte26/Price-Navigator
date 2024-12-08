/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.ProductManagement;

import java.util.ArrayList;
import model.OrderManagement.OrderItem;

/**
 *
 * @author alshi
 */
public class Product {

    private String name;
    private int floorPrice;
    private int ceilingPrice;
    private int targetPrice;
    private double sugarPercentage;     // Sugar content as a percentage
    private double transfatPercentage;  // Trans fat content as a percentage
    private double sodiumPercentage;    // Sodium content as a percentage
    private double cholesterolPercentage;// Cholesterol content as a percentage

    private double price;
    private int quantity;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getSugarPercentage() {
        return sugarPercentage;
    }

    public void setSugarPercentage(double sugarPercentage) {
        this.sugarPercentage = sugarPercentage;
    }

    public double getTransfatPercentage() {
        return transfatPercentage;
    }

    public void setTransfatPercentage(double transfatPercentage) {
        this.transfatPercentage = transfatPercentage;
    }

    public double getSodiumPercentage() {
        return sodiumPercentage;
    }

    public void setSodiumPercentage(double sodiumPercentage) {
        this.sodiumPercentage = sodiumPercentage;
    }

    public double getCholesterolPercentage() {
        return cholesterolPercentage;
    }

    public void setCholesterolPercentage(double cholesterolPercentage) {
        this.cholesterolPercentage = cholesterolPercentage;
    }

    ArrayList<OrderItem> orderitems;

    public Product(double sugarPercentage, double transfatPercentage, double sodiumPercentage, double cholesterolPercentage, int floorPrice, int ceilingPrice, int targetPrice) {
        this.sugarPercentage = sugarPercentage;
        this.transfatPercentage = transfatPercentage;
        this.sodiumPercentage = sodiumPercentage;
        this.cholesterolPercentage = cholesterolPercentage;
        this.floorPrice = floorPrice;
        this.ceilingPrice = ceilingPrice;
        this.targetPrice = targetPrice;
        orderitems = new ArrayList();
    }

    public Product(String name, double sugarPercentage, double transfatPercentage, double sodiumPercentage, double cholesterolPercentage) {
        this.name = name;
        this.sugarPercentage = sugarPercentage;
        this.transfatPercentage = transfatPercentage;
        this.sodiumPercentage = sodiumPercentage;
        this.cholesterolPercentage = cholesterolPercentage;
        orderitems = new ArrayList();
    }

    public Product(int fp, int cp, int tp) {

        floorPrice = fp;
        ceilingPrice = cp;
        targetPrice = tp;
        orderitems = new ArrayList();

    }

    public Product(String name, double sugarPercentage, double transfatPercentage, double sodiumPercentage, double cholesterolPercentage, int floorPrice, int ceilingPrice, int targetPrice) {
        this.name = name;

        this.sugarPercentage = sugarPercentage;
        this.transfatPercentage = transfatPercentage;
        this.sodiumPercentage = sodiumPercentage;
        this.cholesterolPercentage = cholesterolPercentage;
        this.floorPrice = floorPrice;
        this.ceilingPrice = ceilingPrice;
        this.targetPrice = targetPrice;
        orderitems = new ArrayList();
    }

    public Product(String n, int fp, int cp, int tp) {
        name = n;
        floorPrice = fp;
        ceilingPrice = cp;
        targetPrice = tp;
        orderitems = new ArrayList();
    }

    public Product updateProduct(double sp, double tp, double cp, double sup, int floor, int ceil, int target) {
        sugarPercentage = sup;     // Sugar content as a percentage
        transfatPercentage = tp;  // Trans fat content as a percentage
        sodiumPercentage = sp;    // Sodium content as a percentage
        cholesterolPercentage = cp;// Choleste
        floorPrice = floor;
        ceilingPrice = ceil;
        targetPrice = target;
        return this;

    }

    public Product updateProduct(double sp, double tp, double cp, double sup) {
        sugarPercentage = sup;     // Sugar content as a percentage
        transfatPercentage = tp;  // Trans fat content as a percentage
        sodiumPercentage = sp;    // Sodium content as a percentage
        cholesterolPercentage = cp;// Choleste

        return this;

    }

    public int getTargetPrice() {
        return targetPrice;
    }

    public void addOrderItem(OrderItem oi) {
        orderitems.add(oi);
    }

    //Number of item sales above target 
    public int getNumberOfProductSalesAboveTarget() {
        int sum = 0;
        for (OrderItem oi : orderitems) {
            if (oi.isActualAboveTarget() == true) {
                sum = sum + 1;
            }
        }
        return sum;
    }

    public int getNumberOfProductSalesBelowTarget() {
        int sum = 0;
        for (OrderItem oi : orderitems) {
            if (oi.isActualBelowTarget() == true) {
                sum = sum + 1;
            }
        }
        return sum;
    }

    public boolean isProductAlwaysAboveTarget() {

        for (OrderItem oi : orderitems) {
            if (oi.isActualAboveTarget() == false) {
                return false; //
            }
        }
        return true;
    }
    //calculates the revenues gained or lost (in relation to the target)
    //For example, if target is at $2000 and actual is $2500 then revenue gained
    // is $500 above the expected target. If the actual is $1800 then the lose will be $200
    // Add all these difference to get the total including wins and loses

    public int getOrderPricePerformance() {
        int sum = 0;
        for (OrderItem oi : orderitems) {
            sum = sum + oi.calculatePricePerformance();     //positive and negative values       
        }
        return sum;
    }

    public int getSalesVolume() {
        int sum = 0;
        for (OrderItem oi : orderitems) {
            sum = sum + oi.getOrderItemTotal();     //positive and negative values       
        }
        return sum;
    }

    public void setName(String n) {
        name = n;
    }

    @Override
    public String toString() {
        return name;
    }

    public int getFloorPrice() {
        return floorPrice;
    }

    public int getCeilingPrice() {
        return ceilingPrice;
    }

    public String getName() {
        return name;
    }

    public void setTargetPrice(int targetPrice) {
        this.targetPrice = targetPrice;
    }

}
