package ejercicio10;



public class Profesor {

    private String nombre;
    private Curso curso;



    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void asignarCurso(Curso curso) {
        if (curso != null && this.curso != curso) {
            this.curso = curso;
            curso.agregarProfesorInterno(this); // Evita bucle infinito
        }
    }


    void asignarCursoInterno(Curso curso) {
        if (this.curso != curso) {
            this.curso = curso;
        }
    }

    public void imprimirProfesor() {
        System.out.println("Profesor: " + nombre +
                ", Curso: " + (curso != null ? curso.getNombre() : "Sin curso"));
    }
}
