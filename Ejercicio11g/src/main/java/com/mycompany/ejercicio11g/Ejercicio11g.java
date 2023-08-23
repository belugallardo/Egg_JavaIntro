/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio11g;
/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.


*/
/**
 *
 * @author belugallardo
 */
import java.util.Scanner;

public class Ejercicio11g {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int opcion;
        boolean flag = false;

        do {
            opcion = menu();
            if (opcion > 0 && opcion < 5) {
                System.out.println("Ingrese un numero");
                int num1 = leer.nextInt();

                System.out.println("Ingrese otro numero");
                int num2 = leer.nextInt();
                resultado(num1, num2, opcion);
            } else if (opcion == 5) {
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                String resp = leer.nextLine();

                if (resp.equals("S")) {
                    flag = true;
                    System.out.println("Salida exitosa");
                    break;
                } else {
                    menu();
                }

            } else {
                System.out.println("Opcion invalida");
            }
        } while (!flag);

    }

    public static int menu() {
        Scanner leer = new Scanner(System.in);
        System.out.println("MENU\n"
                + "1. Sumar\n"
                + "2. Restar\n"
                + "3. Multiplicar\n"
                + "4. Dividir\n"
                + "5. Salir\n");

        int opcion = leer.nextInt();
        return  opcion;

    }

    public static void resultado(int num1, int num2, int opcion) {

        switch (opcion) {
            case 1:
                System.out.println("La suma es: " + (num1 + num2));

                break;

            case 2:
                System.out.println("La resta es: " + (num1 - num2));

                break;

            case 3:
                System.out.println("La multiplicacion es: " + (num1 * num2));

                break;
            case 4:
                System.out.println("La division es: " + (num1 / num2));

                break;

        }

    }

}
