
package Taller1;

import java.util.Scanner;

public class NaveTripulada extends Nave implements Taller{
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
    @Override
    public void acelerar() {
        this.velocidadPromedio = 800;
    }

    @Override
    public void carga() {
        Scanner input = new Scanner(System.in);
        System.out.println("De cuantas personas consta la tripulación");
        tripulacion=input.nextInt();
        System.out.println("Distancia del viaje (km)");
        distancia=input.nextInt();
    }
    @Override
    public void tanquear() {
        tanqueFull = true;
        System.out.println("La nave posee el suficiente combustible para emprender el viaje");
    }

    @Override
    public void mantenimiento() {
        this.mantenimiento = true;
        System.out.println("La nave esta lista para cuando se desee usar de nuevo");
    }
}
