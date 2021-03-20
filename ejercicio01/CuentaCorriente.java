package ejercicio01;

public class CuentaCorriente {

    private int numeroCuenta;
    private double saldo;

    public CuentaCorriente() {
    }

    public CuentaCorriente(int numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void ingresar(double saldo) {
        setSaldo(saldo);
        System.out.println("Se ha depositado " + saldo + " pesos en cuenta " + numeroCuenta);
    }

    public void retirar(double saldo) {
        if (this.saldo < saldo) {
            System.out.println("No hay fondos suficientes.");
        } else {
            setSaldo(this.saldo - saldo);
            System.out.println("Se han retirado " + saldo + " pesos de cuenta " + numeroCuenta);
        }
    }

    public void transferir(CuentaCorriente c, double saldo) {
        if (this.saldo < saldo) {
            System.out.println("No hay fondos suficientes.");
        } else {
            System.out.println("Transfiriendo...");
            this.retirar(saldo);
            c.ingresar(saldo);
        }
    }

    public void reintegrar(double compra, double porcentaje) {
        setSaldo(saldo + compra * porcentaje);
        System.out.println("Luego del reintegro, su saldo actual queda: " + saldo + " pesos.");
    }
}
