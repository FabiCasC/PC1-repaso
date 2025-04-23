package algoritmos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fabia
 */
public class Burbuja {
    public static void main(String[] args){
        int[] A = {1,5,7,9,4};
        
        for (int i = 0; i < A.length - 1; i++){ //Recorre desde el principio a la penultima posición
            for (int j = 0; j < A.length- 1 - i ; j++ ){ //Recorre de nuevo el arreglo pero con un rango mas corto esta vez (se coloca -i para evitar revisar los mismos elementos otra vez
                if (A[j]>A[j+1]){ //Si el numero actual es mayor que el siguiente se necesita intercambiarlos
                    int temp = A[j]; //Se guarda temporalmente el A[j]
                    A[j] = A[j+1]; //Reasigna el valor del siguiente posición a la posición actual
                    A[j+1]=temp; //Coloca el valor original guardado en temp en la siguiente posición
                }
            }
        }
        
        System.out.println("Arreglo ordenado:");
        for (int num:A){    
            System.out.println(num +" ");
        }
    }
    
}
