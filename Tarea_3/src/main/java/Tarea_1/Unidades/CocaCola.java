package Tarea_1.Unidades;

import Tarea_1.Bebida;

/**
 * clase que hereda de Bebida, para tener la bebida "Coca cola"
 */
public class CocaCola extends Bebida {
    /**
     * Ocurre lo mismo que en la clase Bebida, solamente se ocupa el numero de serie heredado
     * @param numSerie Int heredado desde Bebida
     */
    public CocaCola(int numSerie) {
        super(numSerie);
    }

    /**
     * se define el sabor que retorna CocaCola
     * @return retorna el sabor "cocacola"
     */
    public String sabor(){
        return "cocacola";
    }
}
