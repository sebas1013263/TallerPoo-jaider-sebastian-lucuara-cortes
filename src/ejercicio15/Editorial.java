package ejercicio15;
import java.util.ArrayList;
import java.util.List;

public class Editorial {
    private String nombre;
    List<Libros> libros = new ArrayList<>();

    public void agregarLibro(Libros libro) {
        if (libro != null && !libros.contains(libro)) {
            libros.add(libro);
            libro.asignarEditorialInterno(this); // Evita bucle infinito
        }
    }

    // metodo interno para agregar libro sin recursión

    void agregarLibroInterno(Libros libro) {
        if (!libros.contains(libro)) {
            libros.add(libro);
        }
    }

    public void imprimirLibros() {
        System.out.println("Editorial: " + nombre + " → Libros publicados:");
        for (Libros libro : libros) {
            libro.imprimirLibro();
        }
        System.out.println();
    }
    public Editorial(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}