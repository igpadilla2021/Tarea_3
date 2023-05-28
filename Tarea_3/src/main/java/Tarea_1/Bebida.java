package Tarea_1;

/**
 *Clase que define a el producto Bebida
 * @author Ignacio Padilla
 * @author Joaquin Garcia
 */

public abstract class Bebida extends Producto{
    /**
     * El metodo constructor ocupa solamente el numero de serie que se heredó de la clase Producto
     * @param numSerie Int heredado desde Producto
     */
    public Bebida(int numSerie) {
        super(numSerie);
    }
}