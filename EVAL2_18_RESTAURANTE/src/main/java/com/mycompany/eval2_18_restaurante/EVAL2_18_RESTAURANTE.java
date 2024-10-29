/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eval2_18_restaurante;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EVAL2_18_RESTAURANTE {

    public static void main(String[] args) {
        Scanner capt= new Scanner (System.in);
        int cantidad,producto;
     String menu[]={"Dogos","Hamburgesa","Boneless","Tacos","Montados","Camarones"};
     int precios[]={50,80,120,150,70,200};
      for(int i=0; i < menu.length; i++){
    System.out.println(i+ " - "+ menu[i]+" $ "+ precios[i]);
     
            
    }
      System.out.println("Cual es su pedido? (introduccir numero del pedido)");
      producto=capt.nextInt();
      capt.nextLine();
      System.out.println("Cuantas ordenes?");
      cantidad=capt.nextInt();
      capt.nextLine();
      System.out.println("El costo es de = $" + cantidad* precios[producto] );
}
}
