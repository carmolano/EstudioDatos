/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Estudiodato;

/**
 *
 * @author carlo
 */
 public class ProcesadorImagen{

     public int [][] invertir(int[][]matriz){
         int filas =  matriz.length;
         int cols  = matriz[0].length;
         int[][] resultado = new int[filas][cols];
         
         for (int i = 0; i < filas; i++){
              for(int j =0; j < cols; j++){
                  resultado[i][j] = 255 - matriz [i][j];
              }
      }
     
     return resultado;
     
    
}
 public int [][]ajustarBrillo(int[][]matriz , int delta){
     int filas = matriz.length;
     int cols = matriz [0].length;
     int[][]resultado = new int [filas ][cols];

     for(int i = 0; i < filas ; i ++){
         for(int j = 0; j < cols ; j ++){
         int nuevoValor = matriz[i][j] + delta;

         resultado[i][j] = Math.max(0, Math.min(255, nuevoValor)); 
        }
     }
     
       return resultado;
  }
      
            



        public int [][] detectarBordes(int[][] matriz ){
            int filas = matriz.length;
            int  cols = matriz [0].length;
            int[][] resultado = new int [filas][cols - 1];


            for (int i = 0; i < filas; i ++){
                 for (int j = 0; j < cols - 1;  j ++){
                      resultado[i][j] = Math.abs(matriz[i][j] - matriz [i][j + 1]);
   
                 }
             }
             return resultado;
        }
}
    



