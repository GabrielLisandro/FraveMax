package fravemax.AccesoADatos;

import fravemax.Entidades.Cliente;
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

public class ClienteData {

    private Connection connection = null;

    public ClienteData() {

        connection = conexion.getConexion();

    }

    public void agregarCliente(Cliente cliente) {

        String agreClienteSql = "INSERT INTO cliente(apellido, nombre, domicilio, telefono, estado, DNI)"
                + " VALUES (?,?,?,?,?,?)";

        try {
            PreparedStatement agreClientePs = connection.prepareStatement(agreClienteSql, Statement.RETURN_GENERATED_KEYS);

            agreClientePs.setString(1, cliente.getApellido());
            agreClientePs.setString(2, cliente.getNombre());
            agreClientePs.setString(3, cliente.getDomicilio());
            agreClientePs.setString(4, cliente.getTelefono());
            agreClientePs.setBoolean(5, true);
            agreClientePs.setInt(6, cliente.getDni());
            agreClientePs.executeUpdate();
            ResultSet rs = agreClientePs.getGeneratedKeys();

            if (rs.next()) {
                cliente.setIdCliente(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Cliente Agregado");

            } else {
                JOptionPane.showMessageDialog(null, "No se pudo agregar el cliente");

            }

            agreClientePs.close();

        } catch (SQLException ExcepcionSql) {

            JOptionPane.showMessageDialog(null, "Error de conexion a la base de datos");
        }
    }

    public void modificarCliente(Cliente cliente) {

        String modifCliente = "UPDATE cliente SET apellido=? , nombre=?, domicilio=?, telefono=? WHERE idCliente=?";

        try {

            PreparedStatement modifClientePs = connection.prepareStatement(modifCliente);

            modifClientePs.setString(1, cliente.getApellido());
            modifClientePs.setString(2, cliente.getNombre());
            modifClientePs.setString(3, cliente.getDomicilio());
            modifClientePs.setString(4, cliente.getTelefono());

            modifClientePs.setInt(5, cliente.getIdCliente());

            int exito = modifClientePs.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "La actualizacion fue realizada");

            } else {
                JOptionPane.showMessageDialog(null, "No se pudo realizar la Actualizacion");
            }

        } catch (SQLException ExceptionSql) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos");
        }

    }

    public void eliminarCliente(int idCliente) {

        String eliminarSql = "UPDATE cliente SET estado=0 WHERE idCliente =?";

        try {
            PreparedStatement eliminarPs = connection.prepareStatement(eliminarSql);

            eliminarPs.setInt(1, idCliente);

            int filas = eliminarPs.executeUpdate();

            if (filas == 1) {
                JOptionPane.showMessageDialog(null, "Cliente eliminado");

            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar al Cliente");
            }

        } catch (SQLException ExcepcionSql) {

            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos");

        }

    }

    public void habilitarCliente(int idCliente) {

        String habilitarSql = "UPDATE cliente SET estado=1 WHERE idCliente =?";

        try {
            PreparedStatement habilitarPs = connection.prepareStatement(habilitarSql);

            habilitarPs.setInt(1, idCliente);

            int filas = habilitarPs.executeUpdate();

            if (filas == 1) {
                JOptionPane.showMessageDialog(null, "Cliente habilitado");

            } else {
                JOptionPane.showMessageDialog(null, "No se pudo habilitar al Cliente");
            }

        } catch (SQLException ExcepcionSql) {

            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos");

        }

    }

    public Cliente buscarClienteDni(int dni) {

        String buscarClienteSql = "SELECT idCliente , apellido, nombre, domicilio, telefono, estado, DNI"
                + " FROM cliente WHERE DNI = ? ";

        Cliente cliente = null;

        try {
            PreparedStatement buscarClientePs = connection.prepareStatement(buscarClienteSql);
            buscarClientePs.setInt(1, dni);
            ResultSet rs = buscarClientePs.executeQuery();

            if (rs.next()) {
                cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setDomicilio(rs.getString("domicilio"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setEstado(true);
                cliente.setDni(rs.getInt("DNI"));
                
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el dni del Ciente buscado");
            }
            buscarClientePs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la busqueda del Cliente ");
        }
        return cliente;
    }
    public Cliente buscarCliente(int id) {

        String buscarClienteSql = "SELECT idCliente , apellido, nombre, domicilio, telefono, estado, DNI"
                + " FROM cliente WHERE idCliente = ? ";

        Cliente cliente = null;

        try {
            PreparedStatement buscarClientePs = connection.prepareStatement(buscarClienteSql);
            buscarClientePs.setInt(1, id);
            ResultSet rs = buscarClientePs.executeQuery();

            if (rs.next()) {
                cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setDomicilio(rs.getString("domicilio"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setEstado(true);
                cliente.setDni(rs.getInt("DNI"));
                
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el id del Ciente buscado");
            }
            buscarClientePs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la busqueda del Cliente ");
        }
        return cliente;
    }

    public List<Cliente> ListarClientes() {

        String jur = "select * from cliente where estado = 1";

        List<Cliente> cli = new ArrayList<Cliente>();

        try {
            PreparedStatement ps = connection.prepareStatement(jur);
            ResultSet set = ps.executeQuery();

            while (set.next()) {
                Cliente clie = new Cliente();
                clie.setIdCliente(set.getInt("idCliente"));
                clie.setApellido(set.getString("apellido"));
                clie.setNombre(set.getString("nombre"));
                clie.setDomicilio(set.getString("domicilio"));
                clie.setTelefono(set.getString("telefono"));
                clie.setEstado(set.getBoolean("estado"));
                clie.setDni(set.getInt("DNI"));

                cli.add(clie);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: No se pudo encontrar una lista.");
        }
        return cli;
    }

}
