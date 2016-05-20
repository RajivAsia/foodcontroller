/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.fm.entity.dao;

import com.leapfrog.fm.entity.Food;
import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public interface FoodDAO {
    int insert(Food f);

    int update(Food s);

    int delete(int id);

    Food getById(int id);

    ArrayList<Food> getAll();
    ArrayList<Food> search(String param);
    
    
}
