/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.RegularUser;

import java.util.ArrayList;
import java.util.List;
import model.Business.Business;
import model.Personnel.Person;

/**
 *
 * @author diviyasjemni
 */
public class RegularUserDirectory {

    ArrayList<RegularUserProfile> regularuserlist;

    public RegularUserDirectory() {
        regularuserlist = new ArrayList();

    }

    public RegularUserProfile newRegularUserProfile(Person p) {

        RegularUserProfile sp = new RegularUserProfile(p);
        regularuserlist.add(sp);
        return sp;
    }

    public RegularUserProfile findRegularUser(String id) {

        for (RegularUserProfile sp : regularuserlist) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
        return null; //not found after going through the whole list
    }

    // Method to get all regular user profiles
    public List<RegularUserProfile> getRegularUserProfiles() {
        return regularuserlist;
    }

}
