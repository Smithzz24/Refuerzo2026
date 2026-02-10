/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.refuerzo2026;
import java.util.Scanner;
/**
 *  Mayor de tres números
    Diseñar un algoritmo que lea tres números distintos y muestre cuál es el mayor.
 * @author Smith

 */
public class Ejercicio7 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    
        System.out.println("Ingrese 3 numeros enteros");
        
        System.out.println("Primer numero");
        int num1 = sc.nextInt();
        System.out.println("Segundo numero");
        int num2 = sc.nextInt();
        System.out.println("Tercer numero");
        int num3 = sc.nextInt();
        
        if (num1 == num2 && num1 == num3){
            System.out.println("Los numeros ingresados son iguales");
        } else if (num1 > num2 && num1 > num3){
            System.out.println("El primer numero ("+num1+") es mayor");
        } else if (num2 > num1 && num2 > num3){
            System.out.println("El segundo numero ("+num2+") es mayor");
        } else if (num3 > num2 && num3 > num1){
            System.out.println("El ecer numero ("+num3+") es mayor");    
        }    
    }   
}