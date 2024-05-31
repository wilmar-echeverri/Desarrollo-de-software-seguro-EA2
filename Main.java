//
//Se importa la libreria para el manejo de arrays
import java.util.Arrays;
//
//Se importan las clases Cliente y Producto de la carpeta "sinThread"
import sinThread.Cliente;
import sinThread.Producto;

public class Main {
    public static void main(String[] args) {
        //
        //Se crean los productos
        Producto p1 = new Producto("Manzana", 1000,7);
        Producto p2 = new Producto("Pan", 5000, 10);
        Producto p3 = new Producto("Leche", 4000, 2);
        Producto p4 = new Producto("Carne", 22000, 5);
        Producto p5 = new Producto("Huevos", 11000, 12);
        //
        //Se crean los clientes
        Cliente cliente1 = new Cliente("Juan", Arrays.asList(p1, p4, p3));
        Cliente cliente2 = new Cliente("Maria", Arrays.asList(p2, p3));
        Cliente cliente3 = new Cliente("Carlos", Arrays.asList(p1, p2, p5));
        //
        //Se crean las cajeras
        Cajera cajera1 = new Cajera("Cajera Juanita", cliente1);
        Cajera cajera2 = new Cajera("Cajera Paola", cliente2);
        Cajera cajera3 = new Cajera("Cajera Laura", cliente3);
        //
        //se crean los hilos con objeto Cajera como atributo
        Thread hiloCajera1 = new Thread(cajera1);
        Thread hiloCajera2 = new Thread(cajera2);
        Thread hiloCajera3 = new Thread(cajera3);
        //
        // Se inicializan los hilos
        hiloCajera1.start();
        hiloCajera2.start();
        hiloCajera3.start();
    }
}
