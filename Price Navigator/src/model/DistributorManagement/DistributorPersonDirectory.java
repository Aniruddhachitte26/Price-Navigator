/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DistributorManagement;

import model.Business.Business;
import java.util.ArrayList;
import model.Personnel.Person;

/**
 *
 * @author Aniruddha
 */
public class DistributorPersonDirectory {

    Business business;
    ArrayList<DistributorPersonProfile> distributorlist;

    public DistributorPersonDirectory(Business d) {

        business = d;
        distributorlist = new ArrayList();

    }

    public DistributorPersonProfile newSalesPersonProfile(Person p) {

        DistributorPersonProfile sp = new DistributorPersonProfile(p);
        distributorlist.add(sp);
        return sp;
    }

    public DistributorPersonProfile findSalesPerson(String id) {

        for (DistributorPersonProfile sp : distributorlist) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
            return null; //not found after going through the whole list
         }

}
