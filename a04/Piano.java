package a04;
public class Piano extends Instrumento {
    private boolean electrico;


    public Piano(boolean electrico, int capacidad) {
        super(capacidad);
        this.electrico = electrico;
    }

    @Override
    public void interpretar() {
        String tipo = electrico ? "Piano electrico" : "Piano acustico";
        System.out.println(tipo + " interpreta: ");
        for (Nota n : getMelodia()) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
