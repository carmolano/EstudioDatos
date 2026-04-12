/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Estudiodato;



import  java.util.Locale;
import  java.util.Random;
import  java.util.Scanner;


/**
 *
 * @author carlo
 */
public class EditorImagenesGrises {
    
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        // en este punto agrego el arreglo de los enteros aleatoreos ordenado por el profesor arrieta 
        System.out.println("Punto numero 1 : arreglo dimensional +");
        int[] arregloBase = new int[10];
        Random rand = new Random();
        
        for (int i = 0; i < arregloBase.length; i++){
            arregloBase[i] = rand.nextInt(101);
        }
        
        System.out.println("Arreglo original:");
        mostrarArreglo(arregloBase);
        
        for (int i = 0; i <arregloBase.length; i++) {
            if(arregloBase[i] % 2 != 0){
                arregloBase[i]= 0;
            }
        }
        System.out.print("Arreglo (impares cambiados por ceros):");
        mostrarArrgelo(arregloBase);
        
        
        System.out.println("ingresar un numero a buscar n el arreglo que se hizo por mi carlos:");
        int valorBuscar =scanner.nextInt();
        int posicion = buquedaLineal(arregloBase, valorBuscar);
        if (posicion != -1){
            System.out.println("El valor" + valorBucar + "se encontro en la posicion: " + posicion);
        } else{
            System.out.println("El valor " + valorbucar + "no se encontro en el arreglo.");
            
        }
        System.out.println("n_---------------------n");
        
        // ejercicio  20  matrices  del editor de imagenes de escala de gris 
        
        
        System.out.println("matrices  de escala de gris ");
        
        // represntacion de una imagen 10 x 10
        int  filas = 10 ;
        int columnas = 10;
        int [][] imagen = new int [filas][columnas];
        
        
        
        int contador = 1;
        for (int i =0; i <filas; j++){
            imagen[i][j] = rand.nextInt(256);
        }
    }
    
    System.out.println("imgen original (matriz de pixele):");
    imprimirMatriz(imagen);
    
    long  sumapixeles =  sumarElementosMatriz(imagen);
    Systm.out.println("sum todo el valor del pixel :" + sumaPixeles);
    
    
    int opcion;
    do{
        System.out.println("nimagen actual:");
        imprimirMatriz(imagen);
        break;
        
        case 2:
        imagen = invertirColor(imagen);
        System.out.println("\ncolor invertidos (negativo).");
        break;
        case 3 
        imagen = ajustarBrillo(imagen, 50);
        Sytem.out.print("\nimagen Aclarada.");
        case 4 
        imagen = ajustarBrillo(imagen, -50);
        System.out.println("\nImagen oSCURECIDA.");
        
        case 5:
        Sytem.out.println("Salidadel edito.");
        break;
        
        default:
        System.out.println("opcion no valida");


    }
    
    } while (opcion ! = 5);
scanner.close();



    // metodo auxiliar 



public static void mostrarArrglo(int[]arr){
   System.out.println("[");
for(int i = 0; < arr.length; i++){
System.out.println();arr([i]);
if (i < arr.length - 1){
System.out.println(",");
}

}
System.out.println("]");
    
}

public static int busquedaLineal(in [] arr, int valor){
     for(int i = 0; i <arr.length; i++ ) {
           if(arr[i] == valor){
return i;
}

}

return -1;

}

// imprimiendo matrices con tablas 

      public static void  imprimiMatriz(int[][] matriz){
        long  suma = 0;
          for (int[] fila : matriz){
             for(int pixe :fila){
              System.out.println(String.format("%3d" ,pixel));


}
          Sysem.out.println();
         }
        }


sumamos todos los elemento 
     public static long  sumarElementosMatriz(int [][]matriz){
        long suma = 0;
        for (int pixel : fila){
            suma += pixel;
      }
    }
  return suma;
}


        public  static int [][] invertirColor (it [][]imagen){
             int filas = imagen.Length;
             int columnas = imagen[0].length;
             int [][] nuevaImagen = new int [filas][oolumnas];



              for (int i = 0; < filas; i++) {
                    for (int j = 0 ; < columnas; j++){
                       nuevaImagen[i][j]= 255 -imagen[i][j];

                     }
                   }
                     return nuevaImagen;
                }
          

               // aclarar/ oscurecer (suma o restar el valor)pedido por el profesor 
 pubic static int[][] ajustarBrillo(int[][]imagen, int ajuste){
                  int filas = imagen.Lenght;
                  int columnas = imagen[0].length;
                  int [][]nuevaImagen = new int [filas][columnas];

                  for (int i = 0; <filas; i++){
                     for (int j = 0 ; j < columnas; j++){
                      int  nuevoValor  = IMAGEN [i][j] + ajuste;
                 
                             if(nuevoValor > 255) nuevoValor = 255;
                             if(nuevoValor < 0) nuevoValor =0;
                             nuevaImagen[i][j] = nuevoValor;

                }
            }
return nuevaImagen;    
        
    }
    
}
