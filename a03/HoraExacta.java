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



    //3. Añadir a la clase HoraExacta un método que compare si dos horas (la invocante y otra pasada
        //como parámetro de entrada al método) son iguales o distintas.
            //NOTA: utiliza equals() con @Override.

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HoraExacta otra = (HoraExacta) obj;
        return super.equals(otra) && this.segundo == otra.segundo;
    }
}