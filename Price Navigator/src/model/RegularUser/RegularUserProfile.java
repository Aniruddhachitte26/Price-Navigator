/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.RegularUser;

import java.util.ArrayList;
import java.util.List;
import model.OrderManagement.Order;
import model.Personnel.Person;
import model.Personnel.Profile;

/**
 *
 * @author diviyanjemni
 */
public class RegularUserProfile extends Profile {

    ArrayList<Order> distributororders;
    private List<Order> orders;

    public RegularUserProfile(Person p) {

        super(p);
        distributororders = new ArrayList();
        this.orders = new ArrayList<>();

    }

    public ArrayList<Order> getSalesOrders() {
        return this.distributororders;
    }

    public void addSalesOrder(Order o) {
        distributororders.add(o);
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }

    @Override
    public String getRole() {
        return "RegularUser";
    }

}
    

