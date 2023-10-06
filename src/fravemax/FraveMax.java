/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fravemax;

import fravemax.AccesoADatos.ClienteData;
import fravemax.AccesoADatos.ProductoData;
import fravemax.AccesoADatos.VentaData;
import fravemax.Entidades.Cliente;
import fravemax.Entidades.Producto;
import fravemax.Entidades.Venta;
import java.time.LocalDate;
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
 //cd.eliminarCliente(16);
//       cd.habilitarCliente(16);
       //Cliente clie = new Cliente();
       
        /*for (Cliente  client : cd.ListarClientes()) {
           /* System.out.println( client.getApellido() +" " +
                   client.getNombre());
        
           JOptionPane.showMessageDialog(null, client.toString());
        }*/
        
        
       // Cliente enco;
      //  enco= cd.buscarClienteDni(11546457);
       // JOptionPane.showMessageDialog(null, enco.toString()+ " "+ enco.isEstado());
        
        
//       Producto producto = new Producto (19, " Lavarropa Drean Carga Superior 16kg" , "Lav. automatico CF Inventer. Cap.8K. 35 programas. 1400rpm. Sist. de lavado europeo. Tambor ac.inox. Controles manuales-pulsadores. 1/2 carga. Expulsion de centrif. Antiarrugas. Display Led. Lavado rapido. Control de temp. Eco wash / Eco soft. EE A+++." ,  320000.00, 6, true ); 
//       
//       ProductoData pd = new ProductoData ();
      // pd.agregarProducto(producto);
       
     //  pd.borrarProducto(19);
       
      //pd.modificarProducto(producto);
       
      
        //for (Producto pr: pd.ListarProducto()) {
            
           // JOptionPane.showMessageDialog(null, pr.toString());
            
            
       // }
       Cliente jopse = cd.buscarCliente(9);
       
       Venta vent = new Venta(jopse, LocalDate.of(2022,01,31), true);
       VentaData veDa = new VentaData();
       //veDa.ingresarVenta(vent);
       veDa.borrarVenti(10);
       veDa.modiVenta(9,10,LocalDate.of(2022, 01, 31));
      // veDa.lister();
    }
    
}
