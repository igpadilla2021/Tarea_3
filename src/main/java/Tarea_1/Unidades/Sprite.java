package Tarea_1.Unidades;

import Tarea_1.Bebida;

/**
 * clase que hereda de Bebida, para tener la bebida "Sprite"
 */
public class Sprite extends Bebida {
    /**
     * Ocurre lo mismo que en la clase Bebida, solamente se ocupa el numero de serie heredado
     * @param numSerie Int heredado desde Bebida
     */
    public Sprite(int numSerie) {
        super(numSerie);
    }

    /**
     * se define el sabor que retorna Sprite
     * @return retorna el sabor "sprite"
     */
    public String sabor(){
        return "sprite";
    }
}