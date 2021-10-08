package Complementarios2;

import java.util.ArrayList;
import java.util.Scanner;

/*
Dados 2 ArrayList que contienen horas-trabajadas (array1) y valor-por-hora(array2)
el resumen de carga de horas semanal de un empleado. Se debe generar otra lista que
contenga los totales y luego imprimir el total final a cobrar.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> horasTrabajadas = new ArrayList<Integer>();
        ArrayList<Integer> valorHora = new ArrayList<Integer>();
        ArrayList<Integer> totalDia = new ArrayList<Integer>();
        int valor = 0;
        int sumaFinal = 0;
        int i = 1;

        while (i < 6){
            System.out.println("Ingresa la CANTIDAD de horas del día #" + i +" de la semana.");
            valor = scan.nextInt();
            horasTrabajadas.add(valor);

            System.out.println("Ingresa el PRECIO de horas del día #" + i +" de la semana.");
            valor = scan.nextInt();
            valorHora.add(valor);
            i++;
        }
        scan.close();

        for (int e = 0; e < valorHora.size(); e++) {
            valor = valorHora.get(e) * horasTrabajadas.get(e);
            totalDia.add(valor);
        }

        for (int e : totalDia){
            sumaFinal += e;
        }

        System.out.println("El precio de cada día es:" + totalDia);
        System.out.println("La sumatoria de la semana es: " + sumaFinal);

    }
}
