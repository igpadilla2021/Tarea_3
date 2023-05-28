package Tarea_1;

import Tarea_1.Exceptions.PagoIncorrectoException;
import Tarea_1.Unidades.Moneda1000;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpendedorTest {
    private Expendedor expendedor;
    private Comprador c;

    @BeforeEach
    void setUp() {
        expendedor = new Expendedor(3, 500, 900);
    }

    @Test
    void ExcepcionMonedaNull() {
        Throwable exception = assertThrows(PagoIncorrectoException.class, () -> {
            expendedor.comprarProducto(null,1); //verifica que se dispara el mensaje si jo se dispara el equals falla
        });
        assertEquals("ERROR, se intento comprar sin dinero", exception.getMessage());
    }
}