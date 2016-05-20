/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.fm;
import com.leapfrog.fm.entity.dao.impl.controller.FoodController;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
         while(true){
        FoodController fc=new FoodController();
        fc.add();
         }       
       
    
    }
    }
