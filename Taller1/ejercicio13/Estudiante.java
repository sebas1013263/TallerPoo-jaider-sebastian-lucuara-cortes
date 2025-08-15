package ejercicio13;
import java.util.List;
import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private List<Curso> cursos;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.cursos = new ArrayList<>();
    }

    public Estudiante() {}

    public void inscribirenCurso(Curso curso) {
        if (!this.cursos.contains(curso)) {
            this.cursos.add(curso);
            curso.agregarEstudiante(this);
        }


    }
    public void imprimirCursos() {
        System.out.println("Estudiante: " + nombre + " está inscrito en:");
        for (Curso c : cursos) {
            System.out.println(" - " + c.getNombre());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }


}
