package Tarea_1;

import Tarea_1.Unidades.Moneda100;
import Tarea_1.Unidades.Moneda1000;
import Tarea_1.Unidades.Moneda500;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonedaTest {
    @Test
    @DisplayName("Test Numero De Serie De Moneda")
    void getSerie() {
        assertNotNull(new Moneda1000().getSerie());
    }

    @Test
    @DisplayName("Test Valor De Moneda 1000")
    void getValor1000() {
        assertEquals(1000, new Moneda1000().getValor());
    }

    @Test
    @DisplayName("Test Valor De Moneda 500")
    void getValor500() {
        assertEquals(500, new Moneda500().getValor());
    }

    @Test
    @DisplayName("Test Valor De Moneda 100")
    void getValor100() {
        assertEquals(100, new Moneda100().getValor());
    }

}