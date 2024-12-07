/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.ProductManagement;

/**
 *
 * @author manikanta
 */
public class PriceChangeRequest {
    
    private String productName;
    private int newTargetPrice;
    private String salesPersonName; // Assuming you will store the name; alternatively, store the SalesPersonProfile
    private String supplierName; // Assuming you will store the name; alternatively, store the Supplier
    private boolean isApproved;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getNewTargetPrice() {
        return newTargetPrice;
    }

    public void setNewTargetPrice(int newTargetPrice) {
        this.newTargetPrice = newTargetPrice;
    }

    public String getSalesPersonName() {
        return salesPersonName;
    }

    public void setSalesPersonName(String salesPersonName) {
        this.salesPersonName = salesPersonName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public boolean isIsApproved() {
        return isApproved;
    }

    public void setIsApproved(boolean isApproved) {
        this.isApproved = isApproved;
    }
    
    
    
}
