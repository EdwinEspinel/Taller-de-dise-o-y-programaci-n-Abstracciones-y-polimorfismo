
package Taller1;

import java.util.Scanner;
/**
 * Clase que sirve para definir una nave tripulada.
   Hereda de la clase Nave.
 * @author edwin
 */
public class NaveTripulada extends Nave implements Taller{
    /**
     * Cantida de personas que componen la tripulación
     */
    public int tripulacion;

    public NaveTripulada() {
        this.tanquear();
        this.tripulacion = 0;
        this.peso = 1000;
        this.velocidadPromedio = 1200; 
        this.acelerar();
        this.carga();
        this.viaje();
        this.mantenimiento();
    }
    /**
     * Sobreescritura de la funcion abstracta acelerar
     */ 
    @Override
    public void acelerar() {
        this.velocidadPromedio = 800;
    }
    /**
     * Sobreescritura de la funcion abstracta carga
     */ 
    @Override
    public void carga() {
        Scanner input = new Scanner(System.in);
        System.out.println("De cuantas personas consta la tripulación");
        tripulacion=input.nextInt();
        System.out.println("Distancia del viaje (km)");
        distancia=input.nextInt();
    }
    /**
     * Aplicacion de la funcion tanquear perteneciente a la interface taller
     */
    @Override
    public void tanquear() {
        tanqueFull = true;
        System.out.println("La nave posee el suficiente combustible para emprender el viaje");
    }
    /**
     * Aplicacion de la funcion mantenimiento perteneciente a la interface taller
     */
    @Override
    public void mantenimiento() {
        this.mantenimiento = true;
        System.out.println("La nave esta lista para cuando se desee usar de nuevo");
    }
}
