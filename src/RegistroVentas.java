public class RegistroVentas {

    public void registrarVenta(String producto, int cantidad, double precio) {
        double total = cantidad * precio;
        System.out.println("Venta registrada:");
        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Total: $" + total);
    }
}
