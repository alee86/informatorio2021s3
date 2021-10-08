package Complementarios2;

import java.util.ArrayList;
import java.util.Scanner;

/*
Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número entero al principio
de la lista y otro al final. Por último, iterar e imprimir los elementos de la lista y el
tamaño de la misma (antes y después de agregar a en la primera y última posición).
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        int i = 0;

        while (i < 5) {
            System.out.println("Ingresa el numero a la lista:");
            String number = scan.nextLine();
            numbers.add(number);
            i++;
        }

        System.out.println("Indicar un numoero para el INICIO de la lista");
        String number = scan.nextLine();
        numbers.add(0, number);

        System.out.println("Indicar un numoero para el FINAL de la lista");
        number = scan.nextLine();
        numbers.add(numbers.size(), number);
        scan.close();

        System.out.println("\nLos primeros "+ (numbers.size()-2) +"elementos agregados son: ");
        for (int n = 1; n < numbers.size()-1; n++) {
            System.out.print(numbers.get(n) + " - ");
        }

        System.out.println("\nLa lista completa con " + numbers.size() +" elementos es: ");
        for (String n : numbers){
            System.out.print(n + " - ");
        }
    }
}
