package ejercicio8;
import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> libros;

    public Biblioteca() {

        libros = new ArrayList<>();
    }

    // Insertar un nuevo libro
    public void insertarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro añadido correctamente.");
    }

    // Borrar un libro por título
    public void borrarLibro(String titulo) {
        boolean eliminado = false;
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                libros.remove(i);
                eliminado = true;
                System.out.println("Libro eliminado correctamente.");
                break;
            }
        }
        if (!eliminado) {
            System.out.println("No se encontró un libro con ese título.");
        }
    }

    // Buscar un libro por título
    public void buscarLibro(String titulo) {
        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Libro encontrado: " + libro);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró un libro con ese título.");
        }
    }

    // Imprimir la lista de libros
    public void imprimirLibros() {
        if (libros.isEmpty()) {
            System.out.println("La biblioteca está vacía.");
        } else {
            System.out.println("Libros en la biblioteca:");
            for (Libro libro : libros) {
                System.out.println(libro);
            }
        }
    }
}

