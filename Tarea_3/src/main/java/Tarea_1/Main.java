package Tarea_1;

import Tarea_1.Unidades.Moneda100;
import Tarea_1.Unidades.Moneda1000;
import Tarea_1.Unidades.Moneda500;

public class Main {
    public static void main(String[] args){
        Expendedor exp=new Expendedor (3);
        Comprador c=null;
        Moneda m=null;
/** Prueba hasta agotar stock COCA COLA */
        m = new Moneda1000();
        c = new Comprador(m, Seleccion.COCA.getProducto(), exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        m = new Moneda1000();
        c = new Comprador(m, Seleccion.COCA.getProducto(), exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        m = new Moneda1000();
        c = new Comprador(m, Seleccion.COCA.getProducto(), exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        m = new Moneda1000();
        c = new Comprador(m, Seleccion.COCA.getProducto(), exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
/** Prueba Tarea_1.Moneda null COCA COLA */
        m = null;
        c = new Comprador(m, Seleccion.COCA.getProducto(), exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        m = null;
        c = new Comprador(m, Seleccion.COCA.getProducto(), exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
/** Prueba Tarea_1.Moneda menor valor COCA COLA */
        m = new Moneda500();
        c = new Comprador(m, Seleccion.COCA.getProducto(), exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        m = new Moneda100();
        c = new Comprador(m, Seleccion.COCA.getProducto(), exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());

/**--------------------------------------------------------------------------------------------------------*/

/** Prueba hasta agotar stock SPRITE */
        m = new Moneda1000();
        c = new Comprador(m, Seleccion.SPRITE.getProducto(), exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        m = new Moneda1000();
        c = new Comprador(m, Seleccion.SPRITE.getProducto(), exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        m = new Moneda1000();
        c = new Comprador(m, Seleccion.SPRITE.getProducto(), exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        m = new Moneda1000();
        c = new Comprador(m, Seleccion.SPRITE.getProducto(), exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
/** Prueba Tarea_1.Moneda null SPRITE */
        m = null;
        c = new Comprador(m, Seleccion.SPRITE.getProducto(), exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        m = null;
        c = new Comprador(m, Seleccion.SPRITE.getProducto(), exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
/** Prueba Tarea_1.Moneda menor valor SPRITE */
        m = new Moneda500();
        c = new Comprador(m, Seleccion.SPRITE.getProducto(), exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        m = new Moneda100();
        c = new Comprador(m, Seleccion.SPRITE.getProducto(), exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());

/**--------------------------------------------------------------------------------------------------------*/

/** Prueba hasta agotar stock SNICKERS */
        m = new Moneda1000();
        c = new Comprador(m, Seleccion.SNICKERS.getProducto(), exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        m = new Moneda1000();
        c = new Comprador(m, Seleccion.SNICKERS.getProducto(), exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        m = new Moneda1000();
        c = new Comprador(m, Seleccion.SNICKERS.getProducto(), exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        m = new Moneda1000();
        c = new Comprador(m, Seleccion.SNICKERS.getProducto(), exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
/** Prueba Tarea_1.Moneda null SNIKERS */
        m = null;
        c = new Comprador(m, Seleccion.SNICKERS.getProducto(), exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        m = null;
        c = new Comprador(m, Seleccion.SNICKERS.getProducto(), exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
/** Prueba Tarea_1.Moneda menor valor SNIKERS */
        m = new Moneda500();
        c = new Comprador(m, Seleccion.SNICKERS.getProducto(), exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        m = new Moneda100();
        c = new Comprador(m, Seleccion.SNICKERS.getProducto(), exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());

/**--------------------------------------------------------------------------------------------------------*/

/** Prueba hasta agotar stock SUPER 8 */
        m = new Moneda1000();
        c = new Comprador(m, Seleccion.SUPER8.getProducto(), exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        m = new Moneda1000();
        c = new Comprador(m, Seleccion.SUPER8.getProducto(), exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        m = new Moneda1000();
        c = new Comprador(m, Seleccion.SUPER8.getProducto(), exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        m = new Moneda1000();
/** Prueba Tarea_1.Moneda null SUPER 8 */
        m = null;
        c = new Comprador(m, Seleccion.SUPER8.getProducto(), exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        m = null;
        c = new Comprador(m, Seleccion.SUPER8.getProducto(), exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
/** Prueba Tarea_1.Moneda menor valor SUPER 8 */
        m = new Moneda500();
        c = new Comprador(m, Seleccion.SUPER8.getProducto(), exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
        m = new Moneda100();
        c = new Comprador(m, Seleccion.SUPER8.getProducto(), exp);
        System.out.println(c.queConsumiste() + ", " + c.cuantoVuelto());
    }
}