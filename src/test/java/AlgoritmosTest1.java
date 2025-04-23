/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import algoritmos.AlgoritmosDeOrdenamiento;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author fabia
 */

public class AlgoritmosTest1 {
   
    

    @Test
    public void testBurbujaMejorado() {
        int[] entrada = {5, 2, 9, 1, 5, 6};
        int[] esperado = {1, 2, 5, 5, 6, 9};
        AlgoritmosDeOrdenamiento.burbujaMejorado(entrada);
        assertArrayEquals(esperado, entrada);
    }

    @Test
    public void testInsercion() {
        int[] entrada = {5, 2, 9, 1, 5, 6};
        int[] esperado = {1, 2, 5, 5, 6, 9};
        AlgoritmosDeOrdenamiento.insercion(entrada);
        assertArrayEquals(esperado, entrada);
    }

    @Test
    public void testSeleccion() {
        int[] entrada = {5, 2, 9, 1, 5, 6};
        int[] esperado = {1, 2, 5, 5, 6, 9};
        AlgoritmosDeOrdenamiento.seleccion(entrada);
        assertArrayEquals(esperado, entrada);
    }

    @Test
    public void testQuicksort() {
        int[] entrada = {5, 2, 9, 1, 5, 6};
        int[] esperado = {1, 2, 5, 5, 6, 9};
        AlgoritmosDeOrdenamiento.quicksort(entrada);
        assertArrayEquals(esperado, entrada);
    }

    @Test
    public void testMergeSort() {
        int[] entrada = {5, 2, 9, 1, 5, 6};
        int[] esperado = {1, 2, 5, 5, 6, 9};
        AlgoritmosDeOrdenamiento.mergesort(entrada);
        assertArrayEquals(esperado, entrada);
    }

    @Test
    public void testShell() {
        int[] entrada = {5, 2, 9, 1, 5, 6};
        int[] esperado = {1, 2, 5, 5, 6, 9};
        AlgoritmosDeOrdenamiento.shell(entrada);
        assertArrayEquals(esperado, entrada);
    }
}
