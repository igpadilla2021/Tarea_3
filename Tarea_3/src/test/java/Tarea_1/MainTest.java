package Tarea_1;

import Tarea_1.Unidades.Moneda1000;
import Tarea_1.Unidades.Moneda500;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
class MainTest {
    private Expendedor expendedor;
    private Comprador c;

    @BeforeEach
    void setUp() {
        expendedor = new Expendedor(3, 500, 900);
    }


    @Test
    @DisplayName("Test Una Bebida")
    void ComprarUnaBebida() {
        c = new Comprador(new Moneda1000(), Expendedor.COCA, expendedor);
        assertNotNull(c.Prodcuto());
    }

    @Test
    @DisplayName("Test Todas Las Bebidas (3 Unidades)")
    void ComprarTodasBebidas() {
        c = new Comprador(new Moneda1000(), Expendedor.COCA, expendedor);
        assertNotNull(c.Prodcuto());
        c = new Comprador(new Moneda1000(), Expendedor.COCA, expendedor);
        assertNotNull(c.Prodcuto());
        c = new Comprador(new Moneda1000(), Expendedor.COCA, expendedor);
        assertNotNull(c.Prodcuto());
    }

    @Test
    @DisplayName("Test Exceso De Unidades (4 Unidades)")
    void ComprarExecesoBebidas() {
        c = new Comprador(new Moneda1000(), Expendedor.COCA, expendedor);
        assertNotNull(c.Prodcuto());
        c = new Comprador(new Moneda1000(), Expendedor.COCA, expendedor);
        assertNotNull(c.Prodcuto());
        c = new Comprador(new Moneda1000(), Expendedor.COCA, expendedor);
        assertNotNull(c.Prodcuto());
        c = new Comprador(new Moneda1000(), Expendedor.COCA, expendedor);
        assertNull(c.Prodcuto());
    }

    @Test
    @DisplayName("Test De Vuelto De Moneda Mayor")//version prematura
    void VueltoMonedaMayor() {
        c = new Comprador(new Moneda1000(), Expendedor.COCA, expendedor);
        assertEquals(500, c.cuantoVuelto());
    }

    @Test
    @DisplayName("Test De Vuelto De Moneda Mayor")
        //version prematura
    void VueltoMonedaMenor() {
        c = new Comprador(new Moneda1000(), Expendedor.COCA, expendedor);
        assertEquals(500, c.cuantoVuelto());
    }

    @Test
    @DisplayName("Test De Vuelto De Moneda Igual")
        //version prematura
    void VueltoMonedaIgual() {
        c = new Comprador(new Moneda500(), Expendedor.COCA, expendedor);
        assertEquals(0, c.cuantoVuelto());
    }

    @Test
    @DisplayName("Test De Vuelto De Moneda Nula") //version prematura
    void VueltoMonedaNula(){
        c = new Comprador(null, Expendedor.COCA, expendedor);
        assertEquals(0,c.cuantoVuelto());
    }
}