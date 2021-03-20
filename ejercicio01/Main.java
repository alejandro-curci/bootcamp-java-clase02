package ejercicio01;

public class Main {
    public static void main(String[] args) {
        CuentaCorriente miCuenta = new CuentaCorriente(2992, 0);
        CuentaCorriente otraCuenta = new CuentaCorriente(9012, 0);
        miCuenta.ingresar(2000.75);
        miCuenta.retirar(5000.90);
        miCuenta.reintegrar(3000.0, 0.20);
        miCuenta.transferir(otraCuenta, 1200.10);
        System.out.println("Mi cuenta queda en: "+miCuenta.getSaldo());
        System.out.println("La otra cuenta queda en: "+otraCuenta.getSaldo());
    }
}
