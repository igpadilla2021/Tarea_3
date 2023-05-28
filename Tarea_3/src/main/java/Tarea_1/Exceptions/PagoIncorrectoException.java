package Tarea_1.Exceptions;

public class PagoIncorrectoException extends Exception {
    public PagoIncorrectoException(String error){
        super(error);
    }
}