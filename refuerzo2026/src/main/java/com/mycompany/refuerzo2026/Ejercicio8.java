/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.refuerzo2026;
import java.util.Scanner;
/**
 *  Descuento en una compra
Si el monto de una compra es mayor a 100, se aplica un 10% de descuento.
El algoritmo debe mostrar el total a pagar.
 * @author Smith

 */
public class Ejercicio8 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    
        System.out.println("Ingrese el monto total de su compra");
        int monto = sc.nextInt();
        
        if (monto > 100) {
            System.out.println("Enhorabuena! Su compra recibira un 10% de descuento");
            double descuento = monto *0.9;
            System.out.println("Con el descuento aplicado, usted debe de pagar:");
            System.out.println("$"+descuento);
        }
    }
}