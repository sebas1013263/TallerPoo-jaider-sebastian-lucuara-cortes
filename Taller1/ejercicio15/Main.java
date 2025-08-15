package ejercicio15;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Editorial editorial1 = new Editorial("planeta");
        Editorial editorial2 = new Editorial("Fantasia");

        Libros libro1 = new Libros("cien años de soledad","gabriel garcia marquez");
        Libros libro2 = new Libros("El amor en los tiempos del colera","Gabriel gracia marquez");
        Libros libro3 = new Libros("1234","georgue");

        editorial1.agregarLibro(libro1);
        editorial1.agregarLibro(libro2);
        libro3.asignarEditorial(editorial2);

        editorial1.imprimirLibros();
        editorial2.imprimirLibros();



    }
}
