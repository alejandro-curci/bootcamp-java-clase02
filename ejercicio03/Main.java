package ejercicio03;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("Elantris", "B. Sanderson", 189191);
        System.out.println(libro);
        libro.prestar();
        libro.prestar();
        libro.devolver();
        libro.prestar();
        System.out.println("Esta disponible: "+libro.isDisponible());
    }
}
