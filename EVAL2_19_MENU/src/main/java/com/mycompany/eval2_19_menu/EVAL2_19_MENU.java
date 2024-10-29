/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eval2_19_menu;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EVAL2_19_MENU {

    public static void main(String[] args) {
       String menu[];
       int precios[];
       Scanner cap= new Scanner(System.in);
       int cant;
       System.out.println("Cuantos productos tendra el menu:");
       cant=cap.nextInt();
       menu=new String[cant];
       precios=new int [cant];
       for(int i =0; i<menu.length; i++){
           System.out.println("Nombre del producto:");
           menu[i]= cap.nextLine();
           System.out.println("Precio:");
           precios[i]= cap.nextInt();
           cap.nextLine();
       }
       for(int i =0; i< menu.length; i++){
           System.out.print(i+" - "+ menu[i] + "$" + precios[i]);
           
       }
       }
}
    

