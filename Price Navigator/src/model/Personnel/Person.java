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

/**
 *
<<<<<<< HEAD
 * @author Aniruddha
 */
public class Person {
    
    
        String id;
=======
 * @author Sameer
 */
public class Person {
    
    String id;
>>>>>>> a98def8614e33dd84ba0b37f6725b7413c91c31a
        String name;     
        String email;
        String address;
        String gender;
        int age;
        
    public Person(String id, String name, String email, String address,String gender,int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.gender=gender;
        this.age=age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public Person(String id) {

        this.id = id;
    }

    public String getPersonId() {
        return id;
    }

    public boolean isMatch(String id) {
        if (getPersonId().equals(id)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return getPersonId();
    }
<<<<<<< HEAD
=======
    
    
>>>>>>> a98def8614e33dd84ba0b37f6725b7413c91c31a
}
