/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.refuerzo2026;
import java.util.Scanner;
/**
 *Promedio de notas
    Un estudiante tiene tres calificaciones.
    El programa debe calcular y mostrar el promedio final.
 * @author Smith
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Ingrese las 3 notas del estudiante");
        
        double nota=0;
        double sumaNotas = 0;
        double promedio = 0;
        
        for (int i=1; i<=3; i++){
            System.out.println("Ingrese la nota "+i+":");
            nota = sc.nextDouble();
            sumaNotas = sumaNotas + nota;
        }
        
        promedio = sumaNotas/3;
        
        System.out.println("El promedio del estudiante es: "+promedio);
    
    }
}