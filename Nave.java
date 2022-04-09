
package Taller1;

public abstract class Nave {
    public int peso;
    public int velocidadPromedio;
    public int distancia;
    public boolean tanqueFull;
    public boolean mantenimiento;
    private int tiempoViaje;
    public abstract void carga();
    public abstract void acelerar();

    public Nave() {
        this.peso = 0;
        this.velocidadPromedio = 0;
        this.distancia = 0;
        this.tanqueFull = false;
        this.mantenimiento = true;
    }
    public void viaje(){
        tiempoViaje=distancia/velocidadPromedio;
        System.out.println("Su viajes se demorará "+ tiempoViaje+ " Horas");
        this.mantenimiento = false;
    }
   
}
