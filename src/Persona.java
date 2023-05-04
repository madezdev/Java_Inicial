import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Persona {

    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellido;
    }

    public void setApellidos(String apellido) {
        this.apellido = apellido;
    }


    public static boolean ordenarPorNombre(List<Persona> personas) {
        Collections.sort(personas, new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return p1.getNombre().compareTo(p2.getNombre());
            }
        });
        return false;
    }

    public static void ordenarPorApellido(List<Persona> personas) {
        Collections.sort(personas, new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return p1.getApellidos().compareTo(p2.getApellidos());
            }
        });
    }

    public static void ordenarPorApellidoInverso(List<Persona> personas) {
        Collections.sort(personas, new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return p2.getApellidos().compareTo(p1.getApellidos());
            }
        });
    }
}
