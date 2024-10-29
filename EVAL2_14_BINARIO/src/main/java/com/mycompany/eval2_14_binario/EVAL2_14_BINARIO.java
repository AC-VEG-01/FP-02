/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eval2_14_binario;

import java.util.Scanner;

/**
 *
 * @author everv
 */
public class EVAL2_14_BINARIO {

    public static void main(String[] args) {
        int num,residuo;
        Scanner cap= new Scanner(System.in);
        String binario = "";
        System.out.println("Ingrese el numero entero:");
        num= cap.nextInt();
        
        if (num==0){
            System.out.println("El numero binario es:0");
        }else{
            while (num>0){
                residuo=num %2;
                binario= residuo+binario;
                num=num/2;
                
                
            }
            System.out.println("Ingrese el numero binario: " + binario);
        }
    }
}
