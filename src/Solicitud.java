import java.util.Date;

public class Solicitud {
    private int num, total;
    private Date fecha;
    private String producto;
    private Cliente cliente;

    public Solicitud(int num, int total, Date fecha, Cliente cliente, String producto) {
        this.num = num;
        this.total = total;
        this.fecha = fecha;
        this.cliente = cliente;
        this.producto = producto;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    // Methods

    // Agregar - Detalle - Descuento - ObtenerNum
    public void agregarProducto(Producto nuevo) {
        // Sumar Total
        total += nuevo.getPrecio();

        // Agregar producto a la lista de productos
        producto += nuevo.getDescripcion() + " $" + nuevo.getPrecio() + " " + nuevo.getCantidad() + " " + nuevo.getMedida() + " ;";

    }

    // Ver Detalles
    public String verDetalle() {
        // ID - Fecha - Total - Rut Cliente - Nombre - Productos
        String detalle = "";

        detalle += "Detalle del pedido \n";
        detalle += "ID del pedido: " + this.num + "\n";
        detalle += "Fecha del pedido: " + this.fecha.toString() + "\n";
        detalle += "Total del pedido: $" + this.total + "\n";
        detalle += "Rut del cliente: " + this.cliente.getRut() + "-" + this.cliente.getDv() + "\n";
        detalle += "Nombre del cliente: " + this.cliente.getNombre() + "\n";
        detalle += "Lista de productos: " + this.producto;

        return detalle;
    }

    // Descuento
    public void aplicarDescuento(double descuento) {
        double porc = descuento/100;
        total -= (total*porc);
    }

}
