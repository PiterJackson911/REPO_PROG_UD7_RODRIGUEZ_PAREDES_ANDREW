public class Hora {

    private int hora;
    private int minuto;


    public Hora(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }
    public void inc() {
        minuto++;
        if (minuto == 60) {
            minuto = 0;
            hora++;
            if (hora == 24) {
                hora = 0;
            }
        }
    }
        public boolean setMinutos(int valor) {
            if (valor >= 0 && valor <= 59) {
                this.minuto = valor;
                return true;
            }
            return false;
        }
        public boolean setHora(int valor) {
            if (valor >= 0 && valor <= 23) {
                this.hora = valor;
                return true;
            }
            return false;
        }
            @Override
            public String toString() {
                return String.format("%02d:%02d", hora, minuto);
            }
}