/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1212;

/**
 *
 * @author AYRTON
 */
public class Estadistica {

    private double[] datos;

    public Estadistica(double[] datos) {
        this.datos = datos;
    }

    public double prom() {
        double suma = 0;
        for (int i = 0; i < datos.length; i++) {
            suma += datos[i];
        }
        return suma / datos.length;
    }

    public double des() {
        double prom = prom();
        double suma = 0;

        for (int i = 0; i < datos.length; i++) {
            suma += Math.pow(datos[i] - prom, 2);
        }

        return Math.sqrt(suma / (datos.length - 1));
    }
}