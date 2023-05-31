package Tarea_1;

import Tarea_1.Unidades.CocaCola;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepositoTest {
    private Deposito<Producto> producto;

    @Test
    @DisplayName("Test Sacar Producto acola De Deposito")
    void get() {
        producto = new Deposito<Producto>();
        producto.add(new CocaCola(113));
        assertEquals(113, producto.get().getSerie());
    }
}