/*
<<<<<<< HEAD
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
=======
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
>>>>>>> a98def8614e33dd84ba0b37f6725b7413c91c31a
 */
package model.Personnel;

import model.Business.Business;
import java.util.ArrayList;

/**
 *
<<<<<<< HEAD
 * @author Aniruddha
 */
public class EmployeeDirectory {

=======
 * @author Sameer
 */
public class EmployeeDirectory {
    
>>>>>>> a98def8614e33dd84ba0b37f6725b7413c91c31a
    Business business;
    ArrayList<EmployeeProfile> employeelist;

    public EmployeeDirectory(Business d) {

        business = d;
        employeelist = new ArrayList();
<<<<<<< HEAD

=======
>>>>>>> a98def8614e33dd84ba0b37f6725b7413c91c31a
    }

    public EmployeeProfile newEmployeeProfile(Person p) {

        EmployeeProfile sp = new EmployeeProfile(p);
        employeelist.add(sp);
        return sp;
    }

    public EmployeeProfile findEmployee(String id) {

        for (EmployeeProfile sp : employeelist) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
            return null; //not found after going through the whole list
         }
<<<<<<< HEAD
=======
   
>>>>>>> a98def8614e33dd84ba0b37f6725b7413c91c31a
    
}
