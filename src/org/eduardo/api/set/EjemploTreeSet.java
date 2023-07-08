package org.eduardo.api.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {

        System.out.println("--- EJEMPLO TREESET ---");
        Set<String> ts = new TreeSet<>((a, b) -> b.compareTo(a));
        //compara todos los String
        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("Cuatro");
        ts.add("cinco");
        //solo detecta la duplicidad si el String es identico, si cambia en una letra no existe duplicidad
        System.out.println("ts = " + ts);

        Set<Integer> numeros = new TreeSet<>(Comparator.reverseOrder());
        //reordenar en reversa los enteros y a la vez compara
        numeros.add(1);
        numeros.add(5);
        numeros.add(4);
        numeros.add(2);
        numeros.add(3);
        numeros.add(10);
        System.out.println("numeros = " + numeros);



    }
}
