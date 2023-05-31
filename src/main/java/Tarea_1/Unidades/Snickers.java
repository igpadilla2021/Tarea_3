package Tarea_1.Unidades;

import Tarea_1.Dulces;

/**
 * clase que hereda de Dulces, para tener el dulce "Snickers"
 */
public class Snickers extends Dulces {
    /**
     * Ocurre lo mismo que en la clase Dulce, solamente se ocupa el numero de serie heredado
     * @param numSerie Int heredado desde Dulce
     */
    public Snickers(int numSerie) {
        super(numSerie);
    }
    /**
     * se define el sabor que retorna Dulce
     * @return retorna el sabor "Snickers"
     */
    public String sabor(){
        return "snickers";
    }
}
