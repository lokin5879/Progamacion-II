/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica1212;

/**
 *
 * @author AYRTON
 */
import java.util.Scanner;

public class Practica1212 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.println("Ingrese 10 números:");

        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextDouble();
        }

        Estadistica est = new Estadistica(numeros);

        System.out.println("El promedio es " + est.prom());
        System.out.println("La desviación estándar es " + est.des());

        sc.close();
    }
}
   
