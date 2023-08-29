public class Producto {
    // Codigo Subcategoria Descripcion Precio Medida Cantidad
    private int codigo, cantidad, precio;
    private String subCategoria, descripcion, medida;

    public Producto(int codigo, int cantidad, int precio, String subCategoria, String descripcion, String medida) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.subCategoria = subCategoria;
        this.descripcion = descripcion;
        this.medida = medida;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(String subCategoria) {
        this.subCategoria = subCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }
}
