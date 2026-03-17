public class Main {

    public static void main(String[] args) {

        System.out.println("=== Clase Hora ===");
        Hora h = new Hora(10, 30);
        System.out.println("Hora inicial: " + h);       
        h.inc();
        System.out.println("Tras inc(): " + h);      
        System.out.println("setMinutos(60): " + h.setMinutos(60) + " -> " + h); 
        System.out.println("setHora(25): "   + h.setHora(25)   + " -> " + h);   

        System.out.println("\n=== Clase HoraExacta ===");
        HoraExacta he = new HoraExacta(10, 30, 58);
        System.out.println("Hora inicial: " + he);     

        he.inc();
        System.out.println("Tras inc(): " + he);        

    
        he.inc();
        System.out.println("Tras inc(): " + he);        
        System.out.println("setSegundos(45): " + he.setSegundos(45) + " -> " + he); 
        System.out.println("setSegundos(60): " + he.setSegundos(60) + " -> " + he); 

        HoraExacta he2 = new HoraExacta(10, 59, 59);
        System.out.println("\nAntes: " + he2);         
        he2.inc();
        System.out.println("Tras inc(): " + he2);       

        // Desbordamiento de medianoche
        HoraExacta he3 = new HoraExacta(23, 59, 59);
        System.out.println("\nAntes: " + he3);          
        he3.inc();
        System.out.println("Tras inc(): " + he3);       
    }
}