package Complementarios1;

import java.util.Scanner;

/*
Realizar un programa que dado un String de entrada en minúsculas lo convierta por
completo a mayúsculas. Sin uso de métodos o librerías que realicen toUppercase().
 */
public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresa un texto:");
        String message = scan.nextLine();
        scan.close();

        char[] ch = message.toCharArray(); //convierto el String a un array
        for (char e: ch){ //recorro el  array
            int value = (int) e;

            if (value >= 97 && value <122){ //tomo el num ascii y lo cambio para que coincida con la mayuscula
                value = value -32;
                System.out.print((char) value);

            } else if (value == 241) { //calculo por separado para la ñ-Ñ
                value = value -32;
                System.out.print((char) value);

            }else{
                System.out.print((char) value); // todos los demas caracteres se dejan como estan
            }
        }
    }
}
