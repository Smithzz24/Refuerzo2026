/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.refuerzo2026;
import java.util.Scanner;
/**
 *Conversión de monedas
  Crear un algoritmo que reciba una cantidad de dinero en dólares y la convierta a euros, sabiendo que 1 dólar equivale a 0.92 euros.
 * @author Smith
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Conversion de monedas!");
        System.out.println("¿Cuantos dolares desea ingresar?");
        
        int dolares = sc.nextInt();
        
        double euros = dolares *0.92;
        
        System.out.println("Sus $"+dolares+ " equivalen a $"+euros+" euros");
    }
}
