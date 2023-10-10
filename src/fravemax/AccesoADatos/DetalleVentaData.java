
package fravemax.AccesoADatos;

import fravemax.Entidades.DetalleVenta;
import fravemax.Entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
    
    
     public void modificarDetalleVenta(int idDetalle, int cantidad, int idVenta, double precio, int idProducto) {
    
         String mdvSQL = "UPDATE detalleventa SET cantidad = ?, idVenta = ? , precio = ? ,"
                 + " idProducto = ? WHERE idDetalle = ? ";
         
        try {
            PreparedStatement ps = connection.prepareStatement(mdvSQL);
        
            ps.setInt(1,cantidad);
            ps.setInt(2, idVenta);
            ps.setDouble(3, precio);
            ps.setInt(4, idProducto);
            ps.setInt(5, idDetalle);
            
            int filas = ps.executeUpdate() ;
            
            if (filas == 1) {
                
                JOptionPane.showMessageDialog(null, "Se modifico el detalle de venta");
               
            }else {
                JOptionPane.showMessageDialog(null, "No se pudo modificar el detalle de venta");
            }
             
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error de conexion con la base de datos");
        }
    }
     
     
       public void borrarDetalleVenta (int id){
       
        try {
            String bdvSql = "DELETE FROM detalleVenta WHERE idDetalle";
            
            PreparedStatement PSbdv = connection.prepareStatement(bdvSql);
            
            int registro = PSbdv.executeUpdate();
            JOptionPane.showMessageDialog( null, "Se eliminó Correctamente");
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error de conexion con la base de datos");
        }
       
       
       
       
       
       }
}
     

