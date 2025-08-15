package ejercicio15;

public class Libros {
    private String titulo;
    private String autor;
    private Editorial editorial;

    public Libros(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void asignarEditorial(Editorial editorial) {
        if (editorial != null && this.editorial != editorial) {
            this.editorial = editorial;
            editorial.agregarLibroInterno(this); // Evita bucle infinito
        }
    }

    //metodo interno para asignar editorial sin recursión

    void asignarEditorialInterno(Editorial editorial) {
        if (this.editorial != editorial) {
            this.editorial = editorial;
        }
    }
    public void imprimirLibro() {
        System.out.println("Título: " + titulo +
                ", Autor: " + autor +
                ", Editorial: " + (editorial != null ? editorial.getNombre() : "Sin editorial"));
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
}
