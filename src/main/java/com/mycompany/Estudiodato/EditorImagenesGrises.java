/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Estudiodato;

/**
 *
 * @author carlo
 */
public class EditorImagenesGrises {
    
    private int [][] pixeles;
    private ProcesadorImagen procesador;
    
    
    public EditorImagenesGrises(int[][] matrizInicial){
        this.pixeles = matrizInicial;
        this.procesador = new ProcesadorImagen();
                
}
    public void aplicarFiltroInversion(){
        this.pixeles = procesador.invertir(this.pixeles);
        System.out.println("Filtro de inversion aplicado con exito");
        
    }
    public void mostrarImagen(){
        for(int[]fila : pixeles){
            for(int p : fila){
                System.out.print(p + "\t");
            }
            System.out.println();
        }
    }
}
