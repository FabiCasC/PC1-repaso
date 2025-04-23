/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author fabia
 */
public class OrdenarCalificaciones {
    public static void main(String[] args) {
        int[] calificaciones = {5, 2, 9, 1, 5, 6}; // Arreglo de calificaciones

        // Implementación del método de selección para ordenar de menor a mayor
        for (int i = 0; i < calificaciones.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < calificaciones.length; j++) {
                if (calificaciones[j] < calificaciones[minIndex]) {
                    minIndex = j;
                }
            }
            // Intercambiar el elemento actual con el mínimo
            int temp = calificaciones[i];
            calificaciones[i] = calificaciones[minIndex];
            calificaciones[minIndex] = temp;
        }

        // Imprimir el arreglo ordenado
        System.out.println("Calificaciones ordenadas: ");
        for (int i : calificaciones) {
            System.out.print(i + " ");
        }
    }
}

