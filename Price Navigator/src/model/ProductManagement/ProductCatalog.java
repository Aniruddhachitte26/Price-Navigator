/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.ProductManagement;

import java.util.ArrayList;

/**
 *
 * @author alshi
 */
public class ProductCatalog {
    String type;
    ArrayList<Product> products; //list of products initially empty

    public ProductCatalog(String n) {
        type = n;
         products = new ArrayList();  ///create the list of elements otherwise it is null
    }
// new ProductCatalog(); or new ProductCatalog("Printers");
    public ProductCatalog(    ) {
        type = "unknown";
        products = new ArrayList();
    }/*
    public Product newProduct(int fp, int cp, int tp) {
        Product p = new Product(fp, cp, tp);
        products.add(p);
        return p;
    }
    public Product newProduct(String n, int fp, int cp, int tp) {
        Product p = new Product(n,fp, cp, tp);
        products.add(p);
        return p;
    }
    public Product newProduct(double fp, double cp, double tp,double ap) {
        Product p = new Product(fp, cp, tp ,ap);
        products.add(p);
        return p;
    }
    public Product newProduct(String n, double fp, double cp, double tp,double ap) {
        Product p = new Product(n,fp, cp, tp,ap);
        products.add(p);
        return p;
    }*/
    
            public Product newProduct( double fp, double cp, double tp,double ap, int floor,int ceil,int target) {
        Product p = new Product(fp, cp, tp,ap,floor,ceil,target );
        products.add(p);
        return p;}
        public Product newProduct(String n, double fp, double cp, double tp,double ap, int floor,int ceil,int target) {
        Product p = new Product(n,fp, cp, tp,ap,floor,ceil,target );
        products.add(p);
        return p;
    }

    public ProductsReport generatProductPerformanceReport() {
        ProductsReport productsreport = new ProductsReport();

        for (Product p : products) {

            ProductSummary ps = new ProductSummary(p);
            productsreport.addProductSummary(ps);
        }
        return productsreport;
    }

    public ArrayList<Product> getProductList(){
        return products;
    }
    
//added removeProduct method freshly
    public void removeProduct(Product product) {
        products.remove(product);
    }
    
    public Product findProductByName(String name) {
    for (Product p : products) {
        if (p.getName().equals(name)) {
            return p;
        }
    }
    return null; // Product not found
}
    
       public boolean containsProduct(Product product) {
        return this.products.contains(product);
    }
}

