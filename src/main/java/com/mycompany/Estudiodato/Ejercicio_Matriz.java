/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Estudiodato;



/**
 *
 * @author carlo
 */
public class Ejercicio_Matriz {
    public static void main(String[] args){
        
        int[][] matriz = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println("____Matriz original");
        imprimirMatriz(matriz);
        
        
        System.out.println("\n____Recorido por las columnas");
        for (int j= 0; j < 3; j++) {
           for(int i = 0; i <  3; i++){
            System.out.print(matriz[i][j]+"");
        }    
    }
     System.out.println();
    
    
    
    int sumaTotal = 0;
      for (int i = 0; i < 3; i ++){
        for(int j = 0; j < 3; j++){
           sumaTotal += matriz[i][j];
  }
      
}

System.out.println("\nsuma de todos los elementos:"+ sumaTotal);

int[]filaTemporal = matriz[0];
matriz[0]= matriz[2];
matriz[2]= filaTemporal;

System.out.println("\n______matriz  final (fila 1 intercambiada con la 3");
imprimirMatriz(matriz);

    }

public static void imprimirMatriz(int[][]m){
     for (int i = 0; i < m.length; i++){
        for(int j = 0; j < m[i].length;j++){
          System.out.println(m[i][j]+ "\t");
           }
           System.out.println();
         }
   }

}