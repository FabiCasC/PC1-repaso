package algoritmos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fabia
 */
public class Insercion {
    public static void main (String[] args){
        int[] A = {1,9,8,4,7}; //El primer número siempre debe estar bien
        for (int i=1; i<A.length;i++){ //Recorre cada elemento como queremos apartir del la posición dos (a[1))
            int temp = A[i]; //Guarda el valor que estamos intentando colocar en su posición ordenada
            int k = i-1; //Apunta el índice anterior osea al que vamos a comparar
            
            while (k>=1&& temp<A[k]){ //mientras el nuevo valor no sea menor o igual que 1 y el valor de temp sea menor que el anterior
                A[k+1] = A[k]; //Desplazamos al número más grande una posición a la derecha 
                k = k-1; //Retrocedemos una posición 
            }
            A[k+1]=temp; //Aqui ya encontramos el lugar asi que lo colocamos
        }
        System.out.println("Arreglo ordenado: ");
        for (int num:A){
            System.out.println(num+" ");
        }
    }
    
}
