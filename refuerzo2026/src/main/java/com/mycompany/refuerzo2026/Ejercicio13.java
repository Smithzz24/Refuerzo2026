/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.refuerzo2026;

import java.util.Scanner;

/**
 * Promedio de un arreglo Diseñar un algoritmo que almacene 10 números en un
 * arreglo y calcule el promedio, el número mayor y el menor.
 *  @author Smith
 */
public class Ejercicio13{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arreglo = new int[10];
        int sum = 0;
        int max, min;

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            arreglo[i] = sc.nextInt();
            sum += arreglo[i];
        }

        max = arreglo[0];
        min = arreglo[0];

        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > max) {
                max = arreglo[i];
            }
            if (arreglo[i] < min) {
                min = arreglo[i];
            }
        }

        double promedio = (double) sum / arreglo.length;

        System.out.println("El promedio es: " + promedio + " el numero mayor: " + max + " el numero menor: " + min);
    }
}
