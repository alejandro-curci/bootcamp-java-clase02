package ejercicio02;

public class Main {
    public static void main(String[] args) {
        Contador c = new Contador();
        c.incrementar();
        c.incrementar();
        c.incrementar();
        System.out.println("Contador: " + c.getCount());
        c.disminuir();
        c.disminuir();
        System.out.println("Contador: " + c.getCount());
    }
}
