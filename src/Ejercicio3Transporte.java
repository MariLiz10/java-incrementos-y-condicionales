
import java.util.Scanner;

/*
 
package ejercicio3transporte;

/**
 *
 * @author USUARIO
 */
public class Ejercicio3Transporte {

    public static void main(String[] args) {
     int viajes;
     double calificacion;
     String disponibilidad;
     int condiciones=0;
      Scanner sc= new Scanner (System.in);
      
       System.out.println("== ASIGNACION DE CONDUCTOR ==");
        System.out.print("Ingrese la calificacion: ");
        calificacion = sc.nextDouble();
        System.out.print("Ingrese la cantidad de viajes: ");
        viajes = sc.nextInt();
        
        sc.nextLine();

        System.out.print("¿Esta disponible? (si/no en minuscula): ");
        disponibilidad = sc.nextLine();
   
        if (calificacion>=4.8){
          condiciones++;
        }
        
        if(viajes>500){
          condiciones++;
        }
        
        if (disponibilidad.equals("si")){
          condiciones++;
          
        } 
            if (condiciones==3){
                System.out.println("Conductor Premium");
            }else if(condiciones==2){
                System.out.println("Conductor Estandar");
            }else {
                System.out.println("No puede ser asignado");
            
            
            
        }
        
       } 
     }
        
       
     
        
    
    
 
    

