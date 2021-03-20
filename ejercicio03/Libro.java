package ejercicio03;

public class Libro {
    private String titulo;
    private String autor;
    private int isbn;
    private boolean disponible;

    public Libro() {
    }

    public Libro(String titulo, String autor, int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true;
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

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void prestar() {
        if(disponible) {
            setDisponible(false);
            System.out.println("Préstamo exitoso!");
        } else {
            System.out.println("El libro ya está prestado");
        }
    }

    public void devolver() {
        setDisponible(true);
        System.out.println("El libro ahora está disponible.");
    }

    @Override
    public String toString() {
        return "El libro "+titulo+" es del autor "+autor+". Su codigo ISBN es "+isbn;
    }
}
