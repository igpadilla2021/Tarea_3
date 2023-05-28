package Tarea_1.Exceptions;

public class PagoInsuficienteException extends Exception {
    public PagoInsuficienteException(String error){
        super(error);
    }
}