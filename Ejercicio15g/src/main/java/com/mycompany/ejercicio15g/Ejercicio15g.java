/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio15g;
/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
*/
/**
 *
 * @author belugallardo
 */

public class Ejercicio15g {

    public static void main(String[] args) {
       
     
        int[] vector = new int[100];
        
        for (int i = 0; i<100; i++){
            vector[i]=i+1;
        }
        for (int j = 99; j >= 0; j-- ){
            System.out.println(vector[j]);
        }
        
    }
}
