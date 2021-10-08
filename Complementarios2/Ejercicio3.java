package Complementarios2;
/*
Crear una lista que contenga como elementos la numeración de cartas de una baraja francesa
(solo los valores, no figuras). Se deberá cargar el ArrayList (en orden), imprimir, imprimir en
orden inverso (reverse), desordenar (mezclar) el arrayList y volver a imprimir.
 */

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {
    public static void main(String[] args) {

        ArrayList<String> deck = new ArrayList<>();
        ArrayList<String> suit = new ArrayList<>();
        ArrayList<String> letter = new ArrayList<>();
        String card = "";

        // clubs (♣), diamonds (♦), hearts (♥) and spades (♠)
        suit.add("♣");
        suit.add("♦");
        suit.add("♥");
        suit.add("♠");

        /*
        letter.add("J");
        letter.add("Q");
        letter.add("K");
        letter.add("A");
        en caso de querer usar las figuras, se tiene que cambiar los valores
        de la iteracion y habilitar el segundo ciclo
        */

        for (int i = 1; i < 13; i++){
            for (String s : suit){
                card = i + " " + s;
                deck.add(card);
            }
        }
        /*for (String c : letter){
            for (String s : suit){
                card = c + " " + s;
                deck.add(card);
            }
        }
         */
        System.out.println("Lista de cartas");
        System.out.println(deck);

        System.out.println("Lista de cartas en orden invertido");
        Collections.reverse(deck);
        System.out.println(deck);

        System.out.println("Lista de cartas desordenadas");
        Collections.shuffle(deck);
        System.out.println(deck);

    }
}


