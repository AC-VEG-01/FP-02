/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eval2_10_validarr;

import java.util.Scanner;

/**
 *
 * @author everv
 */
public class EVAL2_10_VALIDARR {

    public static void main(String[] args) {
   int diass;
        Scanner cap = new Scanner(System.in);

        // Ciclo para capturar un número de día válido
        do {
            System.out.println("Captura el numero de dia de la semana (1 a 7):");
            diass= cap.nextInt();
        } while (diass< 1 || diass> 7);

        // Determinar el día de la semana
        if (diass== 1) {
            System.out.println("Domingo");
        } else if (diass== 2) {
            System.out.println("Lunes");
        } else if (diass== 3) {
            System.out.println("Martes");
        } else if (diass== 4) {
            System.out.println("Miércoles");
        } else if (diass== 5) {
            System.out.println("Jueves");
        } else if (diass== 6) {
            System.out.println("Viernes");
        } else if (diass== 7) {
            System.out.println("Sábado");
              
        
        }
    }
}