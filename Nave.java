
package Taller1;
/**
 * Clase abstracta que sirve para definir cualquier tipo de nave
 * @author edwin
 */
public abstract class Nave {
    /**
     * Peso de la nave
     */
    public int peso;
    /**
     * Velocidad promedio de vuelo de la nave
     */
    public int velocidadPromedio;
    /**
     * Distancia que se desea recorrer
     */
    public int distancia;
    /**
     * Determina si el tanque esta lleno y listo para un viaje
     */
    public boolean tanqueFull;
    /**
     * Determina si se realizo el mantenimiento obligatorio antes de un vuelo
     */
    public boolean mantenimiento;
    /**
     * Tiempo que demora el vuelo
     */
    private int tiempoViaje;
    /**
     * Funcion abstracta que determina el tipo de carga
     */
    public abstract void carga();
    /**
     * Funcion abstracta que define el modo de aceleracion de la nave
     */
    public abstract void acelerar();
    public Nave() {
        this.peso = 0;
        this.velocidadPromedio = 0;
        this.distancia = 0;
        this.tanqueFull = false;
        this.mantenimiento = true;
    }
    /**
     * Funcion que determina cuanto tiempo deberá tardar el vuelo
     */
    public void viaje(){
        tiempoViaje=distancia/velocidadPromedio;
        System.out.println("Su viajes se demorará "+ tiempoViaje+ " Horas");
        this.mantenimiento = false;
    }
   
}
