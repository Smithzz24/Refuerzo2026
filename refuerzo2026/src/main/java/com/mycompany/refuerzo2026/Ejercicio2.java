/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.refuerzo2026;
import java.util.Scanner;

/**
 *Área de un rectángulo
    Diseñar un algoritmo que reciba la base y la altura de un rectángulo y muestre su área y su perímetro.
 * @author Smith
 */
public class Ejercicio2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
   System.out.println("Ingrese la base del rectangulo");
   int base = sc.nextInt();
   
   System.out.println("Ingrese la altura del rectangulo");
   int altura = sc.nextInt();
   
   int perimetro = (base*2) + (altura*2);
   int area = base*altura;
        System.out.println("Para un rectangulo de base "+base+" con altura "+altura);
        System.out.println("Se le calcula un area de: "+area);
        System.out.println("Y un perimetro de: "+perimetro);
    }
}
