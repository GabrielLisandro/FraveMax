package fravemax;

import fravemax.AccesoADatos.ClienteData;
import fravemax.AccesoADatos.DetalleVentaData;
import fravemax.AccesoADatos.ProductoData;
import fravemax.AccesoADatos.VentaData;
import fravemax.Entidades.Cliente;
import fravemax.Entidades.DetalleVenta;
import fravemax.Entidades.Producto;
import fravemax.Entidades.Venta;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author kamar
 */
public class FraveMax {

    public static void main(String[] args) {

//Cliente cliente = new Cliente(19,"Miño Juarez", "Maria Lucila Jacinta", "Falucho 1825" , "+540115784663", true, 11546457);
ClienteData cd = new ClienteData();

        // cd.agregarCliente(cliente);
        
        // cd.modificarCliente(cliente);
        
        // cd.eliminarCliente(16);
        
        // cd.habilitarCliente(16);
        
 //Cliente clie = new Cliente();
        /*for (Cliente  client : cd.ListarClientes()) {
           /* System.out.println( client.getApellido() +" " +
                   client.getNombre());
        JOptionPane.showMessageDialog(null, client.toString());
        }*/
 // Cliente enco;
        // enco= cd.buscarClienteDni(11546457);
        // JOptionPane.showMessageDialog(null, enco.toString()+ " "+ enco.isEstado());
      
//Producto producto = new Producto(1, " SMART LED ANDROID TV PHILIPS 32 PULGADAS HD 32PHD6917/77", "Televisor Smart / Android. Pantalla: TV LED HD. Resolucion de panel: 1366 x 768 p.", 117000.00, 6, true);
ProductoData pd = new ProductoData();

        // pd.agregarProducto(producto);
        
        // pd.borrarProducto(19);
        
        // pd.modificarProducto(producto);
        
        //for (Producto pr: pd.ListarProducto()) {
            //JOptionPane.showMessageDialog(null, pr.toString());
//        }


//Cliente jopse = cd.buscarCliente(9);

//Venta vent = new Venta(jopse, LocalDate.of(2023, 10, 02), true);
VentaData veDa = new VentaData();

        //veDa.ingresarVenta(vent);
        
        //veDa.borrarVenti(1);
        
        //veDa.modiVenta(1, 1, LocalDate.of(2023, 10, 2));

        /*for(Venta ve : veDa.lister()){
             JOptionPane.showMessageDialog(null, ve.toString());
        }*/

        //veDa.buscarVenta(1);
            //JOptionPane.showMessageDialog(null, veDa.buscarVenta(3));
            
//        for(Venta veLi : veDa.listarPorFecha(LocalDate.of(2023, 10, 02))){
//        JOptionPane.showMessageDialog(null, veLi.toString());
//        }
        
//        for(Venta veCl : veDa.ventasCliente(1)){
//        JOptionPane.showMessageDialog(null, veCl.toString());
//        }

//Producto prdu;
//prdu = pd.buscarProducto(1);
//        
//        pd.buscarProducto(1);
//            JOptionPane.showMessageDialog(null, pd.buscarProducto(1));
      
//Venta ve = veDa.buscarVenta(8);
//Producto producto = pd.buscarProducto(1);
DetalleVenta dv = new DetalleVenta();
DetalleVentaData dvd = new DetalleVentaData();
        
        //dvd.agregarDetalleVenta(dv);
        
       // dvd.modificarDetalleVenta(1,3, 2, 19000.00, 4);
        
//        dvd.borrarDetalleVenta(7);
        
    
//DetalleVentaData detalleVentaData = new DetalleVentaData();
//LocalDate fechaEspecifica = LocalDate.of(2023, 10, 10); // Cambia esta fecha por la que necesites
//List<Producto> productos = detalleVentaData.listarProductosDeVentaEnFecha(fechaEspecifica);
//
       //for (Producto producto : productos) {
    //    JOptionPane.showMessageDialog(null , "Producto: " + producto.getNombreProducto()+ "Cantidad: " + dv.getCantidad()  );
//   
//}
Venta ve = new Venta();
    for (DetalleVenta listClie : dvd.productoXCliente(5)){
        JOptionPane.showMessageDialog(null, listClie.toString());
    
    }
      
        
    }
    
    
    
    
    
}
