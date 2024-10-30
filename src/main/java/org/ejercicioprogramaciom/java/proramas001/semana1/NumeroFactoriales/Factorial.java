package org.ejercicioprogramaciom.java.proramas001.semana1.NumeroFactoriales;


import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un número para saber si es primo o no: ");
        int numero = input.nextInt();

       int factorial = 1;
       for(int i = 1; i <= numero; i++) {
           factorial *= i;
       }

        System.out.println("El factorial de " + numero + " es " + factorial);
    }
}
