//
// Se define el paquete al que hace parte
package sinThread;
//
// Se importa libreria para el uso de listas
import java.util.List;

public class Cliente {
    //
    // Se define atributo nombre de tipo String
    private String nombre;
    //
    // Se define atributo productos de tipo list<Producto>
    private List<Producto> productos;

    //
    // Se define metodo constructor
    public Cliente(String nombre, List<Producto> productos) {
        this.nombre = nombre;
        this.productos = productos;
    }
    //
    // Se define metod get del nombre
    public String getNombre() {
        return nombre;
    }
    //
    // Se define metod set del nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //
    // Se define metod get de la lista de Productos
    public List<Producto> getProductos() {
        return productos;
    }
    //
    // Se define metod get de la lista de productos
    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}