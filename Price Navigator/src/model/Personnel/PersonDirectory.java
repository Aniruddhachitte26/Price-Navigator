/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Personnel;

import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author Aniruddha
 */
public class PersonDirectory {
    
      ArrayList<Person> personlist ;
    
      public PersonDirectory (){
          
       personlist = new ArrayList();

    }

    public Person newPerson(String id) {

        Person p = new Person(id);
        personlist.add(p);
        return p;
    }
    
       public Person newPerson(String id,String name,String email,String address,String gender,int age) {

        Person p = new Person(id,name,email,address,gender,age);
        personlist.add(p);
        return p;
    }

    public Person findPerson(String id) {

        for (Person p : personlist) {

            if (p.isMatch(id)) {
                return p;
            }
        }
            return null; //not found after going through the whole list
         }
    
}
