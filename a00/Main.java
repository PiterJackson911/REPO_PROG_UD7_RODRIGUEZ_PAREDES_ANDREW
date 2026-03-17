public class Main {
    public static void main(String[] args) {

        Empleado emp = new Empleado("Juan", 30, 1.80, "Española", 2000.0);
        emp.mostrarDatos();
        emp.calcularSalarioAnual();
        System.out.println("---");
        Cliente cli = new Cliente("Maria", 25, 1.65, "Mexicana", 1500.0);
        cli.mostrarDatos();
        cli.calcularPresupuestoAnual();
    }
}                                                