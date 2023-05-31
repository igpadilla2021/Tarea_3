package Tarea_1.Unidades;

import Tarea_1.Dulces;

/**
 * clase que hereda de Ducles, para tener el Dulce "Super8"
 */
public class Super8 extends Dulces {
    /**
     * Ocurre lo mismo que en la clase Dulce, solamente se ocupa el numero de serie heredado
     * @param numSerie Int heredado desde Dulce
     */
    public Super8(int numSerie) {
        super(numSerie);
    }
    /**
     * se define el sabor que retorna Dulce
     * @return retorna el sabor "Super8"
     */
    public String sabor(){
        return "super8";
    }
}
