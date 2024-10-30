package org.ejercicioprogramaciom.java.proramas001.semana1.calculolista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculaLista {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        System.out.print("Ingrese una lista números ( precione 0 para finalizar) ");

        int numero;

        while((numero = input.nextInt()) != 0) {
            numeros.add(numero);
        }

        double suma = numeros.stream().mapToInt(Integer::intValue).sum();

        double media = suma / numeros.size();

        System.out.println("La media es: " + media);

        input.close();

    }
}
