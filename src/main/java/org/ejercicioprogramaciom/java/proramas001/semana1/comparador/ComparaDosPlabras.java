package org.ejercicioprogramaciom.java.proramas001.semana1.comparador;

import java.util.Scanner;

public class ComparaDosPlabras {
    public static boolean comparar (String palabra1, String palabra2) {
        return palabra1.equals(palabra2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la primera frase: ");
        String palabra1 = input.nextLine();
        System.out.print("Ingrese la segunda frase: ");
        String palabra2 = input.nextLine();

        if (comparar(palabra1, palabra2)) {
            System.out.println("Las frases son iguales");

        } else {
            System.out.println("La frases ingresadas son diferentes");
        }
    }
}
