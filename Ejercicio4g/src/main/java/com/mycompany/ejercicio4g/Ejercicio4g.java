/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4g;

/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
*/

/**
 *
 * @author belugallardo
 */
import java.util.Scanner;
public class Ejercicio4g {


    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una cantidad de grados centigrados");
        int centigrados = leer.nextInt();
        
        int fa = cambiar(centigrados);
        System.out.println("En grados fahrenheit es: " + fa);
    }
    
    public static int cambiar(int a){
        int fa = 32 + (9 * a / 5);
        return fa;
    }
}
