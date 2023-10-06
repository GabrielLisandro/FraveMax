
package fravemax.AccesoADatos;

import fravemax.Entidades.Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;


public class VentaData {
    
    private Connection connection = null;

    private final ClienteData cd = new ClienteData();
    
    
    
    public VentaData() {

        connection = conexion.getConexion();

    }
  
     public void ingresarVenta(Venta vent){
            
            String ingresarVenta = "INSERT INTO `venta`(`idVenta`, `idCliente`, `fechaVenta`)"
                    + " VALUES (?,?,?) ";
            
            try {
             PreparedStatement ps = connection.prepareStatement(ingresarVenta, Statement.RETURN_GENERATED_KEYS);
                
              ps.setInt(1, vent.getIdVenta());
              ps.setInt(2, vent.getCliente().getIdCliente());
                
                
                
         } catch (Exception e) {
         }
            
            
        }
    
    
    
    
    
}
