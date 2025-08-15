package ejercicio13;
import java.util.ArrayList;
import java.util.List;


public class Curso {
    private String nombre;
    private List<Estudiante> estudiantes = new ArrayList<>();

    public Curso(String nombre) {
        this.nombre = nombre;

    }

    public void agregarEstudiante(Estudiante estudiante) {
        if(!this.estudiantes.contains(estudiante)) {
            this.estudiantes.add(estudiante);
            estudiante.inscribirenCurso(this);
        }
    }

    public void imprimirEstudiantes() {
        System.out.println("Curso: " + nombre + " tiene inscritos:");
        for (Estudiante e : estudiantes) {
            System.out.println(" - " + e.getNombre());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }


}
