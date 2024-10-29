/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eval2_6_continue;

/**
 *
 * @author everv
 */
public class EVAL2_6_CONTINUE {

   
        public static void main(String[] args) {
       
        for (int i = 1; i <=10; i++){
            if((i % 2)>0)
                continue;
            System.out.print(i+" - ");
        }
        System.out.println("");
        for (int i = 1; i <=10; i++){
            if((i % 2)==0)
                continue;
            System.out.print(i+" - ");
        }
     }
    }

