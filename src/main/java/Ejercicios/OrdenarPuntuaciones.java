/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author fabia
 */
public class OrdenarPuntuaciones {
    public static void main(String[] args) {
        int[] puntuaciones = {3, 6, 1, 8, 2}; // Arreglo de puntuaciones

        // Método de inserción para ordenar de mayor a menor
        for (int i = 1; i < puntuaciones.length; i++) {
            int key = puntuaciones[i];
            int j = i - 1;
            while (j >= 0 && puntuaciones[j] < key) {
                puntuaciones[j + 1] = puntuaciones[j];
                j--;
            }
            puntuaciones[j + 1] = key;
        }

        // Imprimir el arreglo ordenado
        System.out.println("Puntuaciones ordenadas de mayor a menor: ");
        for (int i : puntuaciones) {
            System.out.print(i + " ");
        }
    }
}

