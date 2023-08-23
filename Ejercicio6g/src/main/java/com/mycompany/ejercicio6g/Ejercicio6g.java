/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6g;
/*
Crear un programa que dado un numero determine si es par o impar.
*/
/**
 *
 * @author belugallardo
 */
import java.util.Scanner;
public class Ejercicio6g {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        
        
        if (num % 2 == 0){
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        } 
    }
}
