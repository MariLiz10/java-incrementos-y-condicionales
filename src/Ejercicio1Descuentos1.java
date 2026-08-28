
import java.util.Scanner;

/*
package ejercicio1descuentos1;

/**
 *
 * @author USUARIO
 */
public class Ejercicio1Descuentos1 {

    public static void main(String[] args) {
        int venta;
        //Se necesita double porque los descuentos son decimales.
        double a,b,c, prod, resta;
        a =0.10;
        b= 0.15;
        c= 0.2;
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Escribe su valor compra: ");
        venta = sc.nextInt();
        
        if (venta>=100000 && venta <=300000){
        System.out.println("Tiene un descuento del 10%");
        prod = venta*a;
        resta= venta - prod;
            System.out.println("Su descuento es de: "+ String.format("%.0f",prod)+ " pesos");
            System.out.println("Su total a pagar es: "+ String.format("%.0f",resta)+ " pesos");
        
         } else if (venta > 300001 && venta <= 500000){
             System.out.println("Tiene un descuento del 15%");
             prod = venta*b;
             resta= venta- prod;
             /*Utilicé el "String.format()" para quitar los decimales que se mostraban en los precios,
             por ejemplo "60000.0 pesos" el "0" en el formato es el número que indica no poner decimales
             para que al fin quedara "60000 pesos" y se vea mejor.*/
             System.out.println("Su descuento es de: "+ String.format("%.0f",prod)+ " pesos");
             System.out.println("Su total a pagar es: "+ String.format("%.0f",resta)+ " pesos");
         } else if ( venta > 500000){
             System.out.println("Tiene un descuento del 20%");
             prod = venta*c;
             resta= venta- prod;
             System.out.println("Su descuento es de: "+ String.format("%.0f",prod)+ " pesos");
             System.out.println("Su total a pagar es: "+ String.format("%.0f",resta) + " pesos");
         }else {
             System.out.println("No aplica descuento");
             System.out.println("Su total a pagar es: "+ venta+ " pesos");
         }
        
        System.out.println("Gracias por su compra. Tenga buen dia :D");
                 
               
        
                
                
      
    }
    
}
