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
        Producto producto = new Producto(1, " SMART LED ANDROID TV PHILIPS 32 PULGADAS HD 32PHD6917/77", "Televisor Smart / Android. Pantalla: TV LED HD. Resolucion de panel: 1366 x 768 p.", 117000.00, 6, true);
        ProductoData pd = new ProductoData();

        // pd.agregarProducto(producto);
        // pd.borrarProducto(19);
        // pd.modificarProducto(producto);
//       for (Producto pr: pd.ListarProducto()) {
//           JOptionPane.showMessageDialog(null, pr.toString());
//        }
    Cliente jopse = cd.buscarCliente(9);
        Venta vent = new Venta(jopse, LocalDate.of(2023, 10, 02), true);
        VentaData veDa = new VentaData();

//       veDa.ingresarVenta(vent);
//       veDa.borrarVenti(1);
//       veDa.modiVenta(1, 1, LocalDate.of(2023, 10, 2));

        /* for(Venta ve : veDa.lister()){
        JOptionPane.showMessageDialog(null, ve.toString());
        }

//    }
    }*/
//       veDa.buscarVenta(8);
//Producto prdu;
//        prdu = pd.buscarProducto(1);
//        pd.buscarProducto(1);
//        JOptionPane.showMessageDialog(null, pd.toString());
//        Venta ve = veDa.buscarVenta(8);
//        DetalleVenta dv = new DetalleVenta();
//        DetalleVentaData dvd = new DetalleVentaData();
//        
//        dvd.agregarDetalleVenta(dv);
        
    }
}
