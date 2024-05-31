//
// Se define el paquete al que hace parte
package sinThread;
//
// Se importa libreria para el uso de listas
public class Producto {
    //
    // Se define atributo nombre de tipo String
    private String nombre;
    //
    // Se define atributo precio de tipo int
    private int precio;
    //
    // Se define atributo cantidad de tipo int
    private int cantidad;
    //
    // Se define metodo constructor
    public Producto(String nombre, int precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    //
    // Se define metodo get para el nombre
    public String getNombre() {
        return nombre;
    }
    //
    // Se define metodo set del nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //
    // Se define metodo get del precio
    public int getPrecio() {
        return precio;
    }
    //
    // Se define metodo set del precio
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    //
    // Se define metodo get de cantidad
    public int getCantidad() {
        return cantidad;
    }
    //
    // Se define metodo set cantidad
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
