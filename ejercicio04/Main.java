package ejercicio04;

public class Main {
    public static void main(String[] args) {
        Fraccion f1 = new Fraccion(2);
        System.out.println("Fraccion 1: " + f1.toString());
        Fraccion f2 = new Fraccion(1, 5);
        System.out.println("Fraccion 2: " + f2.toString());
        System.out.println();
        System.out.println("Suma: " + Fraccion.sumar(f1, f2).toString());
        System.out.println("Resta: " + Fraccion.restar(f1, f2).toString());
        System.out.println("Producto: " + Fraccion.multiplicar(f1, f2).toString());
        System.out.println("Division: " + Fraccion.dividir(f1, f2).toString());
    }
}
