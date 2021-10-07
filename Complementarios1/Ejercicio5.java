package Complementarios1;

import java.util.Scanner;

/*
Se desea una aplicación que solicite 2 números enteros y realice la operación de
multiplicación por sumas sucesivas (sin uso de librerías).
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int product = 0;

        System.out.println("Ingresa el primer numero: ");
        int number1 = scan.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        int number2 = scan.nextInt();
        scan.close();

        while (number1 > 0){
            product += number2;
            number1--;
        }

        System.out.println(product);
    }
}
