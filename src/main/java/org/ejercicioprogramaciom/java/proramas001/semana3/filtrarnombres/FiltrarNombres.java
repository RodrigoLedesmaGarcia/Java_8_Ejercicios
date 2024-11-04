package org.ejercicioprogramaciom.java.proramas001.semana3.filtrarnombres;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
dada una lista de nombres has un programa que filte los nombres que inicien con una letra determinada
 */
public class FiltrarNombres {
    public static void main(String[] args) {

        List<String> nombresLista = Arrays.
                asList("Arturo", "Armado", "Sofia", "Maria", "Pedro", "Hugo", "Marcelo", "Alena", "Luis", "Lionel");

        List<String> nombresFiltrados = nombresLista.
                stream().filter(n -> n.startsWith("S")).collect(Collectors.toList());

        System.out.println("La lista filtrada de nombres que inician con \"A\" es: " + nombresFiltrados);

    }
}
