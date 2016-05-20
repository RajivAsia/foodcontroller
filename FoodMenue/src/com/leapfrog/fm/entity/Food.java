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
public class Food {
    private int foodid,amount;
    private String foodName, foodescription;

    public Food() {
    }

    public Food(int foodid, int amount, String foodName, String foodescription) {
        this.foodid = foodid;
        this.amount = amount;
        this.foodName = foodName;
        this.foodescription = foodescription;
    }

    public int getFoodid() {
        return foodid;
    }

    public void setFoodid(int foodid) {
        this.foodid = foodid;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodescription() {
        return foodescription;
    }

    public void setFoodescription(String foodescription) {
        this.foodescription = foodescription;
    }

    @Override
    public String toString() {
        return "Food{" + "foodid=" + foodid + ", amount=" + amount + ", foodName=" + foodName + ", foodescription=" + foodescription + '}';
    }
    
    
}
