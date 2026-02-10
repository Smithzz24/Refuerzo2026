/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.refuerzo2026;
import java.util.Scanner;
/**
 *  Tabla de multiplicar
El usuario ingresa un número y el programa muestra su tabla de multiplicar del 1 al 10.
 * @author Smith

 */
public class Ejercicio9 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 

        System.out.println("Ingrese un numero para saber su tabla de multiplicar");
        int num = sc.nextInt();
        int multiplicacion = 0;
        System.out.println("Tabla de multiplicar del numero "+num);
        for (int i=1; i <=10; i++){
            multiplicacion = num * i;
            System.out.println(num + " X "+i+" = "+multiplicacion);
        }
    }
}