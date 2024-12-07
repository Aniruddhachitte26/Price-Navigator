/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Business;


import java.util.ArrayList;
import java.util.List;
import model.SuperMarketManagement.SuperMarketDirectory;
import model.LogisticPartner.LogisticPartnerDirectory;
import model.OrderManagement.MasterOrderList;
import model.Personnel.PersonDirectory;
import model.ProductManagement.ProductSummary;
import model.ProductManagement.ProductsReport;
import model.ProductManagement.Product;
import model.DistributorManagement.DistributorPersonDirectory;
import model.Supplier.Supplier;
import model.Supplier.SupplierDirectory;
import model.UserAccountManagement.UserAccountDirectory;
import model.Personnel.EmployeeDirectory;
import model.RegularUser.RegularUserDirectory;
import model.RegulatoryBody.RegulatoryBodyDirectory;
import model.SuperMarketManagement.SuperMarketProfile;


/**
 *
 * @author Aniruddha
 */
public class Business {

    String name;
    PersonDirectory persondirectory; //all people profiles regardless of the role
    MasterOrderList masterorderlist;
    SuperMarketDirectory customers;
    SupplierDirectory suppliers;
    RegularUserDirectory regularuser;
    SuperMarketDirectory customerdirectory;
    // EmployeeDirectory employeedirectory;
    DistributorPersonDirectory salespersondirectory;
    UserAccountDirectory useraccountdirectory;
    EmployeeDirectory employeedirectory;
    RegulatoryBodyDirectory rbdirectory;
    LogisticPartnerDirectory lpd;


    public Business(String n) {
        name = n;
        masterorderlist = new MasterOrderList();
        suppliers = new SupplierDirectory();
        persondirectory = new PersonDirectory();
        customerdirectory = new SuperMarketDirectory(this);
        salespersondirectory = new DistributorPersonDirectory(this);
        useraccountdirectory = new UserAccountDirectory();
        regularuser = new RegularUserDirectory();
        lpd = new LogisticPartnerDirectory();
        rbdirectory = new RegulatoryBodyDirectory();
        employeedirectory = new EmployeeDirectory(this);

    }
  
    public int getSalesVolume() {
        return masterorderlist.getSalesVolume();

    }

    public PersonDirectory getPersonDirectory() {
        return persondirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return useraccountdirectory;
    }

    
    public RegularUserDirectory getRegularuser() {
        return regularuser;
    }

    public void setRegularuser(RegularUserDirectory regularuser) {
        this.regularuser = regularuser;
    }


    public SupplierDirectory getSupplierDirectory() {
        return suppliers;
    }

    public ProductsReport getSupplierPerformanceReport(String n) {
        Supplier supplier = suppliers.findSupplier(n);
        if (supplier == null) {
            return null;
        }
        return supplier.prepareProductsReport();

    }

    public ArrayList<ProductSummary> getSupplierProductsAlwaysAboveTarget(String n) {

        ProductsReport productsreport = getSupplierPerformanceReport(n);
        return productsreport.getProductsAlwaysAboveTarget();

    }

    public int getHowManySupplierProductsAlwaysAboveTarget(String n) {
        ProductsReport productsreport = getSupplierPerformanceReport(n); // see above
        int i = productsreport.getProductsAlwaysAboveTarget().size(); //return size of the arraylist
        return i;
    }

    public SuperMarketDirectory getCustomerDirectory() {
        return customerdirectory;
    }

    public DistributorPersonDirectory getSalesPersonDirectory() {
        return salespersondirectory;
    }

    public MasterOrderList getMasterOrderList() {
        return masterorderlist;
    }

   
    public List<Product> getAllProducts() {
        List<Product> allProducts = new ArrayList<>();
        for (Supplier supplier : this.getSupplierDirectory().getSuplierList()) {
            allProducts.addAll(supplier.getProductCatalog().getProductList());
        }
        return allProducts;
        
    }
    
        public EmployeeDirectory getEmployeeDirectory() {
        return employeedirectory;
    }

    public RegulatoryBodyDirectory getRbdirectory() {
        return rbdirectory;
    }

    public void setRbdirectory(RegulatoryBodyDirectory rbdirectory) {
        this.rbdirectory = rbdirectory;
    }

    public LogisticPartnerDirectory getLpd() {
        return lpd;
    }

    public void setLpd(LogisticPartnerDirectory lpd) {
        this.lpd = lpd;
    }
        
  public List<SuperMarketProfile> getSupermarketsWithinDistance(int distance) {
    List<SuperMarketProfile> withinDistance = new ArrayList<>();
    for (SuperMarketProfile supermarket : this.customerdirectory.getCustomerlist()) {
        if (supermarket.getDistance() <= distance) {
            withinDistance.add(supermarket);
        }
    }
    return withinDistance;
}

public List<SuperMarketProfile> getSupermarketsBeyondDistance(int distance) {
    List<SuperMarketProfile> beyondDistance = new ArrayList<>();
    for (SuperMarketProfile supermarket : this.customerdirectory.getCustomerlist()) {
        if (supermarket.getDistance() > distance) {
            beyondDistance.add(supermarket);
        }
    }
    return beyondDistance;
} 


}
