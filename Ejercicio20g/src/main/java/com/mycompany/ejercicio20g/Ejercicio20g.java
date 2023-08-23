/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio20g;
/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
*/
/**
 *
 * @author belugallardo
 */
import java.util.Scanner;

public class Ejercicio20g {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }
        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 3; l++) {
                System.out.println(matriz[k][l] + " ");
                
            }
            System.out.println("");
        }
        boolean flag = true;
        int suma = 0;

        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 3; b++) {
                if (a == 0) {
                    suma = suma + matriz[a][b];
                }
            }
        }
        int suma2 = 0;
        int suma3 = 0;
        for (int c = 0; c < 3; c++) {
            for (int d = 0; d < 3; d++) {
                if (c == 1) {
                    suma2 = suma2 + matriz[c][d];
                }
                if (c == 2) {
                    suma3 = suma3 + matriz[c][d];
                }
            }
        }
        if ((suma != suma2) || (suma != suma3)) {
            flag = false;
        }
        suma2 = 0;
        suma3 = 0;
        for (int c = 0; c < 3; c++) {
            for (int d = 0; d < 3; d++) {
                if (d == 1) {
                    suma2 = suma2 + matriz[c][d];
                }
                if (d == 2) {
                    suma3 = suma3 + matriz[c][d];
                }
            }
        }
        if ((suma != suma2) || (suma != suma3)) {
            flag = false;
        }
        suma2 = 0;
        for (int c = 0; c < 3; c++) {
            for (int d = 0; d < 3; d++) {
                if (c == d) {
                    suma2 = suma2 + matriz[c][d];
                }
            }
        }
        if (suma != suma2) {
            flag = false;
        }
        suma2 = 0;
       for (int c = 0; c < 3; c++) {
            for (int d = 0; d < 3; d++) {
                if (c == d) {
                    suma2 = suma2 + matriz[c][d];
                }
            }
        }
        if (suma != suma2) {
            flag = false;
        }
        
        if (flag){
            System.out.println("La matriz es magica");
        }else {
            System.out.println("La matriz no es magica");
        }
    }
}
