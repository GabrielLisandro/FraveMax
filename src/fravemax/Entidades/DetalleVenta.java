
package fravemax.Entidades;

/**
 *
 * @author kamar
 */
public class DetalleVenta {
    private int idDetalleVent;
    private int cantidad;
    private Venta venta;
    private Double precioVenta;
    private Producto producto;
    private Double precioTotal;

    public DetalleVenta(int idDetalleVent, int cantidad, Venta venta, Double precioVenta, Producto producto, Double precioTotal) {
        this.idDetalleVent = idDetalleVent;
        this.cantidad = cantidad;
        this.venta = venta;
        this.precioVenta = precioVenta;
        this.producto = producto;
        this.precioTotal = precioTotal;
    }

    public DetalleVenta(int cantidad, Venta venta, Double precioVenta, Producto producto, Double precioTotal) {
        this.cantidad = cantidad;
        this.venta = venta;
        this.precioVenta = precioVenta;
        this.producto = producto;
        this.precioTotal = precioTotal;
    }

    public DetalleVenta() {
    }

    public int getIdDetalleVent() {
        return idDetalleVent;
    }

    public void setIdDetalleVent(int idDetalleVent) {
        this.idDetalleVent = idDetalleVent;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Double precioTotal) {
        this.precioTotal = precioTotal;
    }

    @Override
    public String toString() {
        return "Detalle de Venta N°: " + venta.getCliente() + ", Producto: " + producto.getNombreProducto() +
                ", Cantidad: " + cantidad + ", Precio: " + precioVenta;
         
    }
    
    
}
