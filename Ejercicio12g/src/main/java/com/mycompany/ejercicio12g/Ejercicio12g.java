/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio12g;
/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
*/
/**
 *
 * @author belugallardo
 */
import java.util.Scanner;

public class Ejercicio12g {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int correcta = 0;
        int incorrecta = 0;
        boolean fde = true;
        do {
            System.out.println("Ingrese una cadena ");
            String cadena = leer.nextLine();

            int cantCaract = cadena.length();
            String letra1 = cadena.substring(0, 1);
            String letra5 = cadena.substring(4, 5);

            if (cadena.equals("&&&&&")) {
                fde = false;
            } else {
                if ((cantCaract == 5) && (letra1.equals("X") && (letra5.equals("0") && fde))) {
                    System.out.println("Lectura correcta");
                    correcta++;
                } else {
                    System.out.println("Lectura incorrecta");
                    incorrecta++;
                }
            }
        } while (fde);

        System.out.println("La cantidad de lecturas correctas es: " + correcta + " y la cantidad de lecturas incorrectas es: " + incorrecta);
    }
}
