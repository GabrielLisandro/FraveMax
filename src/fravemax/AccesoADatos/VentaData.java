package fravemax.AccesoADatos;

import fravemax.Entidades.Venta;
import fravemax.Entidades.Cliente;
import fravemax.Entidades.DetalleVenta;
import fravemax.Entidades.Producto;
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

    public void guardarVenta(int idVenta, int idCliente, LocalDate fechaVenta) {

        String ingresarVenta = "INSERT INTO venta"
                + " VALUES (?,?,?) ";

        try {
            PreparedStatement ps = connection.prepareStatement(ingresarVenta);

            ps.setInt(1, idVenta);
            ps.setInt(2, idCliente);
            ps.setDate(3, Date.valueOf(fechaVenta));

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
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
            ps.setInt(1, idCliente);
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
                Cliente cliente = cd.buscarCliente(rs.getInt("idCliente"));
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

    public Venta buscarVenta(int id) {

        String buscarVentSql = "SELECT idVenta , idCliente, fechaVenta"
                + " FROM venta WHERE idVenta = ? ";

        Venta venta = null;

        try {
            PreparedStatement buscarVentPs = connection.prepareStatement(buscarVentSql);
            buscarVentPs.setInt(1, id);
            ResultSet rs = buscarVentPs.executeQuery();

            if (rs.next()) {
                venta = new Venta();

                venta.setIdVenta(rs.getInt("idVenta"));

                Cliente cliente = cd.buscarCliente(rs.getInt("idCliente"));
                venta.setCliente(cliente);

                venta.setFechaVenta(rs.getDate("fechaVenta").toLocalDate());

            } else {
                JOptionPane.showMessageDialog(null, "No se encontro la Venta");
            }
            buscarVentPs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la busqueda de la Venta ");
        }
        return venta;
    }

    public List<Venta> listarPorFecha(LocalDate fechaVenta) {

        String Sql = "SELECT * FROM venta WHERE fechaVenta = ?";

        List<Venta> listaFecha = new ArrayList<>();
        Venta venta = null;

        try {
            PreparedStatement psList = connection.prepareStatement(Sql);

            psList.setDate(1, Date.valueOf(fechaVenta));
            ResultSet rs = psList.executeQuery();

            while (rs.next()) {

                venta = new Venta();
                Cliente cl = cd.buscarCliente(rs.getInt("idCliente"));
                venta.setCliente(cl);

                venta.setIdVenta(rs.getInt("idVenta"));
                venta.setFechaVenta(rs.getDate("fechaVenta").toLocalDate());
                venta.setEstado(true);

                listaFecha.add(venta);
            }

            psList.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la Base de Datos");
        }
        return listaFecha;
    }

    public List<DetalleVenta> listarXFecha(LocalDate fVenta) {

        String Sql = "SELECT * FROM venta JOIN "
                + "    detalleventa ON venta.idVenta = detalleventa.idVenta JOIN"
                + "    producto ON detalleventa.idProducto = producto.idProducto JOIN"
                + "    cliente ON venta.idCliente = cliente.idCliente WHERE"
                + "    venta.fechaVenta = ?";

        List<DetalleVenta> listaFecha = new ArrayList<>();

        try {
            PreparedStatement psList = connection.prepareStatement(Sql);

            psList.setObject(1,fVenta);
            ResultSet rs = psList.executeQuery();

            while (rs.next()) {
               DetalleVenta dv = new DetalleVenta();
               Producto pr = new ProductoData().buscarProducto(rs.getInt("idProducto"));
               Venta vent = buscarVenta(rs.getInt("idVenta"));
               
               dv.setCantidad(rs.getInt("cantidad"));
               dv.setIdDetalleVent(rs.getInt("idDetalle"));
               dv.setPrecioTotal(rs.getDouble("precioTotal"));
               dv.setPrecioVenta(rs.getDouble("precio"));
               dv.setProducto(pr);
               dv.setVenta(vent);
               
               listaFecha.add(dv);
            }

            psList.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al conectar con la Base de Datos");
        }
        return listaFecha;
    }

    public List<Venta> ventasCliente(int id) {

        String sqlVC = "SELECT * FROM venta WHERE idCliente = ? ";

        List<Venta> listaClient = new ArrayList<>();
        Venta venta = null;
        try {
            PreparedStatement ps = connection.prepareStatement(sqlVC);

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                venta = new Venta();
                Cliente cl = cd.buscarCliente(rs.getInt("idCliente"));
                venta.setCliente(cl);
                venta.setIdVenta(rs.getInt("idVenta"));
                venta.setFechaVenta(rs.getDate("fechaVenta").toLocalDate());
                venta.setEstado(true);

                listaClient.add(venta);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la conexion de la Base de Datos");
        }
        return listaClient;
    }

    public int proximaVenta() {
        String sql = "SELECT MAX(idventa) + 1 AS proximo_id FROM venta";

        int proximoIdVenta = 1;
        PreparedStatement sp;

        try {
            sp = connection.prepareStatement(sql);
            ResultSet st = sp.executeQuery();

            if (st.next()) {
                proximoIdVenta = st.getInt("proximo_id");
            }
            //JOptionPane.showMessageDialog(null, proximoIdVenta);
            sp.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la conexion de la Base de Datos");
        }
        return proximoIdVenta;
    }

}
