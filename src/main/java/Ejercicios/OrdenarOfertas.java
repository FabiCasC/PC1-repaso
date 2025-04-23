/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author fabia
 */
import java.util.Random;

public class OrdenarOfertas {
    public static void main(String[] args) {
        Random rand = new Random();
        double[] precios = new double[20];

        // Generar 20 precios aleatorios con decimales
        for (int i = 0; i < precios.length; i++) {
            precios[i] = 10 + (500 - 10) * rand.nextDouble(); // Precios entre 10 y 500
        }

        // Implementación del método de selección para ordenar de menor a mayor
        for (int i = 0; i < precios.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < precios.length; j++) {
                if (precios[j] < precios[minIndex]) {
                    minIndex = j;
                }
            }
            // Intercambiar los elementos
            double temp = precios[i];
            precios[i] = precios[minIndex];
            precios[minIndex] = temp;
        }

        // Imprimir los precios ordenados
        System.out.println("Precios ordenados de menor a mayor: ");
        for (double precio : precios) {
            System.out.print(precio + " ");
        }
    }
}

