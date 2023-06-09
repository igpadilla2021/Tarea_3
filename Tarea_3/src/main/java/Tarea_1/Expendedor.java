package Tarea_1;

import Tarea_1.Exceptions.NoHayProductoException;
import Tarea_1.Exceptions.PagoIncorrectoException;
import Tarea_1.Exceptions.PagoInsuficienteException;
import Tarea_1.Unidades.*;

/**
 *Clase que define a el Expendedor
 * @author Ignacio Padilla
 * @author Joaquin Garcia
 */


public class Expendedor {
    /**
     * cuatro depositos de tipo Producto para almacenar nuestras bebidas y dulces, y un deposito del tipo Tarea_1.Moneda para
     * almacenar nuestro vuelto en monedas.
     *
     *
     * finalmente dos Int los cuales son el precio de las bebidas y el precio de los dulces
     */
    private Deposito<Producto> coca;
    private Deposito<Producto> sprite;
    private Deposito<Producto> snickers;
    private Deposito<Producto> super8;
    private Deposito<Moneda> monVu;
    private int precioCoca;
    private int precioSprite;
    private int precioSnicker;
    private int precioSuper8;
    private int pcoca;
    private int psprite;
    private int psnickers;
    private int psuper8;
    private int numProductos;


    /**
     * metodo constructor de el Expendedor donde se definen todos los depositos de productos y el de monedas, ademas de
     * rellenar los depositos
     * @param numProductos Int de la cantidad de bebidas y dulces con los que se rellenan los depositos
     */
    public Expendedor(int numProductos){
        this.precioCoca=Seleccion.COCA.getPrecio();
        this.precioSprite=Seleccion.SPRITE.getPrecio();
        this.precioSnicker=Seleccion.SNICKERS.getPrecio();
        this.precioSuper8=Seleccion.SUPER8.getPrecio();
        this.numProductos=numProductos;
        pcoca=100;
        psprite=200;
        psnickers=300;
        psuper8=400;
        this.monVu=new Deposito<Moneda>();
        coca=new Deposito<Producto>();
        sprite=new Deposito<Producto>();
        snickers=new Deposito<Producto>();
        super8=new Deposito<Producto>();
        for(int p=0;p!=numProductos;p=p+1){
            pcoca=pcoca+1;
            coca.add(new CocaCola(pcoca));
            psprite=psprite+1;
            sprite.add(new Sprite(psprite));
            psnickers=psnickers+1;
            snickers.add(new Snickers(psnickers));
            psuper8=psuper8+1;
            super8.add(new Super8(psuper8));
        }
    }

    /**
     * Metodo para comprar productos donde se checkea cual producto se quiere comprar y el valor de la moneda, dando un
     * vuelto acorde a este valor. Si el producto que se quiere sacar no es ninguno de los disponibles, se returna null
     * y un vuelto igual a la moneda ingresada
     * @param m Tarea_1.Moneda la cual se ingresa al comprar el producto
     * @param cual Cual producto es el que se quiere comprar
     * @return Retorna el producto sacado del deposito que se pide en el parametro cual
     */
    public Producto comprarProducto(Moneda m, int cual) throws PagoInsuficienteException, PagoIncorrectoException, NoHayProductoException {
        int p;
        Producto b;
        if (m==null){
            throw new PagoIncorrectoException("ERROR, se intento comprar sin dinero");
        }
        if (((cual == 1) && (m.getValor() >= precioCoca)) || ((cual == 2) && (m.getValor() >= precioSprite)) ||
                ((cual == 3) && (m.getValor() >= precioSnicker)) || ((cual == 4) && (m.getValor() >= precioSuper8))) {
            if (cual==1){
                b = coca.get();
            }
            else if (cual==2){
                b = sprite.get();
            }
            else if (cual==3){
                b=snickers.get();
            }
            else {
                b=super8.get();
            }
            if(b!=null && cual==1){
                for (p=0; p<((m.getValor() - precioCoca)/100); p=p+1){
                    this.monVu.add(new Moneda100());
                }
            }
            else if(b!=null && cual==2){
                for (p=0; p<((m.getValor() - precioSprite)/100); p=p+1){
                    this.monVu.add(new Moneda100());
                }
            }
            else if(b != null && cual==3){
                for (p=0; p<((m.getValor() - precioSnicker)/100); p=p+1){
                    this.monVu.add(new Moneda100());
                }
            }
            else if(b != null && cual==4){
                for (p=0; p<((m.getValor() - precioSuper8)/100); p=p+1){
                    this.monVu.add(new Moneda100());
                }
            }
            else {
                monVu.add(m);
                throw new NoHayProductoException("ERROR, el deposito seleccionado se encuentra vacio o no existe");
            }
            return b;
        }
        else {
            this.monVu.add(m);
            throw new PagoInsuficienteException("ERROR, dinero insuficiente");
        }
    }

    /**
     * metodo con el cual se saca el vuelto del deposito de la maquina expendedora
     * @return vuelto sacado de el deposito de monedas
     */
    public Moneda getVuelto(){
        return monVu.get();
    }
    public void llenarDeposito(int num){
        if (num==1){
            for(int p=0;p!=numProductos;p=p+1){
                pcoca=pcoca+1;
                coca.add(new CocaCola(pcoca));
            }
        }
        else if (num==2){
            for(int p=0;p!=numProductos;p=p+1){
                psprite=psprite+1;
                sprite.add(new Sprite(psprite));
            }
        }
        else if (num==3){
            for(int p=0;p!=numProductos;p=p+1){
                psnickers=psnickers+1;
                snickers.add(new Snickers(psnickers));
            }
        }
        else if (num==4){
            for(int p=0;p!=numProductos;p=p+1){
                psuper8=psuper8+1;
                super8.add(new Super8(psuper8));
            }
        }

    }
}
