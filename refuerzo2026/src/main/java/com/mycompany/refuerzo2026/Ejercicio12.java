/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.refuerzo2026;

import java.util.Scanner;

/**
 * Número mayor y menor El usuario ingresará varios números hasta ingresar -1.
 * El programa debe mostrar el número mayor y el número menor de todos los
 * valores ingresados.
 *  @author Smith
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.println("Ingrese numeros (-1 para cerrar el progrma)");

        for (;;) {
            number = scanner.nextInt();

            if (number == -1) {
                break;
            }

            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }
        }
        
        System.out.println("El numero mayor: " + max);
        System.out.println("El numero menor: " + min);
    }
}
