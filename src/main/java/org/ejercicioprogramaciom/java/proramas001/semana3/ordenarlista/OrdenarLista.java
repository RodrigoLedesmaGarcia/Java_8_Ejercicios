package org.ejercicioprogramaciom.java.proramas001.semana3.ordenarlista;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
ordena de forma alfabetica la siguiente lista de palabras
 */
public class OrdenarLista {
    public static void main(String[] args) {

        List<String > frutas = Arrays.asList("Mango", "Pera", "Manzana", "Naranja", "Zaza", "Aguacate", "Durazno", "Plantano", "Kiwi");

        List<String> palabrasOrdenadas = frutas.stream().sorted().collect(Collectors.toList());

        System.out.println("La lista ordenada es la siguiente: " + palabrasOrdenadas);
    }
}
