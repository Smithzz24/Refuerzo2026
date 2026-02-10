/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.refuerzo2026;
import java.util.Scanner;
/**
/**
 *
 * @author diang
 */
public class Ejercicio15 {
    // Sistema de estudiantes (Programación Orientada a Objetos)
    // Diseñar una clase Estudiante que tenga como atributos: nombre, curso matriculado y tres calificaciones.
    // El programa debe permitir crear un estudiante, calcular su promedio y mostrar si aprueba o reprueba.
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Martín", "Matemáticas", 4, 3.4, 2.8);
        System.out.println("Esl promedio del estudiante es "+estudiante.promedio());
        estudiante.aprobo();
    }
    
}
class Estudiante {
    private String nombre;
    private String cursoMatriculado;
    private double calificacionUno;
    private double calificacionDos;
    private double calificacionTres;
    
    public Estudiante(String nombre, String cursoMatriculado, double calificacionUno, double calificacionDos, double calificacionTres) {
        this.nombre = nombre;
        this.cursoMatriculado = cursoMatriculado;
        this.calificacionUno = calificacionUno;
        this.calificacionDos = calificacionDos;
        this.calificacionTres = calificacionTres;
    }
    
    public double promedio() {
        double promedio = (calificacionUno + calificacionDos + calificacionTres) / 3;
        return promedio;
    }
    
    public void aprobo() {
        double promedio = promedio();
        if (promedio >= 3) {
            System.out.println("El estudiante aprobó.");
        } else {
            System.out.println("El estudiante reprobó.");
        }
    }
}