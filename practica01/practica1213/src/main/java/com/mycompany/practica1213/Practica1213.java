/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica1213;

/**
 *
 * @author AYRTON
 */
        import java.util.Scanner;

public class Practica1213 {

    public static void main(String[] args) {

      
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese a,b,c,d,e,f: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();

        EcuacionLineal ecuacion = new EcuacionLineal(a,b,c,d,e,f);

        if (ecuacion.tieneSolucion()) {
            double x = ecuacion.getX();
            double y = ecuacion.getY();
            System.out.println("x =" + x + ", y = " + y);
        } else {
            System.out.println("La ecuacion no tiene solucion."); 
        }

        scanner.close();
    }
}
    