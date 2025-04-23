/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos;

/**
 *
 * @author fabia
 */
public class AlgoritmosDeOrdenamiento {

    // Método de Ordenamiento Burbuja Mejorado
    public static void burbujaMejorado(int[] datos) {
        int i, j, temp;
        boolean intercambio;

        for (i = 0; i < datos.length - 1; i++) {
            intercambio = false;
            for (j = 0; j < datos.length - 1 - i; j++) {
                if (datos[j] > datos[j + 1]) {
                    // Intercambio
                    temp = datos[j];
                    datos[j] = datos[j + 1];
                    datos[j + 1] = temp;
                    intercambio = true;
                }
            }
            // Si no hubo intercambios, la lista ya está ordenada
            if (!intercambio) break;
        }
    }

    // Método de Ordenamiento por Inserción
    public static void insercion(int[] datos) {
        int i, j, temp;
        for (i = 1; i < datos.length; i++) {
            temp = datos[i];
            j = i - 1;
            while (j >= 0 && datos[j] > temp) {
                datos[j + 1] = datos[j];
                j--;
            }
            datos[j + 1] = temp;
        }
    }

    // Método de Ordenamiento por Selección
    public static void seleccion(int[] datos) {
        int i, j, minIdx, temp;
        for (i = 0; i < datos.length - 1; i++) {
            minIdx = i;
            for (j = i + 1; j < datos.length; j++) {
                if (datos[j] < datos[minIdx]) {
                    minIdx = j;
                }
            }
            // Intercambio
            temp = datos[i];
            datos[i] = datos[minIdx];
            datos[minIdx] = temp;
        }
    }

    // Método de Ordenamiento Quicksort
    public static void quicksort(int[] datos) {
        quicksort(datos, 0, datos.length - 1);
    }

    private static void quicksort(int[] datos, int izquierdo, int derecho) {
        if (izquierdo < derecho) {
            int pivote = datos[(izquierdo + derecho) / 2];
            int i = izquierdo, j = derecho, temp;

            while (i <= j) {
                while (datos[i] < pivote) i++;
                while (datos[j] > pivote) j--;

                if (i <= j) {
                    temp = datos[i];
                    datos[i] = datos[j];
                    datos[j] = temp;
                    i++;
                    j--;
                }
            }
            if (izquierdo < j) quicksort(datos, izquierdo, j);
            if (i < derecho) quicksort(datos, i, derecho);
        }
    }

    // Método de Ordenamiento Merge Sort
    public static void mergesort(int[] datos) {
        mergesort(datos, 0, datos.length - 1);
    }

    private static void mergesort(int[] datos, int izq, int der) {
        if (izq < der) {
            int m = (izq + der) / 2;
            mergesort(datos, izq, m);
            mergesort(datos, m + 1, der);
            merge(datos, izq, m, der);
        }
    }

    private static void merge(int[] datos, int izq, int m, int der) {
        int[] aux = new int[datos.length];
        for (int i = izq; i <= der; i++) {
            aux[i] = datos[i];
        }

        int i = izq, j = m + 1, k = izq;
        while (i <= m && j <= der) {
            if (aux[i] <= aux[j]) {
                datos[k++] = aux[i++];
            } else {
                datos[k++] = aux[j++];
            }
        }

        while (i <= m) datos[k++] = aux[i++];
        while (j <= der) datos[k++] = aux[j++];
    }

    // Método de Ordenamiento Shell
    public static void shell(int[] datos) {
        int salto = datos.length / 2;
        int i, j, temp, k;

        while (salto > 0) {
            for (i = salto; i < datos.length; i++) {
                j = i - salto;
                while (j >= 0 && datos[j] > datos[i]) {
                    temp = datos[j];
                    datos[j] = datos[j + salto];
                    datos[j + salto] = temp;
                    j -= salto;
                }
            }
            salto /= 2;
        }
    }

    // Método de Ordenamiento Polifásico Didáctico
    public static void polifasico(int[] datos) {
        int[][] runs = generarRuns(datos);
        System.out.println("Runs identificados:");
        imprimirRuns(runs);

        int[][] F1 = {runs[0], runs[2]};
        int[][] F2 = {runs[1]};
        int[] F3;

        F3 = mezclarRuns(F1[0], F2[0]);
        imprimirArreglo(F3);

        int[] finalOrdenado = mezclarRuns(F3, F1[1]);
        imprimirArreglo(finalOrdenado);
        System.out.println("Resultado final ordenado:");
        imprimirArreglo(finalOrdenado);
    }

    private static int[][] generarRuns(int[] datos) {
        return new int[][]{
            {12, 25},
            {7, 9, 18},
            {2, 30}
        };
    }

    private static int[] mezclarRuns(int[] a, int[] b) {
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

    private static void imprimirArreglo(int[] arr) {
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }

    private static void imprimirRuns(int[][] runs) {
        for (int i = 0; i < runs.length; i++) {
            System.out.print("Run " + (i + 1) + ": ");
            imprimirArreglo(runs[i]);
        }
    }
}

