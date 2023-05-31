package Tarea_1;

public enum Seleccion {
    COCA(1, 500),
    SPRITE(2, 600),
    SNICKERS(3, 900),
    SUPER8(4, 300);

    private final int producto;
    private final int precio;


    Seleccion(int producto, int precio){
        this.producto = producto;
        this.precio = precio;
    }

    public int getPrecio(){
        return precio;
    }
    public int getProducto(){
        return producto;
    }
}
