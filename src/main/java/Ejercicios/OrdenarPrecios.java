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

public class OrdenarPrecios {
    public static void main(String[] args) {
        Random rand = new Random();
        double[] precios = new double[10];

        // Generar 10 precios aleatorios con decimales
        for (int i = 0; i < precios.length; i++) {
            precios[i] = 10 + (1000 - 10) * rand.nextDouble(); // Precios entre 10 y 1000
        }

        // Aplicar quickSort para ordenar los precios de menor a mayor
        quickSort(precios, 0, precios.length - 1);

        // Imprimir los precios ordenados
        System.out.println("Precios ordenados de menor a mayor: ");
        for (double precio : precios) {
            System.out.print(precio + " ");
        }
    }

    // Método quickSort
    public static void quickSort(double[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(double[] arr, int low, int high) {
        double pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        double temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}

