package algoritmos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fabia
 */
public class Seleccion {
    public static void main(String[] args){
        int[] A = {5,6,7,8,4,6,4};
        
        for (int i =0; i<A.length-1; i++){ //Recorre la posición hasta el penultimo elemento
            int k = i; //Guarda la posición donde estará el número más pequeño encontrado, por ahora suponemos que es i
            int menor = A[i]; //El valor más pequeño que hemos encontrado   
            
            for (int j= i+1 ; j < A.length; j++){ //Busca en el resto del arreglo a ver si hay un número más pequeño que el que tenemos
                if (menor > A[j]){ //Si encontramos un número más pequeño
                    k = j; //Actualizamos la posición del más pequeño
                    menor = A[j]; //El valor mínimo encontrado
                }
            }
            
            int temp= A[k]; //Aqui intercambiamos los valores en la posición actual con temp
            A[k]=A[i]; //Se reemplaza el valor antiguo en A[k]Valor mas pequeño
            A[i]=temp; //Se ingresa en A[i]
        }
        
        System.out.println("Arreglo ordenado");
        for (int num:A){
            System.out.println(num + " ");
            
        }
    }
    
}
