package org.eduardo.api.list;

import org.eduardo.api.modelo.Alumno;

import java.util.ArrayList;
import java.util.List;

public class EjemploArrayList {
    public static void main(String[] args) {

        List<Alumno> al = new ArrayList<>();
        System.out.println(al + ", size = " + al.size());
        System.out.println("esta vacia = " + al.isEmpty());
        al.add(new Alumno("Pato", 5));
        al.add(new Alumno("Gata", 6));
        al.add(new Alumno("Luci", 4));

        //Agrega objetos Alumno en posiciones específicas de la lista utilizando el método add():
        //ADD:
        al.add(2 , new Alumno("Jano", 7));
        //SET:
        al.set(3 , new Alumno("Andres", 3));
        //Imprime por pantalla el contenido actualizado de la lista al y su tamaño:
        System.out.println("-- Contenido actualizado --");
        System.out.println(al + ", size = " + al.size());

        //Elimina un objeto Alumno de la lista utilizando el método remove():
        al.remove(new Alumno("Jano", 7));
        System.out.println(" -- Remove -- ");
        al.remove(0);
        System.out.println(al + ", size = " + al.size());

        //Verifica si la lista contiene un objeto Alumno específico utilizando el método contains():
        boolean b = al.contains(new Alumno("Cata", 6));
        System.out.println(" -- Validacion de un Obj Especifico -- ");
        System.out.println("la lista contoiene a Cata = " + b);

        //Convierte la lista al en un array de tipo Object utilizando el método toArray():
        Object a[] = al.toArray();
        //Luego, itera sobre el array e imprime cada elemento por pantalla:
        for(int i = 0; i<a.length; i++){
            System.out.println(" -- Lista convertida a Array -- ");
            System.out.println("Desde el array = " + a[i]);
        }
        //NOTA: Un ArrayList a diferencia de un Array es mejor para gestionar la informacion.
        //pero si solo se quiere almacenar informacion un Array es mejor porque su peso es menor

        //Resumen: Array: almacenamiento /// ArrayList: Gestion
    }
}
