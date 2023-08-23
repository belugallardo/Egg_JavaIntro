/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio17g;
/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
*/
/**
 *
 * @author belugallardo
 */
import java.util.Scanner;

public class Ejercicio17g {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int tamVector = leer.nextInt();

        int[] vector = new int[tamVector];
        int unDigito = 0;
        int dosDigitos = 0;
        int tresDigitos = 0;
        int cuatroDigitos = 0;
        int cincoDigitos = 0;
        for (int i = 0; i < tamVector; i++) {
            System.out.println("ingrese un numero");
            vector[i] = leer.nextInt();
            String elementoCadena = String.valueOf(vector[i]);
            int cantidadDigitos = elementoCadena.length();

            switch (cantidadDigitos) {
                case 1:
                    unDigito++;
                    break;
                case 2:
                    dosDigitos++;
                    break;
                case 3:
                    tresDigitos++;
                    break;
                case 4:
                    cuatroDigitos++;
                    break;
                case 5:
                    cincoDigitos++;
                    break;

            }
        }
        System.out.println("Los numeros ingresados fueron: " + unDigito + " de un digito, " + dosDigitos + " de dos digitos, " + tresDigitos + " de tres digitos, " + cuatroDigitos + " de cuatro digitos, " + cincoDigitos + " de cinco digitos.");

    }
}
