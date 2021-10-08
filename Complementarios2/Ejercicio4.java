package Complementarios2;
/*
Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos en 3
cursos (3 arrayList) e imprimir dichos cursos.
 */

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> estudiantes = new ArrayList<String>();
        String estudiante = "";
        int i = 1;

        while   (i< 13) {
            System.out.println("Ingrese el nombre del estudiando #" + i + ": ");
            estudiante = scan.nextLine();
            estudiantes.add(estudiante);
            i++;
        }
        scan.close();
        List<String> curso1 = estudiantes.subList(0, 4);
        List<String> curso2 = estudiantes.subList(4, 8);
        List<String> curso3 = estudiantes.subList(8, 12);

        System.out.println("En el curso #1 van a estar los siguientes alumnos: " + curso1);
        System.out.println("En el curso #2 van a estar los siguientes alumnos: " + curso2);
        System.out.println("En el curso #3 van a estar los siguientes alumnos: " + curso3);
    }
}
