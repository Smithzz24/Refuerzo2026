/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.refuerzo2026;
import java.util.Scanner;

/**
 * Búsqueda de un valor en un arreglo Dado un arreglo de números, el usuario
 * ingresa un valor y el programa debe indicar si dicho valor existe o no dentro
 * del arreglo.
 * @author Smith
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int min = 1;
        int max = 10;
        int Aleatorio = (int) (Math.random() * (max - min + 1)) + min;

        int[] numeros = new int[Aleatorio];

        for (int i = 0; i < numeros.length; i++){
            int numArreglo = (int) (Math.random() * (max - min + 1)) + min;
            numeros[i] = numArreglo;
        }
        
        System.out.print("Ingrese el valor a buscar: ");
        int numBuscado = scanner.nextInt();

        boolean Buscador = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numBuscado) {
                Buscador = true;
                break;
            }
        }

        if (Buscador) {
            System.out.println("El valor SI existe en el arreglo.");
        } else {
            System.out.println("El valor NO existe en el arreglo.");
        }
        
        
        
    }

}
