package a04;
public abstract class Instrumento {
    private Nota[] melodia;
    private int cantidad;

    public Instrumento(int capacidad) {
        this.melodia = new Nota[capacidad];
        this.cantidad = 0;
    }

    public boolean add(Nota nota) {
        if (cantidad < melodia.length) {
            melodia[cantidad] = nota;
            cantidad++;
            return true;
        }
        return false;
    }

    public Nota[] getMelodia() {
        Nota[] copia = new Nota[cantidad];
        for (int i = 0; i < cantidad; i++) {
            copia[i] = melodia[i];
        }
        return copia;
    }

    public int getCantidad() {
        return cantidad;
    }

    public abstract void interpretar();
}
