/*
 * VAZQUEZ SILVA DANTE
 * 3S11
 */
package principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
    
    // ASIGANAMOS EL NUEMRO DE VEICULOS MAXIMOS QUE PUEDE LEER EL PROGRAMA 
        Vehiculo a[]=new Vehiculo[2];
        for(int i=1;i<a.length;i++){
    // EL USUARIO INSERTA CARACTERISTICAS DEL VEHICULO 
            System.out.println("Ingrese el numero de ruedas con las que cuenta el vehiculo " + i);
            int ruedas=leer.nextInt();
            
            System.out.println("Ingrese el numero la matricula  del vehiculo " + i);
            int matricula=leer.nextInt();
            
            System.out.println("Ingrese el numero de puertas  con las que cuenta el vehiculo " + i);
            int puertas=leer.nextInt();
            
            System.out.println("Ingrese el numero de pasajeros que puede transportar el vehiculo " + i);
            int pasajeros=leer.nextInt();
            
            a[i]= new Vehiculo(ruedas,matricula,puertas,pasajeros);
    // SE CREA LA COMPARACION CON LOS DATOS QUE INGRESO EL USUARIO CON LOS QUE TIENE EL PROGRAMA  
            if(a[i].getRuedas()==4 && (a[i].getPuertas()==4 || a[i].getPuertas()==2 ) && a[i].getPasajeros()<=5){
                System.out.println("El vehiculo " + i + " es un Coche");
                
            }else if(a[i].getRuedas()==2 && a[i].getPuertas()==0 && a[i].getPasajeros()<=2){
                System.out.println("El vehiculo " + i + " es una Moto");
                
            }

        }
        
    }
}
    
    

