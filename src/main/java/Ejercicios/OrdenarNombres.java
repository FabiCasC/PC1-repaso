/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author fabia
 */
import java.util.Arrays;

public class OrdenarNombres {
    public static void main(String[] args) {
        String[] nombres = {"Carlos", "Ana", "Luis", "Beatriz"}; // Arreglo de nombres

        // Usamos el método de ordenación por defecto de Java (quicksort)
        Arrays.sort(nombres); // Ordena alfabéticamente de menor a mayor

        // Imprimir el arreglo ordenado
        System.out.println("Nombres ordenados alfabéticamente: ");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}

