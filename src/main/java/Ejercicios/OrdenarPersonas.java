/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author fabia
 */

public class OrdenarPersonas {
    public static void main(String[] args) {
        String[] nombres = {"Luis", "Ana", "Carlos"};
        int[] edades = {25, 19, 30};

        // Método polifásico (ordenación por edad de menor a mayor)
        for (int i = 0; i < edades.length - 1; i++) {
            for (int j = i + 1; j < edades.length; j++) {
                if (edades[i] > edades[j]) {
                    // Intercambio de edades
                    int tempEdad = edades[i];
                    edades[i] = edades[j];
                    edades[j] = tempEdad;

                    // Intercambio de nombres
                    String tempNombre = nombres[i];
                    nombres[i] = nombres[j];
                    nombres[j] = tempNombre;
                }
            }
        }

        // Imprimir las personas ordenadas por edad
        System.out.println("Personas ordenadas por edad: ");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + " - " + edades[i]);
        }
    }
}

