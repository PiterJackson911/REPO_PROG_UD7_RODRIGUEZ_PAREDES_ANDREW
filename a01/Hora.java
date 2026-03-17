class hora {
    private int horas;
    private int minutos;
    private int segundos;

    public hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public void mostrarHora() {
        System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
    }
}