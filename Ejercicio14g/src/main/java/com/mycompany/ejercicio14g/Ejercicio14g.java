/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio14g;
/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
*/
/**
 *
 * @author belugallardo
 */
import java.util.Scanner;

public class Ejercicio14g {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el monto en euros");
        int euros = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese la divisa a cambiar: dolares(D), yenes(Y) o libras (L)");
        
        String divisa = leer.nextLine();

        cambio(euros, divisa);
    }

    public static void cambio(int euros, String divisa) {
        double dolares = euros * 0.86;
        double yenes = euros * 1.28611;
        double libras = euros * 129.852;

        switch (divisa) {
            case "D":
                System.out.println(euros + " euros son " + dolares + " dolares");
                break;
            case "Y":
                System.out.println(euros + " euros son " + yenes + " yenes");
                break;
            case "L":
                System.out.println(euros + " euros son " + libras + " libras");
                break;
            default:
                System.out.println("Opcion invalida");
        }

    }
}
