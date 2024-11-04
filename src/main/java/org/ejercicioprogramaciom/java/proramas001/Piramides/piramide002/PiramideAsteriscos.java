package org.ejercicioprogramaciom.java.proramas001.Piramides.piramide002;

import java.util.Scanner;

public class PiramideAsteriscos {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int altura = 0;

        System.out.print("""
                PROGRAMA QUE DIBUJA UNA PIRAMIDE DE ASTERISCOS
                Preciona 1 para dibujar una piramide de asteriscos a la izquierda
                Preciona 2 para dibujar una piramide de asteriscos a la derecha
                Preciona 3 para salir del programa
                """);
        System.out.print("Elige una opcion: ");
        int opcion = input.nextInt();

        if (opcion >= 1 && opcion < 3) {

            switch (opcion){
                case 1 -> {
                    System.out.print("¿Que tan alta quiere imprimir la piramide?: ");
                    altura = input.nextInt();
                    izquierda(altura);
                    System.out.println(" ");
                    main(args);
                }
                case 2 -> {
                    System.out.print("¿Que tan alta quiere imprimir la piramide?: ");
                    altura = input.nextInt();
                    derecha(altura);
                    System.out.println(" ");
                    main(args);
                }
                case 3 -> {
                    System.out.println("Programa finalizado...");
                    input.close();
                    System.exit(0);
                }
            }// fin de switch

        } else {
            System.out.println("Programa finalizado...");
            input.close();
            System.exit(0);
        }// fin del if else
    }// fin de la main

    public static void izquierda(int altura) {
        for (int i = 1; i <= altura; i++){

            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    } // fin del metodo que imprime a la izquierda

    public static void derecha(int altura){
        for (int i = 1; i <= altura; i++){

            for (int k = 1; k <= altura -i; k++){
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }// fin del metodo que imprime a la derecha
}// fin de la clase
