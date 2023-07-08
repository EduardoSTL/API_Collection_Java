package org.eduardo.api.set;

import org.eduardo.api.modelo.Alumno;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {

        // Identificacion de elementos duplicados
        System.out.println("-- PROGRAMA DE IDENTIFICACION DE ELEMENTOS DUPLICADOS --");
        Set<Alumno> sa = new HashSet<>();
        //LIst<Alumno> sa = new Linked<List>();
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Gata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 3));
        sa.add(new Alumno("Zeus2", 2));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Lucas", 2));
        sa.add(new Alumno("Lucas", 3));
        System.out.println(sa);

        /*System.out.println("Utilizando un for clásico");
        for (int i = 0; i<sa.size(); i++){
            Alumno a = sa.get(i);
            System.out.println(a.getNombre());
        }*/

        System.out.println("--- Iterando usando un for-each ---");
        for (Alumno a:sa){
            System.out.println(a.getNombre());
        }

        System.out.println("--- Iterando usando un while e iterator ---");
        //Defino un conteo preciso:
        Iterator<Alumno> it = sa.iterator();
        //An Iteratores = un objeto que se puede usar para recorrer colecciones, como ArrayList y HashSet .
        while (it.hasNext()){
        //while recorre registro X registro, se usa principalmente en base de datos
            Alumno a = it.next();
            System.out.println(a.getNombre());
        } //hasNext() = Returns the next element in the iteration.

        System.out.println("--- Iterando usando Stream forEach ---");
        sa.forEach(System.out::println);
    }
}
