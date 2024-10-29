/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eval2_4_factorial;

import java.util.Scanner;

/**
 *
 * @author everv
 */
public class EVAL2_4_FACTORIAL {

    public static void main(String[] args) {
        int valor,fac;
       Scanner cap= new Scanner (System.in);
       System.out.println("Introduce el valor:");
       valor = cap.nextInt();
       cap.nextLine();
      fac=1;
       for(int i=valor; i>=1; i--){
      fac= fac*i;
             System.out.println("El factorial de =" + valor + "-" + fac);
       }      
    }
}
