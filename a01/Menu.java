public class Menu {

    public static void main(String[] args) {

        // Crear un objeto Hora
        Hora h = new Hora(10, 30);
        System.out.println("Hora inicial: " + h);  // 10:30

        // Probar inc()
        h.inc();
        System.out.println("Tras inc(): " + h);    // 10:31

        // Probar setMinutos() con valor válido
        boolean resultado = h.setMinutos(45);
        System.out.println("setMinutos(45): " + resultado + " -> " + h);  // true -> 10:45

        // Probar setMinutos() con valor inválido
        resultado = h.setMinutos(60);
        System.out.println("setMinutos(60): " + resultado + " -> " + h);  

        resultado = h.setHora(23);
        System.out.println("setHora(23): " + resultado + " -> " + h);    

        resultado = h.setHora(25);
        System.out.println("setHora(25): " + resultado + " -> " + h);    


        Hora h2 = new Hora(23, 59);
        System.out.println("Antes de medianoche: " + h2);  
        h2.inc();
        System.out.println("Tras inc():          " + h2); 
    }
}