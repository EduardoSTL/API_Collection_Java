package org.eduardo.api.set;

import org.eduardo.api.modelo.Alumno;

import java.util.Set;
import java.util.TreeSet;

import static java.util.Comparator.comparing;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {
        //Set<Alumno> sa = new TreeSet<>((a, b) -> b.getNota().compareTo(a.getNota()));
        Set<Alumno> sa = new TreeSet<>(comparing(Alumno::getNota).reversed());
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Gata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 3));
        sa.add(new Alumno("Zeus2", 2));
        sa.add(new Alumno("Zeus", 2));
        System.out.println(sa);
    }
}
