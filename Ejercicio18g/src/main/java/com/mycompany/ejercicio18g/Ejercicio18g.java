/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio18g;

/**
 *
 * @author belugallardo
 */
public class Ejercicio18g {

    public static void main(String[] args) {
        
        int[][] matrizA = new int[4][4];
        int[][] matrizB = new int[4][4];
        
        System.out.println("Matriz A");
        for(int i=0; i<4; i++){
            for(int j = 0; j<4; j++){
                matrizA[i][j]= (int) (Math.random()*10);
                System.out.print(matrizA[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        System.out.println("Matriz A");
        for(int k = 0; k < 4; k++ ){
            for (int l = 0; l < 4;l++ ){
                matrizB [l][k] = matrizA[k][l];
                     
            }
        }  
        for(int m = 0; m<4; m++){ 
            for(int n = 0; n<4; n++ ){
                System.out.print(matrizB[m][n]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
