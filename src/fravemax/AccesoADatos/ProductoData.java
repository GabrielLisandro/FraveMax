
package fravemax.AccesoADatos;

import fravemax.Entidades.Cliente;
import fravemax.Entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ProductoData {
    
     private Connection connection = null;

    public ProductoData() {

        connection = conexion.getConexion();
    
    
    }   

public void agregarProducto(Producto producto){
    
    String sql = "INSERT INTO `producto`( `nombre`, `descripcion`, `precio`, `stock`, `estado`)"
            + " VALUES (?,?,?,?,?)" ; 
    
         try {
             PreparedStatement ps = connection.prepareStatement(sql , Statement.RETURN_GENERATED_KEYS);
         
             ps.setString(1, producto.getNombreProducto());
             ps.setString(2, producto.getDescripcion());
             ps.setDouble(3, producto.getPrecioActual());
             ps.setInt(4, producto.getStock());
             ps.setBoolean(5, true);
             
             ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                producto.setIdProducto(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Producto Agregado");

            } else {
                JOptionPane.showMessageDialog(null, "No se pudo agregar el Producto");

            }

         ps.close();
         
         } 
         
         
         catch (SQLException ex) {
             
          JOptionPane.showMessageDialog(null, "Error de conexion a la base de datos");
         }
    
    
}
        

public void borrarProducto(int idProducto){
    
 String borrarProdsql = " UPDATE `producto` SET `estado`= 0 WHERE idProducto = ?";
    
         try {
             PreparedStatement borrarProdps = connection.prepareStatement(borrarProdsql);
         
             borrarProdps.setInt(1, idProducto);
             
             int filas = borrarProdps.executeUpdate();
             
             if (filas == 1) {
                 
                 JOptionPane.showMessageDialog(null, "El producto fue dado de baja");
                 
             }else{
                 
                 JOptionPane.showMessageDialog(null, "No se pudo dar de baja el producto");
                 
             }
             
         
         
         }
                  
         
         catch (SQLException ex) {
             
              JOptionPane.showMessageDialog(null, "Error de conexion a la base de datos");
         }
    
}


public void modificarProducto(Producto producto){
    
    String modProdSql = "UPDATE `producto` SET `nombre`= ?,`descripcion`=?,`precio`= ?,`stock` = ? WHERE idProducto = ? ";
    
    try {
        PreparedStatement modProdPs = connection.prepareStatement(modProdSql);
        
        modProdPs.setString(1, producto.getNombreProducto());
        modProdPs.setString(2, producto.getDescripcion());
        modProdPs.setDouble(3, producto.getPrecioActual());
        modProdPs.setInt(4, producto.getStock());
        modProdPs.setInt(5, producto.getIdProducto());
        
        
        int filas = modProdPs.executeUpdate();
         if (filas == 1) {
            
              JOptionPane.showMessageDialog(null, "El producto a sido actualizado");
             
             
        }else{
             
              JOptionPane.showMessageDialog(null, " NO se pudo actualizar el Producto");
         }
        
        
    } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, "Error de conexion a la base de datos");
        
    }
}

    public List<Producto> ListarProducto(){

        String listprosql = "select * from producto where estado = 1";

        List<Producto> prod = new ArrayList<Producto>();

        try {
            PreparedStatement ps = connection.prepareStatement(listprosql);
            ResultSet set = ps.executeQuery();

            while (set.next()) {
                Producto produ = new Producto();
                produ.setIdProducto(set.getInt("idProducto"));
                produ.setNombreProducto(set.getString("nombre"));
                produ.setDescripcion(set.getString("descripcion"));
                produ.setPrecioActual(set.getDouble("precio"));
                produ.setStock(set.getInt("stock"));
                produ.setEstado(set.getBoolean("estado"));
                
                
                prod.add(produ);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: No se pudo encontrar una lista.");
        }
        return prod;
    }
    
    
  public Producto buscarProducto(int id){
  String buscarProdSql = "SELECT nombre, descripcion, precio, stock, estado"
                + " FROM producto WHERE idProducto = ? ";

        Producto producto = new Producto();

        try {
            PreparedStatement buscarProdPs = connection.prepareStatement(buscarProdSql);
            buscarProdPs.setInt(1, id);
            ResultSet rs = buscarProdPs.executeQuery();

            if (rs.next()) {
                
                
                producto.setIdProducto(id);
                producto.setNombreProducto(rs.getString("nombre"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecioActual(rs.getDouble("precio"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(true);
                
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el Producto");
            }
            buscarProdPs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la busqueda del Producto ");
        }
         return producto;
       
         
    }
  

  
  }  

        









