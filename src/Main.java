import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Persona> listaPersonas = new ArrayList<Persona>();

        Persona persona1 = new Persona("Silvina","Catania");
        Persona persona2 = new Persona("Javier","Fernandez");
        Persona persona3 = new Persona("Lara","Vasquez");
        Persona persona4 = new Persona("Pepe","Mujica");
        Persona persona5 = new Persona("Celia","Cruz");


        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);
        listaPersonas.add(persona4);
        listaPersonas.add(persona5);


        Persona.ordenarPorNombre(listaPersonas);
        System.out.println("Ordenar por nombre");

        for (Persona persona : listaPersonas) {
            System.out.println(persona.getNombre() + " " + persona.getApellidos());
        }
        System.out.println("\n================================");


        Persona.ordenarPorApellido(listaPersonas);
        System.out.println("Ordenar por apellido");

        for (Persona persona : listaPersonas) {
            System.out.println(persona.getNombre() + " " + persona.getApellidos());
        }
        System.out.println("\n================================");

        Persona.ordenarPorApellidoInverso(listaPersonas);
        System.out.println("Ordenar por apellido inverso");

        for (Persona persona : listaPersonas) {
            System.out.println(persona.getNombre() + " " + persona.getApellidos());
        }

    }


}