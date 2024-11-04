package org.ejercicioprogramaciom.java.proramas001.Piramides.piramide001;

import java.util.Scanner;

public class PiramidesAsteriscos {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la altura maxima que quiere que mida la torre: ");
        int altura = input.nextInt();


        System.out.println("""
                Precione 1 para que la torre se imprima a la izquierda
                Precione 2 para que la toore se imprima a la derecha
                precione 3 para salir del programa
                """);
        System.out.print("Ingrese una de las opciones: ");
        int opciones = input.nextInt();

        if ( opciones >= 1 && opciones <= 2){

          switch (opciones){
                case 1 -> {
                    izquierda(altura);
                    System.out.println(" ");
                }

              case 2 -> {
                  derecha(altura);
                  System.out.println(" ");
              }

           }// fin del switch

        } else{
            System.out.println("Programa finlizado...");
            input.close();
            System.exit(0);

        } // fin del metodo if else
    } // fin del metodo principal

    private static void izquierda(int altura){
        int i , j;
        for (i = 1; i <= altura; i++){

            for (j = 1; j <= i; j++){
                System.out.print("+");
            }
            System.out.println(" ");
        }// fin del for
    }// fin del izquierda


    private static void derecha(int altura){
        int i, j, k;
        for (i = 1; i <= altura; i++){

            for (k = 1; k <= altura-i; k++ ){
                System.out.print(" ");
            }

            for (j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }// fin del for

    }// fin de derecha


}
