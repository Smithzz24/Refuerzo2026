/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.refuerzo2026;
import java.util.Scanner;
/**
 *Aprobado o reprobado
    Un estudiante aprueba si su nota es mayor o igual a 60.
    El programa debe mostrar si el estudiante aprueba o reprueba según su calificación.
 * @author Smith

 */
public class Ejercicio6 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
        System.out.println("Ingrese la nota");
        int nota = sc.nextInt();
        
        if (nota >=60) {
            System.out.println("El estudiante aprobo");
        } else {
            System.out.println("El estudiante reprobo");
        }
    }
}
    