/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import model.ProductManagement.PriceChangeRequest;
import model.ProductManagement.Product;
import model.ProductManagement.ProductCatalog;
import model.ProductManagement.ProductSummary;
import model.ProductManagement.ProductsReport;

/**
 *
 * @author divyansjemni
 */

public class Supplier {
    String name;
    
    ProductCatalog productcatalog;
    ProductsReport productsreport;
    
    private List<PriceChangeRequest> priceChangeRequests = new ArrayList<>();
    
    public Supplier(String n){
        name = n;
        productcatalog = new ProductCatalog("software");
        
    }
    
    public ProductsReport prepareProductsReport(){
        
        productsreport = productcatalog.generatProductPerformanceReport();
        return productsreport;
    }
    
    public ArrayList<ProductSummary> getProductsAlwaysAboveTarget(){
       
        if(productsreport==null) productsreport = prepareProductsReport();
       return productsreport.getProductsAlwaysAboveTarget();
       
    }
    
    public String getName(){
        return name;
    }
        public ProductCatalog getProductCatalog(){
        return productcatalog;
    }
    //add supplier product ..
    
    //update supplier product ...
        

    public void addPriceChangeRequest(PriceChangeRequest request) {
            if (this.priceChangeRequests == null) {
            this.priceChangeRequests = new ArrayList<>();
        }
        this.priceChangeRequests.add(request);
    }

    public List<PriceChangeRequest> getPriceChangeRequests() {
        return priceChangeRequests;
    }
    
    
     public void approvePriceChangeRequest(PriceChangeRequest request) {
        // Find the product that matches the request
        for (Product product : productcatalog.getProductList()) {
            if (product.getName().equalsIgnoreCase(request.getProductName())) {
                // Update the target price of the product
                product.setTargetPrice(request.getNewTargetPrice());
                // Set the request as approved
                request.setIsApproved(true);
                break;
            }
        }
        
        
    }
     
    public List<PriceChangeRequest> getUnapprovedPriceChangeRequests() {
        return priceChangeRequests.stream()
                                  .filter(request -> !request.isIsApproved())
                                  .collect(Collectors.toList());
    }
    
    
    public PriceChangeRequest findPriceChangeRequestByProductName(String productName) {
    for (PriceChangeRequest request : priceChangeRequests) {
        if (request.getProductName().equals(productName) && !request.isIsApproved()) {
            return request;
        }
    }
    return null;
}
    
    @Override
   public String toString(){
       return name;
       
   }
   
   
   
   
}
