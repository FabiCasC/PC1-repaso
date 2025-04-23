/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos;

/**
 *
 * @author fabia
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] A = {5, 2, 9, 1, 6, 3};
        mergesort(A, 0, A.length - 1); //se hace el llamado a merge sort

        // Mostrar el resultado
        System.out.print("Arreglo ordenado: ");
        for (int num : A) {
            System.out.print(num + " ");
        }
    }

    public static void mergesort(int[] A, int izq, int der) { //primer metodo que divide el arreglo
        if (izq < der) { //solo se divide si hay al menos dos elemenos desordenados
            int m = (izq + der) / 2; //calculamos el punto medio
            mergesort(A, izq, m);       // Se sigue dividiendo todo
            mergesort(A, m + 1, der);   //Se divide la segunda mitad
            merge(A, izq, m, der);      // Cuando ya esta todo divido se hace llamado a merge para juntarlo
        }
    }

    public static void merge(int[] A, int izq, int m, int der) {
        int i, j, k;
        int[] B = new int[A.length]; //Creamos un array auxiliar B del mismo tamaño que A

        // Copiar ambas mitades al array auxiliar B
        for (i = izq; i <= der; i++) {
            B[i] = A[i];
        }

        i = izq;//inicio de la primera mitad 
        j = m + 1; //inicio de la segunda mitad
        k = izq; //indice del arreglo original

        // Combinar las dos mitades en orden
        while (i <= m && j <= der) {
            if (B[i] <= B[j]) {
                A[k++] = B[i++];
            } else {
                A[k++] = B[j++];
            }
        }

        // Copiar los elementos restantes de la primera mitad
        while (i <= m) {
            A[k++] = B[i++];
        }
    }
}

