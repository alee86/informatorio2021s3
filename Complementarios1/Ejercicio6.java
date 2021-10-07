package Complementarios1;

import java.util.Scanner;

/*
Se desea una aplicación que solicite 2 números enteros y realice la operación de
 potencia (sin uso de librerías).
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int porductoPotencia = 1;

        System.out.println("Ingresa el exponente de la potencia (en entero): ");
        int number1 = scan.nextInt();
        System.out.println("Ingresa la base de la potencia (en entero): ");
        int number2 = scan.nextInt();
        scan.close();

        while (number1 > 0){
            porductoPotencia *= number2;
            number1--;
        }

        System.out.println(porductoPotencia);
    }

}
