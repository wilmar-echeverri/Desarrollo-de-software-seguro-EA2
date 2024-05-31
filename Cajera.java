//
//Se importan las clases Cliente y Producto de la carpeta "sinThread"
import sinThread.Cliente;
import sinThread.Producto;
//
// Se define clase Cajera que hereda de Runnable que permite que sea ejecutada por un hilo
public class Cajera implements Runnable {
    //
    // Se define atributo nombre de tipo String
    private String nombre;
    //
    // Se define atributo cliente de tipo Cliente
    private Cliente cliente;
    //
    // Se define metodo constructor
    public Cajera(String nombre, Cliente cliente) {
        this.nombre = nombre;
        this.cliente = cliente;
    }
    //
    // Se define metodo run que realizará el proceso de imprimir el proceso qué está realizando la cajera
    public void run() {
        System.out.println(this.nombre + ": empieza a procesar la compra del cliente " + cliente.getNombre());

        long tiempoInicial = System.currentTimeMillis();

        for (Producto producto : cliente.getProductos()) {
            this.esperarXsegundos(producto.getCantidad());
            System.out.println("==============================================");
            System.out.println(this.nombre + ": procesando el producto " + producto.getNombre() + " -> Precio: " + producto.getPrecio() + " -> Cantidad: " + producto.getCantidad() + " del cliente " + cliente.getNombre());
        }
        
        long tiempoFinal = System.currentTimeMillis();
        System.out.println("==============================================");
        System.out.println(this.nombre + ": ha terminado de procesar " + cliente.getNombre() + " en " + (tiempoFinal - tiempoInicial) / 1000 + " segundos");
    }
    //
    // Se define metodo que recibe cuantos segundo va a esperar antes de realizar la siguiente acción
    private void esperarXsegundos(double segundos) {
        try {
            Thread.sleep((long) (segundos * 1000));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
