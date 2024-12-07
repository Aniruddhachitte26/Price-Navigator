/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.RegulatoryBody;

import java.util.ArrayList;
import model.Personnel.Person;
import model.RegularUser.RegularUserProfile;

/**
 *
 * @author diviyansjemni
 */
public class RegulatoryBodyDirectory {

    ArrayList<RegulatoryBodyProfile> RegulatoryBodyList;

    public RegulatoryBodyDirectory() {
        RegulatoryBodyList = new ArrayList();

    }

    public RegulatoryBodyProfile newRegularatoryBodyProfile(Person p) {

        RegulatoryBodyProfile rp = new RegulatoryBodyProfile(p);
        RegulatoryBodyList.add(rp);
        return rp;
    }

    public RegulatoryBodyProfile findRegularatoryBodyUser(String id) {

        for (RegulatoryBodyProfile rp : RegulatoryBodyList) {

            if (rp.isMatch(id)) {
                return rp;
            }
        }
            return null; //not found after going through the whole list
         }

}
