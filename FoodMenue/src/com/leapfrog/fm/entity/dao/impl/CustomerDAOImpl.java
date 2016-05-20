/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.fm.entity.dao.impl;

import com.leapfrog.fm.entity.customer;
import com.leapfrog.fm.entity.dao.CustomerDAO;
import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class CustomerDAOImpl implements CustomerDAO {
     ArrayList<customer> customerList = new ArrayList<>();

    @Override
    public int insert(customer s) {
       customerList.add(s);
               return 1;
               
    }

    @Override
    public int update(customer s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) {
       customer s = getById(id);
        if (s != null) {
            customerList.remove(s);
            return 1;
    }
        return 0;
    }
    @Override
    public customer getById(int id) {
       for(customer s: customerList){
           if(s.getId()==id){
               return s;
           }
       }
       return null;
    }

    @Override
    public ArrayList<customer> getAll() {
       return customerList;
    }

}
