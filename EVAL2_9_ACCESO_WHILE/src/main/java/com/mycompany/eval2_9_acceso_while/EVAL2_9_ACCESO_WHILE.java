/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eval2_9_acceso_while;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EVAL2_9_ACCESO_WHILE {

    public static void main(String[] args) {
      System.out.println("PROGRAMA PRINCIPAL");
        String usuario="",pass="";
        Scanner cap= new Scanner (System.in);
        while(!usuario.equals("admin") && !pass.equals("1234") ){
        System.out.println("Ingrese su usuario:");
        usuario=cap.nextLine();
        System.out.println("Ingrese su contrasena:");
         pass=cap.nextLine();
 
             
         
     System.out.println("PROGRAMA PRINCIPAL");
    }
}
}
