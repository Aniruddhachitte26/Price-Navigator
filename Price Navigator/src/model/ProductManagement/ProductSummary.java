/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.ProductManagement;

/**
 *
 * @author alshi
 */

    public class ProductSummary {

    Product subjectproduct;
    int numberofsalesabovetarget;
    int numberofsalesbelowtarget;
    int productpriceperformance; //total profit above target --could be negative too
    int acutalsalesvolume;
    int rank; // will be done later

    public ProductSummary(Product p) {
        
        subjectproduct = p; //keeps track of the product itself not as well;
        numberofsalesabovetarget = p.getNumberOfProductSalesAboveTarget();
        productpriceperformance = p.getOrderPricePerformance();
        acutalsalesvolume = p.getSalesVolume();
        numberofsalesbelowtarget = p.getNumberOfProductSalesBelowTarget();
    }

    public int getSalesRevenues() {
        return acutalsalesvolume;
    }

    public int getNumberAboveTarget() {
        return numberofsalesabovetarget;
    }

    public int getProductPricePerformance() {
        return productpriceperformance;
    }

    public int getNumberBelowTarget() {
        return numberofsalesbelowtarget;
    }

    public boolean isProductAlwaysAboveTarget() {
        return false; // to be implemented
    }
}


