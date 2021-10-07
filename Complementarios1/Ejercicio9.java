package Complementarios1;

import java.util.Scanner;

/*
Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces
que aparece una letra dada.
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;

        System.out.println("Ingresa un texto:");
        String message = scan.nextLine();
        System.out.println("Ingresa la letra que queres contar:");
        String letter = scan.nextLine();
        scan.close();

        char[] ch = message.toCharArray(); //convierto el String a un array
        for (char e: ch){ //recorro el  array
            //int value = (int) e;

            if (letter.charAt(0) == e){
                count +=1;
            }
        }

        System.out.println("El caracter \"" + letter +"\" aparece " + count + " veces.");
    }
}
