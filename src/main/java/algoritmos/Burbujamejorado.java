package algoritmos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fabia
 */
public class Burbujamejorado {
    public static void main(String[] args){
        int[] A = {1,2,3,4,5};
        int i = 0; //Cuantas pasadas a hecho el algoritmo;
        boolean noIntercambio; //Aquí se declara una bandera lógica que nos dice si se hicieron intercambios en la pasada actual.
        
        do{ //Ciclo do-while
            noIntercambio= true; //Antes de la pasada asusmimos que no habrán intercambios
            for(int j=0; j<A.length-1-i; j++){//Compara los elementos, se detiene en length-1-i porque el ultimo elemento ya esta ordenado
                if(A[j]>A[j+1]){ //en el caso de la posición anterior ser mayor se mueve 
                    int temp=A[j]; //se almacena de forma temporal el aj en temp
                    A[j]=A[j+1]; //se reescribe en una nueva posición
                    A[j+1]=temp; //se traslada en aj almacenado en temp en su neuva posición
                    
                    noIntercambio=false; //como hicimos el intercambio, el arreglo no estaba arreglado
                }
            }
            i++; //se incrementa
        }while (!noIntercambio); //si hubo cambios, se sigue
        
        
        //mostramos resultados
        System.out.println("Arreglo ordenado:");
            for (int num:A){
                System.out.print(num+",");
            }
    }
}
