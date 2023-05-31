package Tarea_1;

import Tarea_1.Exceptions.NoHayProductoException;
import Tarea_1.Exceptions.PagoIncorrectoException;
import Tarea_1.Exceptions.PagoInsuficienteException;
import Tarea_1.Unidades.Moneda100;
import Tarea_1.Unidades.Moneda1000;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpendedorTest {
    private Expendedor expendedor;


    @Test
    @DisplayName("Test Excepcion Moneda Null")
    void ExcepcionMonedaNull() {
        expendedor = new Expendedor(1, 500, 900);
        Throwable exception = assertThrows(PagoIncorrectoException.class, () -> {
            expendedor.comprarProducto(null,1); //verifica que se dispara el mensaje si jo se dispara el equals falla
        });
        assertEquals("ERROR, se intento comprar sin dinero", exception.getMessage());
    }

    @Test
    @DisplayName("Test Excepcion No Hay Producto")
    void ExcepcionNoHayProducto() {
        expendedor = new Expendedor(0, 500, 900);
        Throwable exception = assertThrows(NoHayProductoException.class, () -> {
            expendedor.comprarProducto(new Moneda1000(),1);
        });
        assertEquals("ERROR, el deposito seleccionado se encuentra vacio o no existe", exception.getMessage());
    }

    @Test
    @DisplayName("Test Excepcion Pago Insuficiente")
    void ExcepcionPagoInsufuciente() {
        expendedor = new Expendedor(1, 500, 900);
        Throwable exception = assertThrows(PagoInsuficienteException.class, () -> {
            expendedor.comprarProducto(new Moneda100(),1);
        });
        assertEquals("ERROR, dinero insuficiente", exception.getMessage());
    }

    @Test
    @DisplayName("Test Llenar Deposito Vacio")
    void LlenarDeposito() throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        expendedor = new Expendedor(1, 500, 900);
        expendedor.comprarProducto(new Moneda1000(),1);
        expendedor.llenarDeposito(1);
        assertNotNull(expendedor.comprarProducto(new Moneda1000(),1));
    }
}