import java.util.ArrayList;

public class Inventario {

    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    // Agregar un producto nuevo
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    // Buscar producto por nombre
    public Producto buscarProducto(String nombre) {
        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }

    // Actualizar stock de producto
    public boolean actualizarStock(String nombre, int cantidad) {
        Producto p = buscarProducto(nombre);
        if (p != null) {
            p.agregarStock(cantidad);
            return true;
        }
        return false;
    }

    // Eliminar producto del inventario
    public boolean eliminarProducto(String nombre) {
        Producto p = buscarProducto(nombre);
        if (p != null) {
            productos.remove(p);
            return true;
        }
        return false;
    }

    // Mostrar todos los productos
    public ArrayList<Producto> obtenerProductos() {
        return productos;
    }
}
