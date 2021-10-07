package Complementarios1;

/*
***** Ejercicio 1 *****
Solicitar por consola el nombre del usuario e imprimir por pantalla el siguiente mensaje
“HOLA {USUARIO}!!!”
 */


import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Ingresa tu nombre o nickname:");
    String nombreUsuario = scan.nextLine().toUpperCase();
    scan.close();


    System.out.println("HOLA " + nombreUsuario + "!!!");

  }
}
