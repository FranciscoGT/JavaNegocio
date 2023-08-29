import java.util.Date;

public class Solicitud {
    private int numeroID, total;
    private Date fecha;
    private String productos;
    private Cliente cliente;

    public Solicitud() {

    }

    public Solicitud(int numeroID, Date fecha, Cliente cliente) {
        this.numeroID = numeroID;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public int getNumeroID() {
        return numeroID;
    }

    public void setNumeroID(int numeroID) {
        this.numeroID = numeroID;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getProducto() {
        return productos;
    }

    public void setProducto(String producto) {
        this.productos = producto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // Methods

    // Agregar - Detalle - Descuento - ObtenerNum
    public void agregarProducto(Producto nuevo) {
        // Sumar Total
        total += nuevo.getPrecio();

        // Agregar producto a la lista de productos
        productos += nuevo.getDescripcion() + " $" + nuevo.getPrecio() + " " + nuevo.getCantidad() + " "
                + nuevo.getMedida() + " ;";

    }

    // Ver Detalles
    public String verDetalle() {
        // ID - Fecha - Total - Rut Cliente - Nombre - Productos
        String detalle = "";

        detalle += "Detalle del pedido \n";
        detalle += "ID del pedido: " + this.numeroID + "\n";
        detalle += "Fecha del pedido: " + this.fecha.toString() + "\n";
        detalle += "Total del pedido: $" + this.total + "\n";
        detalle += "Rut del cliente: " + this.cliente.getRut() + "-" + this.cliente.getDv() + "\n";
        detalle += "Nombre del cliente: " + this.cliente.getNombre() + "\n";
        detalle += "Lista de productos: " + this.productos;

        return detalle;
    }

    // Descuento
    public void aplicarDescuento(double descuento) {
        double porc = descuento / 100;
        total -= (total * porc);
    }

    // Obtener Id del pedido
    public int obtenerID() {
        return this.numeroID;
    }

}
