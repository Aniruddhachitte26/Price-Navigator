/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.SuperMarketManagement;

import model.Business.Business;
import model.Personnel.Person;
import java.util.ArrayList;

/**
 *
 * @author alshi
 */
public class SuperMarketDirectory {

    Business business;
    ArrayList<SuperMarketProfile> customerlist;

    public SuperMarketDirectory(Business d) {

        business = d;
        customerlist = new ArrayList();

    }

    public SuperMarketProfile newCustomerProfile(Person p) {

        SuperMarketProfile sp = new SuperMarketProfile(p);
        customerlist.add(sp);
        return sp;
    }

    public SuperMarketProfile findCustomer(String id) {

        for (SuperMarketProfile sp : customerlist) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
        return null; //not found after going through the whole list
    }

    public ArrayList<SuperMarketProfile> getCustomerlist() {
        return customerlist;
    }

}
