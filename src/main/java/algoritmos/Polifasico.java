/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos;

/**
 *
 * @author fabia
 */
public class Polifasico {
    public static void main(String[] args) {
        int[] entrada = {12, 25, 7, 9, 18, 2, 30}; // Datos originales
        int[][] runs = generarRuns(entrada); //generar sub listas ordenadas 

        System.out.println("Runs identificados:");
        imprimirRuns(runs);

        // Distribuir en F1 y F2 siguiendo patrón Fibonacci (simulado manualmente)
        int[][] F1 = {runs[0], runs[2]}; // Run 1 y 3 en F1
        int[][] F2 = {runs[1]};          // Run 2 en F2

        System.out.println("\nPrimera fase de mezcla:");
        int[] F3 = mezclarRuns(F1[0], F2[0]); // Mezclamos primer run de F1 y F2
        imprimirArreglo(F3);

        System.out.println("\nSegunda fase de mezcla:");
        int[] finalOrdenado = mezclarRuns(F3, F1[1]); // Mezclamos con el otro run restante
        imprimirArreglo(finalOrdenado);

        System.out.println("\nResultado final ordenado:");
        imprimirArreglo(finalOrdenado);
    }

    // Simulación de generación de runs ya ordenados (normalmente esto sería automático)
    public static int[][] generarRuns(int[] datos) {
        int[][] runs = {
            {12, 25},
            {7, 9, 18},
            {2, 30}
        };
        return runs;
    }

    // Mezcla de dos runs ordenados (como en merge sort)
    public static int[] mezclarRuns(int[] a, int[] b) {
        int[] resultado = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) resultado[k++] = a[i++];
            else resultado[k++] = b[j++];
        }

        while (i < a.length) resultado[k++] = a[i++];
        while (j < b.length) resultado[k++] = b[j++];

        return resultado;
    }

    // Imprimir un arreglo
    public static void imprimirArreglo(int[] arr) {
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }

    // Imprimir todos los runs
    public static void imprimirRuns(int[][] runs) {
        for (int i = 0; i < runs.length; i++) {
            System.out.print("Run " + (i + 1) + ": ");
            imprimirArreglo(runs[i]);
        }
    }
}

