/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.refuerzo2026;

import java.util.Scanner;

/**
 *  @author Smith
 */
public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int Cnegativos = 0;
        int Cpositivos = 0;

        for (;;) {
            System.out.println("Ingrese un numero");
            int numero = sc.nextInt();
            
            if (numero == 0) {
                System.out.println("El sistema termino");
                System.out.println("La cantidad de numeros negativos es: " + Cnegativos);
                System.out.println("La cantidad de numeros positivos es: " + Cpositivos);
                break;
            }
            if (numero < 0) {
                Cnegativos++;
            } else if (numero > 0) {
                Cpositivos++;
            }
        }
    }
}
