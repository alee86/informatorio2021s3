package Complementarios2;

import java.util.Scanner;

/*
Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo),
nos devuelva un array de Strings. Con la secuencia de números enteros de principio a final.
Pero si el número es multiplo de 2 colocara el valor “Fizz”, si es múltiplo de 3 “Buzz” y si es a
la vez múltiplo de ambos colocara “FizzBuzz”.
Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el segundo con qué
valor debe frenar (no se incluye en el cálculo)
Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Indica el numero de inicio:");
        int numeroInicio = scan.nextInt();
        System.out.println("Indica el numero de fin (no se va a incluir:");
        int numeroFin = scan.nextInt();
        scan.close();

        for (int i = numeroInicio; i < numeroFin; i++){ //Se puede reemplazar i por numeroInicio y reducir codigo
            System.out.print(fizzBuzz(i));
        }
    }
        static String fizzBuzz(int number){
            String salida = "";
            if ((number % 3 == 0) && (number % 2 == 0)){
                salida = "FizBuzz ";
            } else if (number % 3 == 0){
                salida = "Buzz ";
            } else if (number % 2 == 0){
                salida = "Fizz ";
            }
        return salida;
        }
}
