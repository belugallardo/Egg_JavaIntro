/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5g;
/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
*/
/**
 *
 * @author belugallardo
 */
import java.util.Scanner;
public class Ejercicio5g {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        
        int doble = num * 2;
        int triple = num * 3;
        double raizCuadrada = Math.sqrt(num);
        
        System.out.println("A partir del numero " + num + ", el doble es: " + doble + " el triple es: " + triple + " y la raiz cuadrada es " + raizCuadrada);
    }
}
