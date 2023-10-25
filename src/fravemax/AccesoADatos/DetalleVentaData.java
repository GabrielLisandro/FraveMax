package fravemax.AccesoADatos;

import fravemax.Entidades.DetalleVenta;
import fravemax.Entidades.Producto;
import fravemax.Entidades.Venta;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DetalleVentaData {

    private Connection connection = null;

    private final ProductoData pd = new ProductoData();
    private final VentaData vd = new VentaData();

    public DetalleVentaData() {

        connection = conexion.getConexion();
    }

    public void agregarDetalleVenta(DetalleVenta dv) {

        String ingresarVenta = "INSERT INTO `detalleventa`(`cantidad`, `idVenta`, `precio`, `idProducto`)"
                + " VALUES (?,?,?,?) ";

        try {
            PreparedStatement ps = connection.prepareStatement(ingresarVenta, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, dv.getCantidad());
            ps.setInt(2, dv.getVenta().getIdVenta());
            ps.setDouble(3, dv.getPrecioVenta());
            ps.setInt(4, dv.getProducto().getIdProducto());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

                dv.setIdDetalleVent(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "El Ingreso fue Exitoso");

            } else {
                JOptionPane.showMessageDialog(null, "No se pudo ingresar el Detalle de Venta");
            }

            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: Base de dato erronea");
        }
    }

    public void modificarDetalleVenta(int idDetalle, int cantidad, int idVenta, double precio, int idProducto) {

        String mdvSQL = "UPDATE detalleventa SET cantidad = ?, idVenta = ? , precio = ? ,"
                + " idProducto = ? WHERE idDetalle = ? ";

        try {
            PreparedStatement ps = connection.prepareStatement(mdvSQL);

            ps.setInt(1, cantidad);
            ps.setInt(2, idVenta);
            ps.setDouble(3, precio);
            ps.setInt(4, idProducto);
            ps.setInt(5, idDetalle);

            int filas = ps.executeUpdate();

            if (filas == 1) {

                JOptionPane.showMessageDialog(null, "Se modifico el detalle de venta");

            } else {
                JOptionPane.showMessageDialog(null, "No se pudo modificar el detalle de venta");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion con la base de datos");
        }
    }

    public void borrarDetalleVenta(int id) {

        String bdvSql = "DELETE FROM detalleVenta WHERE idDetalle = ?";

        try {
            PreparedStatement PSbdv = connection.prepareStatement(bdvSql);

            PSbdv.setInt(1, id);

            int registro = PSbdv.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se eliminó Correctamente");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error de conexion con la base de datos");
        }
}

//Listar todos los productos de una venta en una fecha específica.
    public List<Producto> listarProductosDeVentaEnFecha(LocalDate fecha) {
        String sql = "SELECT p.* FROM detalleventa dv "
                + "INNER JOIN venta v ON dv.idVenta = v.idVenta "
                + "INNER JOIN producto p ON dv.idProducto = p.idProducto "
                + "WHERE v.fechaVenta = ?";

        List<Producto> productos = new ArrayList<>();

        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setDate(1, Date.valueOf(fecha));
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Producto producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombreProducto(rs.getString("nombre"));

                productos.add(producto);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se encontro ninguna venta en esa fecha");
        }

        return productos;
    }

    public List<DetalleVenta> productoXCliente(int idProducto) {

        String SqlPr = "SELECT cantidad, idDetalle, precio, detalleventa.idProducto, detalleventa.idVenta, venta.idCliente "
                + "FROM detalleventa JOIN venta ON detalleventa.idVenta = venta.idCliente "
                + "WHERE detalleventa.idProducto = ?";

        List<DetalleVenta> prodCli = new ArrayList<>();
        DetalleVenta dv = null;

        try {

            PreparedStatement ps = connection.prepareStatement(SqlPr);
            ps.setInt(1, idProducto);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                dv = new DetalleVenta();

                dv.setIdDetalleVent(rs.getInt("idDetalle"));
                dv.setCantidad(rs.getInt("cantidad"));
                Venta ve = vd.buscarVenta(rs.getInt("idVenta"));
                dv.setVenta(ve);
                dv.setPrecioVenta(rs.getDouble("precio"));
                Producto pp = pd.buscarProducto(rs.getInt("idProducto"));
                dv.setProducto(pp);

                prodCli.add(dv);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse con la Base de Datos" + ex.getMessage());
        }
         return prodCli;
    }

    
    
}
