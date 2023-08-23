/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio19g;
/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
*/
/**
 *
 * @author belugallardo
 */
import java.util.Scanner;

public class Ejercicio19g {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese un numero");
                matrizA[i][j] = leer.nextInt();
            }
        }
        System.out.println("Matriz A");
        for (int q = 0; q < 3; q++) {
            for (int r = 0; r < 3; r++) {
                System.out.print(matrizA[q][r]);
                System.out.print(" ");
            }
            System.out.println("");
        }

        System.out.println("Matriz B");
        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 3; l++) {
                matrizB[l][k] = matrizA[k][l];

            }
        }
        for (int m = 0; m < 3; m++) {
            for (int n = 0; n < 3; n++) {
                System.out.print(matrizB[m][n]);
                System.out.print(" ");
            }
            System.out.println();
        }

        boolean flag = true;

        for (int o = 0; o < 3; o++) {
            for (int p = 0; p < 3; p++) {
                if (matrizA[o][p] == (-(matrizB[o][p]))) {
                } else {
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("La matriz transpuesta es anti simetrica ");
        } else {
            System.out.println("La matriz transpuesta no es anti simetrica");
        }
    }
}
