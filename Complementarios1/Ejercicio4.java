package Complementarios1;
/*
Realizar un programa que calcule el factorial de un número:
n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
Sin hacer uso de librerías.
 */


import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int produt = 1;


        System.out.println("Ingresar un numero (entero) para calcular el factorial: ");
        int number = scan.nextInt();
        scan.close();

        if (number == 0){ //por def matematica, el factorial de cero es 1
            produt = 1;
        } else {
            while (number > 0) {
                produt *= number;
                number--;
            }
        }
        System.out.println(produt);

    }
}
