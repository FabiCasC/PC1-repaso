package algoritmos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fabia
 */
public class Quicksort {

    public static void main(String[] args) {
        int[] array = {7, 2, 9, 1, 5, 3}; // Puedes cambiar estos valores

        // Llamamos al método quick
        quick(array, 0, array.length - 1); //se le hace el llamado para que ingresen los datos a quick

        // Mostramos el arreglo ordenado
        System.out.println("Arreglo ordenado:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void quick(int[] array, int izquierda, int derecha) { //Este es un método recursivo porque necesita llamarse a si mismo
        int i = izquierda, j = derecha; //empieza desde la derecha a la izquierda
        int pivote = array[(izquierda + derecha) / 2]; //se elige un pivote

        while (i <= j) {
            while (array[i] < pivote) i++; //i avanza mientras que el valor sea menor que el pivote
            while (array[j] > pivote) j--; //se retrocede mientras que el valor del pivote sea mayor

            if (i <= j) { //cuando ambos se detienen
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp; //se actualizan los indices
                i++;
                j--;
            }
        }

        if (izquierda < j) quick(array, izquierda, j); //si queda un subarreglo a la izquiera hacemos lo mismo
        if (i < derecha) quick(array, i, derecha); //si queda un subarreglo a la derecha tambien
    }
}



