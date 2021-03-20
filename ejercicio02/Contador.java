package ejercicio02;

public class Contador {
    private int count;

    public Contador(int count) {
        this.count = count;
    }

    public Contador() {
    }

    public Contador(Contador copia) {
        this.count = copia.getCount();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void incrementar() {
        count++;
    }

    public void disminuir() {
        count--;
    }
}
