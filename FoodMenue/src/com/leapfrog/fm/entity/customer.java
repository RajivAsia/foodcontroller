/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.fm.entity;

/**
 *
 * @author lenovo
 */
public class customer {
    private int id;
    private String firstName, Address;
    private boolean status;

    public customer() {
    }

    public customer(int id, String firstName, String Address, boolean status) {
        this.id = id;
        this.firstName = firstName;
        this.Address = Address;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "customer{" + "id=" + id + ", firstName=" + firstName + ", Address=" + Address + ", status=" + status + '}';
    }
    
            
    
}
