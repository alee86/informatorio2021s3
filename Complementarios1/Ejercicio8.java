package Complementarios1;
/*
Crear una aplicación que solicite de entrada los datos de una persona en este orden:
Nombre y Apellido
Edad
Dirección
Ciudad
Luego imprimirá el siguiente mensaje:
{Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}
 */

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresa tu nombre completo: ");
        String fullName = scan.nextLine();
        System.out.println("Ingresa tu edad: ");
        String age = scan.nextLine();
        System.out.println("Ingresa tu domicilio: ");
        String address = scan.nextLine();
        System.out.println("Ingresa tu ciudad: ");
        String city = scan.nextLine();
        scan.close();

        System.out.println
                ("{" + city + "} - {" + address + "} - {" + age +"} - {" + fullName +"}");
    }
}
