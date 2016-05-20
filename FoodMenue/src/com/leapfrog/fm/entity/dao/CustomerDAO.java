/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.fm.entity.dao;

import com.leapfrog.fm.entity.customer;
import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public interface CustomerDAO {
    int insert(customer s);

    int update(customer s);

    int delete(int id);

     customer getById( int id);

    ArrayList<customer> getAll();
  
    
    
}
