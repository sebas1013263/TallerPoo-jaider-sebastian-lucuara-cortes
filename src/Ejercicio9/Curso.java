package Ejercicio9;
import java.util.ArrayList;

public class Curso {

    private ArrayList<Estudiante> estudiantes;

    public Curso() {
        estudiantes = new ArrayList<>();
    }

    public void InsertarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
        System.out.println("Estudiante insertado: " + estudiante);
    };

    public void buscarEstudiante(String nombre) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNombre().equals(nombre)) {
                System.out.println("Estudiante encontrado: " + estudiante);
            }
        }
    };

    public void eliminar(String nombre) {
        boolean eliminado = false;
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getNombre().equalsIgnoreCase(nombre)) {
                estudiantes.remove(i);
                eliminado = true;
                System.out.println("estudiante eliminado exitosamente .");
                break;
            }
        }
        if (!eliminado) {
            System.out.println("No se encontró un estudiante con ese nombre.");
        }
    }


    public void imprimirEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("El curso está vacía.");
        } else {
            System.out.println("||||||||||||||||||  LISTA DE ESTUDIANTES  ||||||||||||||||||||");

            for (Estudiante estudiante : estudiantes) {
                System.out.println(estudiante);

            }
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        }
    };





}
