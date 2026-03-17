class Cliente extends Persona {
    private  double presupuesto;

        public Cliente(String name, int age, double estatura, String nacionalidad, double presupuesto) {
        super(name, age, estatura, nacionalidad);
        this.presupuesto = presupuesto;
    }


    public double getPresupuesto() {
        return presupuesto;
    }
    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public void calcularPresupuestoAnual() {
        double presupuestoAnual = presupuesto * 12;
        System.out.println("Presupuesto anual de " + getName() + ": " + presupuestoAnual);
    }

    
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Presupuesto: " + presupuesto);
    }

}
