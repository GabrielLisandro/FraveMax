package fravemax.AccesoADatos;

import fravemax.Entidades.Venta;
import fravemax.Entidades.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.ir.LiteralNode;

public class VentaData {

    private Connection connection = null;

    private final ClienteData cd = new ClienteData();

    public VentaData() {

        connection = conexion.getConexion();

    }

    public void ingresarVenta(Venta vent) {

        String ingresarVenta = "INSERT INTO `venta`(`idCliente`, `fechaVenta`)"
                + " VALUES (?,?) ";

        try {
            PreparedStatement ps = connection.prepareStatement(ingresarVenta, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, vent.getCliente().getIdCliente());
            ps.setDate(2, Date.valueOf(vent.getFechaVenta()));

            ps.executeUpdate();

            ResultSet gr = ps.getGeneratedKeys();

            if (gr.next()) {

                vent.setIdVenta(gr.getInt(1));
                JOptionPane.showMessageDialog(null, "Venta ingresada");

            } else {
                JOptionPane.showMessageDialog(null, "No se pudo ingresar la Venta");
            }

            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: Base de dato erronea");
        }

    }

    public void borrarVenti(int idVenta) {
        String ims = "Update venta set estado=0 Where idVenta=? ";

        try {
            PreparedStatement ps = connection.prepareStatement(ims);
            ps.setInt(1, idVenta);
            int filar = ps.executeUpdate();

            if (filar == 1) {
                JOptionPane.showMessageDialog(null, "Venta borrada");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo borrar la venta deseada");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: No se pudo conectar con la base de datos!!");
        }

    }

    public void modiVenta(int idVenta, int idCliente, LocalDate fechaVenta) {
        String ui = "Update venta set idCliente=?, fechaVenta=?"
                + "Where idVenta=?";

        try {
            PreparedStatement ps = connection.prepareStatement(ui);
            ps.setInt(1,idCliente);
            ps.setDate(2, Date.valueOf(fechaVenta));
            ps.setInt(3, idVenta);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Venta modificada correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Venta No modificada correctamente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: No se pudo conectar la base de datos");
        }

    }

    public List<Venta> lister() {
        String quer = "select * from venta where estado=1";
        List<Venta> vge = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(quer);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Venta vent = new Venta();
                vent.setIdVenta(rs.getInt("idVenta"));
                Cliente cliente = cd.buscarCliente(rs.getInt("idcliente"));
                vent.setCliente(cliente);
                vent.setFechaVenta(rs.getDate("fechaVenta").toLocalDate());
                vent.setEstado(rs.getBoolean("estado"));

                vge.add(vent);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: No se pudo conectar con la base de datos ");
        }

        return lister();
    }

}
