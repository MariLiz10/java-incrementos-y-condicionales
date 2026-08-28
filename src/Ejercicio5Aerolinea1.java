/*
 
 */
package ejercicio5aerolinea1;

import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Ejercicio5Aerolinea1 {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

 int vuelos;
 String membresia;

        System.out.println("==CATEGORIA DE PASAJEROS==");
        System.out.println("Digite la cantidad de vuelos que ha tomado durante el año: ");
        vuelos=sc.nextInt();
        
        sc.nextLine();
                
        System.out.println("¿Tiene membresia activa? (si/no)en minuscula ");
        membresia=sc.nextLine();
        
        if (vuelos>50 && membresia.equals("si")){
             System.out.println("==SU CLASIFICACION==");
            System.out.println("Pertenece a categoria ORO");
           
            
            if (vuelos>70){
                    System.out.println("Tiene acceso VIP");
                    } else{
                 System.out.println("No tiene acceso VIP");
            }
            
        } else{
            if(vuelos>=20 && vuelos<=50 && membresia.equals("si")){
                System.out.println("==SU CLASIFICACION==");
                System.out.println("Pertenece a categoria PLATA");
                System.out.println("No tiene acceso VIP");
                
        }else{
                if(vuelos<20 && membresia.equals("no")){
                    System.out.println("==SU CLASIFICACION==");
                    System.out.println("Pertenece a categoria BASICA");
                    System.out.println("No tiene acceso VIP");
                }
            }
        }
        
        
        
        
        
        
        
        
    }
}
