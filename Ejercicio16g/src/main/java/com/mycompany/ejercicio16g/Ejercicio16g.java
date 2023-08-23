/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio16g;
/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
*/
/**
 *
 * @author belugallardo
 */
import java.util.Scanner;
public class Ejercicio16g {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector");
        int tamVector = leer.nextInt();
        
        int[] vector = new int[tamVector];
        
        for (int i = 0; i < tamVector; i++){
            vector[i] = (int) (Math.random() * 10);
            System.out.println(vector[i]);
        }
        System.out.println("¿Que numero entre el 0 al 9 desea buscar?");
        int buscar = leer.nextInt();
        
        for (int j = 0; j < tamVector; j++ ){
            if (vector[j] == buscar){
                System.out.println("Este numero se encuentra en la posicion: " + j);
            }
        }
        
    }
}
