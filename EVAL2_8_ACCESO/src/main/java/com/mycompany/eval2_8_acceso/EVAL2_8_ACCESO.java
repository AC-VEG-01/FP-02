/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eval2_8_acceso;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EVAL2_8_ACCESO {

    public static void main(String[] args) {
        System.out.println("PROGRAMA PRINCIPAL");
        String usuario,pass;
        Scanner cap= new Scanner (System.in);
        do{
        System.out.println("Ingrese su usuario:");
        usuario=cap.nextLine();
        System.out.println("Ingrese su contraseña:");
         pass=cap.nextLine();
        }while(!usuario.equals("admin") && !pass.equals("1234") );
             
         
     System.out.println("PROGRAMA PRINCIPAL");
}
}


