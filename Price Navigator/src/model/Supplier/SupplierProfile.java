/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model.Supplier;

/**
 *
 * @author Aniruddha
 */


import model.Personnel.Person;
import model.Personnel.Profile;

public class SupplierProfile extends Profile {
    private Supplier supplier;

    public SupplierProfile(Person p, Supplier s) {
        super(p);
        this.supplier = s;
    }

    @Override
    public String getRole() {
        return "Supplier";
    }

    public Supplier getSupplier(){
        return supplier;
    }
    
       public SupplierProfile(Person p) {
        super(p);
    }
       
}

