
package Taller1;

import java.io.IOException;
import java.util.Scanner;
/**
 * Metodo main del sistema
 * @author edwin
 */
public class Main {
    /**
     * variable que sirve para el funcionamiento del switch
     */
    private static boolean bandera=true;
    private static int opcion;
    /**
     * Metodo que llama a todas las funciones dentro de la clase main
     */
    public static void main(String[] args) throws IOException{
        do {
            limpiarPantalla();
            menu();
            opcion = capturarOpcion();
            bandera = evaluarOpcion(opcion);
        } while (bandera == true);
    }
    /**
     * Menu del sistema
     */
    private static void menu() {
        System.out.println("Escoja un punto del taller");
        System.out.println("1. Usar un vehiculo lanzadera");
        System.out.println("2. Enviar un vehiculo con tripulación");
        System.out.println("3. Usar un vehiculo no tripulado");
        System.out.println("4. Usar un vehiculo Magnetico");
        System.out.println("0. Salir del taller");
        
    }
    /**
     * Funcion que permite capturar la opcion que seleciono el usuario
     * @return un entero
     */
    private static int capturarOpcion() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    /**
     * 
     * @param opcion
     * @return un valor voleano que permite determinar si se ejecuta de nuevo
               el menu
     */
    private static boolean evaluarOpcion(int opcion) throws IOException {
        switch (opcion) {
            case 1:
                VehiculoLanzadera miViaje=new VehiculoLanzadera();
                return true;
            case 2:
                NaveTripulada miViaje2 = new NaveTripulada();
                return true;
            case 3:
                NaveNoTripulada miViaje3 = new NaveNoTripulada();
                return true;
            case 4:
                NaveMagenticaNoTri miViaje4 = new NaveMagenticaNoTri();
                return true;
            case 0:
                return false;
            default:
                System.out.println("Opción incorrecta");
                System.in.read();
        }
        return true;
    }
    /**
     * Permite limpiar la pantalla
     */
    private static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    
}
