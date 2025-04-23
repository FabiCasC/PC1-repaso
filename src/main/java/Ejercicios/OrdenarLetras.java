/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author fabia
 */
public class OrdenarLetras {
    public static void main(String[] args) {
        char[] letras = {'d', 'a', 'c', 'b'}; // Arreglo de letras

        // Método Shell Sort
        int n = letras.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                char temp = letras[i];
                int j = i;
                while (j >= gap && letras[j - gap] > temp) {
                    letras[j] = letras[j - gap];
                    j -= gap;
                }
                letras[j] = temp;
            }
        }

        // Imprimir las letras ordenadas
        System.out.println("Letras ordenadas alfabéticamente: ");
        for (char letra : letras) {
            System.out.print(letra + " ");
        }
    }
}

