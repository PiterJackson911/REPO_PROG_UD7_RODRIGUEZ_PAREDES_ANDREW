public class HoraExacta extends Hora {

    private int segundo;

    public HoraExacta(int hora, int minuto, int segundo) {
        super(hora, minuto);  
        this.segundo = segundo;
    }

    public boolean setSegundos(int valor) {
        if (valor >= 0 && valor <= 59) {
            this.segundo = valor;
            return true;
        }
        return false;
    }

    @Override
    public void inc() {
        segundo++;
        if (segundo == 60) {
            segundo = 0;
            super.inc(); 
        }
    }

    @Override
    public String toString() {
        return super.toString() + String.format(":%02d", segundo);
    }
}