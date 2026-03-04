/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eluno;

/**
 *
 * @author AYRTON
 */
import java.util.Random;

public class ELUno {

    public static void main(String[] args) {

        int tamano = 100000;
        int[] numeros = new int[tamano];
        Random random = new Random();

        for (int i = 0; i < tamano; i++) {
            numeros[i] = random.nextInt(100000);
        }

        System.out.println("Iniciando ordenación de " + tamano + " números...");
        
        Cronometro miCronometro = new Cronometro();
        
        miCronometro.inicia();
        
        seleccionSort(numeros);
        
        miCronometro.detener();

        System.out.println("¡Ordenación completada!");
        System.out.println("Tiempo transcurrido: " + miCronometro.lapsoDeTiempo() + " milisegundos.");
    }

    public static void seleccionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int temporal = arr[indiceMinimo];
            arr[indiceMinimo] = arr[i];
            arr[i] = temporal;
        }
    }
}

