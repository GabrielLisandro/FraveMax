/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fravemax;

import fravemax.AccesoADatos.ClienteData;
import fravemax.Entidades.Cliente;

/**
 *
 * @author kamar
 */
public class FraveMax {

   
    public static void main(String[] args) {
      
        Cliente cliente = new Cliente("Miño Juarez", "Maria Lucila", "Falucho 825" , "+540115784663", true, 19186457);
        ClienteData cd = new ClienteData();
        cd.agregarCliente(cliente);
        
        
        
        
        
    }
    
}
