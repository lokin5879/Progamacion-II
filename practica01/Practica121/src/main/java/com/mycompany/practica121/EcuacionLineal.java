/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica121;

/**
 *
 * @author AYRTON
 */
public class EcuacionLineal {

    private double a;
    private double b;
    private double c;

    public EcuacionLineal(double a, double b, double c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getDiscriminante() {
        return (b*b) - (4*a*c);
    }

    public double getRaiz1() {
        double discriminante = getDiscriminante();
        if (discriminante >= 0) {
            return (-b + Math.sqrt(discriminante)) / (2*a);
        }
        return 0;
    }

    public double getRaiz2() {
        double discriminante = getDiscriminante();
        if (discriminante >= 0) {
            return (-b - Math.sqrt(discriminante)) / (2*a);
        }
        return 0;
    }
}