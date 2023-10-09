
package fravemax.AccesoADatos;

import fravemax.Entidades.DetalleVenta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class DetalleVentaData {
    private Connection connection = null;

    private final ProductoData pd = new ProductoData();
    private final VentaData vd = new VentaData();
    
    public DetalleVentaData() {

        connection = conexion.getConexion();
    }
    
     public void agregarDetalleVenta(DetalleVenta dv){

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
    
    
}
