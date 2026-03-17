class Empleado extends Persona {
    private double salario;
  

    public Empleado(String name, int age, double estatura, String nacionalidad, double salario) {
        super(name, age, estatura, nacionalidad);
        this.salario = salario;
    }


    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void calcularSalarioAnual() {
        double salarioAnual = salario * 12;
        System.out.println("Salario anual de " + getName() + ": " + salarioAnual);
    }

    
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Salario: " + salario);
    }

}