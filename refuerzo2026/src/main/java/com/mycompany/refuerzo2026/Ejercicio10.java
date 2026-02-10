/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.refuerzo2026;
import java.util.Scanner;
/**
 *  Suma de números
    Diseñar un algoritmo que sume los primeros N números naturales, donde N es ingresado por el usuario.
 * @author Smith

 */
public class Ejercicio10 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    
        System.out.println("Cuantos numeros desea sumar?");
        int N = sc.nextInt();
        int suma = 0;
        System.out.println("Ingrese los numeros a sumar");
        for(int i = 0; i < N; i++){
            suma += sc.nextInt();
        }
        System.out.println("El resultado de la suma es: "+suma);
    }
}