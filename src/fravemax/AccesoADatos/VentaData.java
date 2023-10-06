package fravemax.AccesoADatos;

import fravemax.Entidades.Venta;
import fravemax.Entidades.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

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

}
