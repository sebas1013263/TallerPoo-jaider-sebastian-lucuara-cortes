package ejercicio10;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private List<Profesor> profesores; // 1 curso → muchos profesores

    public Curso(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }


    public void agregarProfesor(Profesor profesor) {
        if (profesor != null && !profesores.contains(profesor)) {
            profesores.add(profesor);
            profesor.asignarCursoInterno(this); // Evita bucle infinito
        }
    }


    void agregarProfesorInterno(Profesor profesor) {
        if (!profesores.contains(profesor)) {
            profesores.add(profesor);
        }
    }

    public void imprimirProfesores() {
        System.out.println("Curso: " + nombre + "  Profesores que estan en ese curso:");
        for (Profesor p : profesores) {
            p.imprimirProfesor();
        }
        System.out.println();
    }

}
