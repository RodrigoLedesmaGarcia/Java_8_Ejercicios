package org.ejercicioprogramaciom.java.proramas001.semana1.CalculadoraLambda;

import java.util.Scanner;


@FunctionalInterface
/*
Esta es una interface funcional
 */
interface Operacion {
    double operacion(double a, double b);
}

public class CalculadoraLamnbda {
    public static void main(String[] args) {

        double primerNumero, segundoNumero;

        Scanner input = new Scanner(System.in);

        System.out.println(" _____       _            _           _                 \n" +
                "/  __ \\     | |          | |         | |                \n" +
                "| /  \\/ __ _| | ___ _   _| | __ _  __| | ___  _ __ __ _ \n" +
                "| |    / _` | |/ __| | | | |/ _` |/ _` |/ _ \\| '__/ _` |\n" +
                "| \\__/\\ (_| | | (__| |_| | | (_| | (_| | (_) | | | (_| |\n" +
                " \\____/\\__,_|_|\\___|\\__,_|_|\\__,_|\\__,_|\\___/|_|  \\__,_|\n" +
                "                                                        \n" +
                "                                                        ");
        System.out.println("Precione el número 1 para hacer una suma");
        System.out.println("Precione el número 2 para hacer una resta");
        System.out.println("Precione el número 3 para hacer una multiplicación");
        System.out.println("Precione el número 4 para hacer una division");
        System.out.println("Precione el número 5 para salir");
        System.out.print("Seleccione una opción: ");
        int opciones = input.nextInt();


        if (opciones >= 1 && opciones <= 4) {
            switch (opciones){
                case 1 -> {
                    Operacion suma = (a, b) -> a + b;
                    System.out.print("Ingrese el primer número a sumar: ");
                    primerNumero = input.nextDouble();
                    System.out.print("Ingrese el segundo número a sumar");
                    segundoNumero = input.nextDouble();
                    System.out.println("El resultado de tu suma es: " + suma.operacion(primerNumero, segundoNumero));
                }
                case 2 -> {
                    Operacion resta = (a, b) -> a - b;
                    System.out.print("Ingrese el primer número a restar: ");
                    primerNumero = input.nextDouble();
                    System.out.print("Ingrese el segundo número a restar");
                    segundoNumero = input.nextDouble();
                    System.out.println("El resultado de tu resta es: " + resta.operacion(primerNumero, segundoNumero));
                }
                case 3 -> {
                    Operacion multiplicacion = (a, b) -> a * b;
                    System.out.print("Ingrese el primer número a multiplicar: ");
                    primerNumero = input.nextDouble();
                    System.out.print("Ingrese el segundo número a multiplicar");
                    segundoNumero = input.nextDouble();
                    System.out.println("El resultado de tu multiplicación es: " + multiplicacion.operacion(primerNumero, segundoNumero));
                }
                case 4 -> {
                    Operacion division = (a, b) -> a / b;
                    System.out.print("Ingrese el primer número a dividir: ");
                    primerNumero = input.nextDouble();
                    System.out.print("Ingrese el segundo número a dividir");
                    segundoNumero = input.nextDouble();

                    if(primerNumero != 0 && segundoNumero != 0) {

                        System.out.println("El resultado de tu division es: " + division.operacion(primerNumero, segundoNumero));
                    } else {
                        System.out.println("No se puede dividir entre cero...");
                    }
                }
            }

            main(args);

        } else {
            System.out.println("Programa finalizado...");
            input.close();
            System.exit(0);
        }
    }
}
