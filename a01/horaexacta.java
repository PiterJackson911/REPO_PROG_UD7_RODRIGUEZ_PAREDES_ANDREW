class horaexacta extends hora {
    public horaexacta(int h, int m, int s) {
        super(h, m, s);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", getHoras(), getMinutos(), getSegundos());
    }
    
}
