
package ejercicio4credito;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicio4Credito {

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        double ingresos;
        int puntaje;
        double antiguedad;

        System.out.println("=== EVALUACION DE CREDITO ===");

        System.out.print("Digite sus ingresos: ");
        ingresos = sc.nextDouble();
        System.out.print("Ingrese su puntaje crediticio: ");
        puntaje = sc.nextInt();
        System.out.print("Ingrese su antiguedad laboral en años: ");
        antiguedad = sc.nextDouble();

        if (ingresos > 5000000 && puntaje > 750 && antiguedad > 2) {
            System.out.println("¡CREDITO APROBADO!");

        } else if (
            (ingresos > 5000000 && puntaje > 750) ||  //&& si ambas se cumple
            (ingresos > 5000000 && antiguedad > 2) ||  //|| es or o sea si no se cumple una se puede cumplir la otra
            (puntaje > 750 && antiguedad > 2)
        ) {
            System.out.println("CREDITO CONDICIONADO");

        } else {
            System.out.println("CREDITO RECHAZADO");
        }
        
        
    }
    
}
