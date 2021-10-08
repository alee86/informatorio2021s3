package Complementarios2;

/*
Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina,
luego imprimir por pantalla el ranking
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        int cuenta = 0;

        System.out.println("Para agregar una ciudad al listado, escribi el nombre");
        System.out.println("Si queres queres finalizar y ver la lista, escribi \"fin\"");

        String city = scan.nextLine();

        while (!city.equals("fin")) {

            cities.add(city);
            System.out.println("Para agregar una ciudad al listado, escribi el nombre");
            System.out.println("Si queres queres finalizar y ver la lista, escribi \"fin\"");
            city = scan.nextLine();
        }
        scan.close();
        for (String i : cities){
            cuenta +=1;
            System.out.println("#" + cuenta +" "+ i);
        }
    }
}
