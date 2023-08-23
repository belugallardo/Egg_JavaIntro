/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio13g;
/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *

*/
/**
 *
 * @author belugallardo
 */
import java.util.Scanner;
public class Ejercicio13g {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de elementos");
        int elementos = leer.nextInt();
        
        for(int i = 0; i < elementos; i++){
            for (int j = 0; j < elementos; j++){
                if (i == 0 || j == 0 || i == (elementos-1) || j == (elementos -1)){
                    System.out.print("*");
                    
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
