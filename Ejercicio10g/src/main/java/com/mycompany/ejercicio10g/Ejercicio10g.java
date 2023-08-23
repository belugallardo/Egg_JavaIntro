/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio10g;
/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
*/
/**
 *
 * @author belugallardo
 */
import java.util.Scanner;
public class Ejercicio10g {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un valor limite positivo");
        int valorLimite = leer.nextInt();
        int suma = 0;
        do {
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        suma = suma + num;
    } while (suma < valorLimite);
        System.out.println("La suma total es de " + suma );
    }
   
}
