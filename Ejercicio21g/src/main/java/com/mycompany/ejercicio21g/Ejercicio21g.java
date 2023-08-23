/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio21g;
/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
*/
/**
 *
 * @author belugallardo
 */
import java.util.Scanner;

public class Ejercicio21g {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //Leer los elementos de la matriz M de 10 X 10
        int[][] matrizM = new int[10][10];
        System.out.println("Ingrese los numeros de la matriz M");
        leerMatriz(matrizM, leer);

        // Leer los elementos de la matriz P de 3 X 3
        int[][] matrizP = new int[3][3];
        System.out.println("Ingrese los numeros de la matriz P");
        leerMatriz(matrizP, leer);

        // Buscar la submatriz P en la M
        int fila = -1;
        int columna = -1;
        for (int i = 0; i < 3; i++){
           for (int j = 0; j < 3; j++){
            buscarSubmatriz(matrizM,matrizP[i][j],fila ,columna);
           if (fila == -1){
               break;
           }else{
               System.out.println("Encontraste el primer numero en la linea" + fila + " columna " + columna );
           }
                
            
           }
       }
        
        
        
    }

    public static void leerMatriz(int[][] matriz, Scanner leer) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }

    }
    
    public static void buscarSubmatriz(int [][] matrizM, int matrizP, int fila, int columna ){
        
        for (int i= 0; i < 7; i++){
            for ( int j = 0; j< 7; j++){  
                if(matrizM[i][j] == matrizP){
                 fila = i;
                 columna = j;
                 break;
                }
            }
        }
    }
 
}
