package ejercicio04;

public class Fraccion {

    private int numerador;
    private int denominador;

    public Fraccion(int numerador) {
        this.numerador = numerador;
        this.denominador = 1;
    }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public static Fraccion sumar(Fraccion f1, Fraccion f2) {
        int num;
        int den;
        if (f1.denominador == f2.denominador) {
            num = f1.numerador + f2.numerador;
            den = f1.denominador;
        } else {
            den = f1.denominador * f2.denominador;
            num = f1.numerador * f2.denominador + f2.numerador * f1.denominador;
        }
        return new Fraccion(num, den);
    }

    public static Fraccion restar(Fraccion f1, Fraccion f2) {
        int num;
        int den;
        if (f1.denominador == f2.denominador) {
            num = f1.numerador - f2.numerador;
            den = f1.denominador;
        } else {
            den = f1.denominador * f2.denominador;
            num = f1.numerador * f2.denominador - f2.numerador * f1.denominador;
        }
        return new Fraccion(num, den);
    }

    public static Fraccion multiplicar(Fraccion f1, Fraccion f2) {
        int num = f1.numerador * f2.numerador;
        int den = f1.denominador * f2.denominador;
        return new Fraccion(num, den);
    }

    public static Fraccion dividir(Fraccion f1, Fraccion f2) {
        if (f2.numerador == 0) {
            System.out.println("No es posible dividir por cero!");
            return null;
        } else {
            int num = f1.numerador * f2.denominador;
            int den = f1.denominador * f2.numerador;
            return new Fraccion(num, den);
        }
    }

    @Override
    public String toString() {
        if(denominador==1) {
            return String.valueOf(numerador);
        } else {
            return numerador+"/"+denominador;
        }
    }
}
