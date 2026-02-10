/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.refuerzo2026;
import java.util.Scanner;
/**
 *Cálculo de salario semanal
    Un trabajador recibe un pago fijo por hora.
    El programa debe solicitar la cantidad de horas trabajadas en la semana y el pago por hora, y calcular el salario semanal total.
 * @author Smith
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el pago por horas:");
        int pagoHoras = sc.nextInt();
        
        System.out.println("¿Cuantas horas trabajó durante la semana?");
        int horasTrabajadas = sc.nextInt();
        
        int totalPago = pagoHoras * horasTrabajadas;
        System.out.println("El trabajador hizo un total de "+ horasTrabajadas +" horas a la semana por un pago de $" +pagoHoras+ " la hora.");
        System.out.println("El trabajador obtuvo un pago de $ "+totalPago);
    }
}
