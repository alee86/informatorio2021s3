package Complementarios2;
/*
Se dispone de una lista de Empleados, de cada empleado se conoce:
Nombre y Apellido
DNI
horasTrabajadas
valorPorHora
Todos los empleados están cargados en un Set (HashSet), se desea calcular el sueldo
(horasTrabajadas x valorPorHora) de toda esa lista para luego almacenar en un Map
(o Diccionario) donde la clave (key) es el dni y el valor (value) es el sueldo calculado.
 */

import java.util.*;

public class Ejercicio6 {
    public static void main(String[] args) {

        Set<Empleado> empleados = new HashSet();
        empleados.add(new Empleado("Ale Jandro",
                "123456", 40, 20));
        empleados.add(new Empleado("Bat Man",
                "234567", 4, 1000));
        empleados.add(new Empleado("Kenny",
                "345678", 100, 22));
        empleados.add(new Empleado("Jason Todd",
                "456789", 13, 4));

        Map<String, Integer> sueldosEmpleados = new HashMap();

        for(Empleado emp : empleados){
            sueldosEmpleados.put(emp.DNI,
                    Empleado.calculadorSueldo(emp.horasTrabajadas, emp.valorPorHora));
        }
        System.out.println("La lista de sueldos es: \n" + sueldosEmpleados);
    }
}

class Empleado{ //esta planteado en un solo archivo, pero por buenas practicas, esta clase tendria que estar aparte
String nombreApellido;
String DNI;
Integer horasTrabajadas;
Integer valorPorHora;

    public Empleado(String nombreApellido, String DNI, Integer horasTrabajadas, Integer valorPorHora) {
        this.nombreApellido = nombreApellido;
        this.DNI = DNI;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    public static int calculadorSueldo(int horasTrabajadas, int valorPorHora){

        return horasTrabajadas * valorPorHora;
    }
}
