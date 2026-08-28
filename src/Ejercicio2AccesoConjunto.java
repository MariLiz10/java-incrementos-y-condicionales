
package ejercicio2accesoconjunto;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicio2AccesoConjunto {
    public static void main(String[] args) {
        
    Scanner sc= new Scanner(System.in);
        
       String tieneTarjeta;   //String sirve para guardar texto
       String tarjetaActiva;
       String tieneDeudas;
       
        System.out.println("==CONTROL DE ACCESO==");
       
       System.out.println("¿Tienes tarjeta? ");
       tieneTarjeta= sc.nextLine(); //nextLine sirve para leer texto escrito por el usuario
       
       // equals sirve para comparar dos textos
       if (tieneTarjeta.equals("no")){
           System.out.println("Acceso denegado por ausencia de tarjeta.");
           
           } else{
           
           System.out.println("¿La tarjeta está activa?");
           tarjetaActiva= sc.nextLine();
           
           if (tarjetaActiva.equals("no")) {
               System.out.println("Acceso restringido por tarjeta inactiva.");
               
           } else {
               
               System.out.println("¿Tiene deudas?");
               tieneDeudas= sc.nextLine();            
   
               if (tieneDeudas.equals("si")) {
                   System.out.println("Acceso restringido por mora.");
                   
               } else {
                   System.out.println("Acceso permitido.");
               }
           }
       }
    }
    
}
    

