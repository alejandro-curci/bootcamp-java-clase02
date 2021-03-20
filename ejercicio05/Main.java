package ejercicio05;

public class Main {
    public static void main(String[] args) {
        // Fecha no válida
        Fecha fecha1 = new Fecha(37, 3, 2015);
        System.out.println(fecha1.toString());
        System.out.println("La fecha es válida: "+fecha1.validarFecha());
        System.out.println();

        // Fecha válida
        Fecha fecha2 = new Fecha(28, 2, 1997);
        System.out.println(fecha2.toString());
        System.out.println("La fecha es válida: "+fecha2.validarFecha());
        fecha2.sumarDia();
        System.out.println("Día siguiente: "+fecha2.toString());
    }
}
