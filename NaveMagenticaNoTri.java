
package Taller1;

import java.util.Scanner;

public class NaveMagenticaNoTri extends Nave implements Taller{
    public int pesoCarga;

    public NaveMagenticaNoTri() {
        this.tanquear();
        this.pesoCarga = 0;
        this.tanqueFull = true;
        this.acelerar();
        this.carga();
        this.viaje();
        this.mantenimiento();
    }
    
    @Override
    public void acelerar() {
        this.velocidadPromedio = 2000;
    }

    @Override
    public void carga() {
        Scanner input = new Scanner(System.in);
        System.out.println("Que peso posee la carga");
        pesoCarga=input.nextInt();
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
