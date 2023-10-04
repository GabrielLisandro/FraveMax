/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fravemax;

import fravemax.AccesoADatos.ClienteData;
import fravemax.Entidades.Cliente;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author kamar
 */
public class FraveMax {

   
    public static void main(String[] args) {
      
//        Cliente cliente = new Cliente(16,"Miño Juarez", "Maria Lucila Jacinta", "Falucho 1825" , "+540115784663", true, 11546457);
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
        
        
        Cliente enco;
        enco= cd.buscarClienteDni(11546457);
        JOptionPane.showMessageDialog(null, enco.toString()+ " "+ enco.isEstado());
        
        
        
    }
    
}
