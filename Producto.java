package pe.edu.upeu;

public class Producto {

    String codigo;
    String nombre;
    double precio;
    int stock;
    double cantidad;
    double igv;
// CONSTRUCTOR, si hay mas de un contructor se denomina sobre carga
    public Producto(String codigo,
                    String nombre, double precio,
                    int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public Producto(String codigo,
                    String nombre, double precio){
        this(codigo, nombre, precio, 0);

    }
     //METODOS
    public double getIgv(){
        if (  precio < 0)
            throw new IllegalArgumentException();
        return precio*0.18;

    }
}


