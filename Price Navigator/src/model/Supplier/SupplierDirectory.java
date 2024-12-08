/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Supplier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import model.Personnel.Person;
import model.ProductManagement.Product;

/**
 *
 * @author alshi
 */
public class SupplierDirectory {

    ArrayList<Supplier> suppliers;
    private Map<Supplier, SupplierProfile> supplierProfiles;

    public SupplierDirectory() {
        suppliers = new ArrayList();
        supplierProfiles = new HashMap<>();
    }

    public Supplier newSupplier(String n) {
        Supplier supplier = new Supplier(n);
        suppliers.add(supplier);
        return supplier;

    }

    public Supplier findSupplier(String id) {

        for (Supplier supplier : suppliers) {

            if (supplier.getName().equals(id)) {
                return supplier;
            }
        }
        return null;
    }

    public ArrayList<Supplier> getSuplierList() {
        return suppliers;
    }

    public SupplierProfile newSupplierProfile(Supplier supplier, Person p) {
        SupplierProfile supplierProfile = new SupplierProfile(p, supplier);
        supplierProfiles.put(supplier, supplierProfile);
        return supplierProfile;
    }

    public Optional<Supplier> findSupplierByProduct(Product product) {
        for (Supplier supplier : this.suppliers) {
            // Assuming ProductCatalog has a method to check if it contains a Product
            if (supplier.getProductCatalog().containsProduct(product)) {
                return Optional.of(supplier);
            }
        }
        return Optional.empty();
    }

    public SupplierProfile getSupplierProfile(Supplier supplier) {
        return supplierProfiles.get(supplier);
    }

}
