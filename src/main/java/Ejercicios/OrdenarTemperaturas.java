/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author fabia
 */
public class OrdenarTemperaturas {
    public static void main(String[] args) {
        int[] temperaturas = {3, -1, 4, -5, 0}; // Arreglo de temperaturas

        // Ordenar con el método de selección (menor a mayor)
        for (int i = 0; i < temperaturas.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < temperaturas.length; j++) {
                if (temperaturas[j] < temperaturas[minIndex]) {
                    minIndex = j;
                }
            }
            // Intercambio de elementos
            int temp = temperaturas[i];
            temperaturas[i] = temperaturas[minIndex];
            temperaturas[minIndex] = temp;
        }

        // Imprimir las temperaturas ordenadas
        System.out.println("Temperaturas ordenadas de menor a mayor: ");
        for (int temp : temperaturas) {
            System.out.print(temp + " ");
        }
    }
}

