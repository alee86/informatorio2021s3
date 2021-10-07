package Complementarios1;

/*
Realizar un programa que solicite por consola 2 números enteros. Para luego
imprimir el resultado de la suma, resta, multiplicación, división y módulo
(resto de la división) de ambos números.

 */

import java.util.Scanner;

public class Ejercicio2 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int number1;
    int number2;

    System.out.println("Ingresa el primer numero (entero) para operar: ");
    number1 = scan.nextInt();

    System.out.println("Ingresa el segundo numero (entero) para operar: ");
    number2 = scan.nextInt();
    scan.close();

    System.out.println(number1 + " + " + number2 + " = " + (number1 +  number2));
    System.out.println(number1 + " - " + number2 + " = " + (number1 -  number2));
    System.out.println(number1 + " * " + number2 + " = " + (number1 *  number2));
    System.out.println(number1 + " / " + number2 + " = " + (number1 /  number2));
    System.out.println(number1 + " % " + number2 + " = " + (number1 %  number2));
  }
}
