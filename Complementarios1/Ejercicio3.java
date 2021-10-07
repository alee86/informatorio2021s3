package Complementarios1;

import java.util.Scanner;

/*
Confeccionar un programa que dado un número entero como dato de entrada
imprima la secuencia de números (incrementos de 1) de la siguiente forma:
 */
public class Ejercicio3 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int number;
    int i = 1;


    System.out.println("Ingresa un numero entero: ");
    number = scan.nextInt();
    scan.close();

    while (i <= number){
      int e = 1;
      System.out.println("");

      while (e <= i){
        System.out.print(e);
        e++;
      }
      i++;
    }
  }
}
