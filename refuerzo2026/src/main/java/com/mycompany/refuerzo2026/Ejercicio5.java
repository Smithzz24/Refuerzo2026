/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.refuerzo2026;
import java.util.Scanner;
/**
 *Comparación de dos números
Diseñar un algoritmo que lea dos números enteros e indique si el primer número es mayor, si el segundo es mayor o si ambos son iguales.
 * @author Smith

 */
public class Ejercicio5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
        System.out.println("Ingrese 2 numeros enteros");
        
        System.out.println("Primer numero");
        int num1 = sc.nextInt();
        System.out.println("Segundo numero");
        int num2 = sc.nextInt();
        
        if (num1 == num2){
            System.out.println("Los numeros ingresados son iguales");
        } else if (num1 > num2){
            System.out.println("El primer numero ingresado ("+num1+") es mayor que el segundo ("+num2+")");
        }else
            System.out.println("El segundo numero ingresado ("+num2+") es mayor que el primero ("+num1+")");
        
        
    }
}
