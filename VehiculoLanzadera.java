
package Taller1;

import java.util.Scanner;
/**
 * Clase que sirve para definir una nave de tipo lanzadera.
   Hereda de la clase Nave.
 * @author edwin
 */
public class VehiculoLanzadera extends Nave implements Taller{
    /**
     * Peso total de la carga que lleva la nave
     */
    public int pesoCarga;
    
    public VehiculoLanzadera() {
        this.tanquear();
        this.pesoCarga = 0;
        this.peso = 1000;
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
        this.velocidadPromedio = 1000;
    }
    /**
     * Sobreescritura de la funcion abstracta carga
     */ 
    @Override
    public void carga() {
        Scanner input = new Scanner(System.in);
        System.out.println("Que peso posee la carga");
        pesoCarga=input.nextInt();
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
