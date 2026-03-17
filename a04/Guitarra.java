package a04;
public class Guitarra extends Instrumento{
        private String marca;

    public Guitarra(String marca, int capacidad) {
        super(capacidad);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public void interpretar() {
        System.out.println("Guitarra " + marca + " toca: ");
        for (Nota n : getMelodia()) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
