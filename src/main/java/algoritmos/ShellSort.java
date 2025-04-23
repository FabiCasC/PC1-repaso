/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos;

/**
 *
 * @author fabia
 */
public class ShellSort {
    public static void main(String[]args){
        int[] datos = {9,4,5,8,5,7,6};
        shell(datos);
        
        System.out.println("Arreglo ordenado");
        for (int num: datos){
            System.out.print(num+ " ");
        }
    }
    
    public static void shell(int[] datos){
        int i,j,k,tem,salto; //datos de inicio
        
        salto=datos.length/2; //elegimos la mitad, este valor va a ir reduciendose
        
        //en shell primero vamos tomando los valores mas alejados
        
        while(salto>0){ //si el salto sigue siendo mayor que 0, seguimos ordenando
            for (i = salto; i <datos.length; i++){ //recorremos el indice desde salto hasta el final
                j = i - salto;//busca que valor va a ser comparado con k
                while (j>=0){//comienza la comparación
                    k=j+salto; //hace el salto de posición para k con j
                    if (datos[j]>datos[k]){ //compara los datos
                        tem = datos[j]; //hace el intercambio
                        datos[j]=datos[k];
                        datos[k]=tem;
                        j-=salto; //retrocedemos para hacer una comparación con el mismo salto pero otro número de la lista
                    }else{
                        j=-1; //sino se cumple el if (ya esta en orden) se rompe el while
                    }
                }
            }
            salto=salto/2; //y se hace esto hasta que el salto sea 1
        }
    }
}
