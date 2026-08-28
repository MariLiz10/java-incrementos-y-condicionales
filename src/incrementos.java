

package taller;

/**
 *
 * @author USUARIO
 */
public class incrementos {

    
    public static void main(String[] args) {
     int a = 5;
     int b = ++a;
     int c = 5;
     int d = c++;

     System.out.println("a = " + a);
     System.out.println("b = " + b);
     System.out.println("c = " + c);
     System.out.println("d = " + d);
     
    

        // 1. Incremento en una asignación
        int x = 10;
        int y = ++x;

        System.out.println("=== ASIGNACIÓN ===");
        System.out.println("x = " + x);
        System.out.println("y = " + y);


        // 2. Incremento en una operación matemática
       
        int resultado = a++ + 3;

        System.out.println("\n=== OPERACIÓN MATEMÁTICA ===");
        System.out.println("resultado = " + resultado);
        System.out.println("a = " + a);


        // 3. Incremento dentro de un ciclo for
        System.out.println("\n=== CICLO FOR ===");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Número: " + i);
        }
    }
}
    
