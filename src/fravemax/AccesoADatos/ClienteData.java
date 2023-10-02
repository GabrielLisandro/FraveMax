
package fravemax.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import fravemax.Entidades.Cliente;

/**
 *
 * @author kamar
 */
public class ClienteData {
    private Connection con = null;

    public ClienteData() {

        con = conexion.getConexion();
    }

    public void guardarCliente(Cliente cliente) {

        String guarAluSql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado) "
                + " VALUES (?,?,?,?,?)";

        try {
            PreparedStatement guarAlumPs = con.prepareStatement(guarAluSql, Statement.RETURN_GENERATED_KEYS);

            guarAlumPs.setInt(1, alumno.getDni());
            guarAlumPs.setString(2, alumno.getApellido());
            guarAlumPs.setString(3, alumno.getNombre());
            guarAlumPs.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            guarAlumPs.setBoolean(5, alumno.isEstado());

            guarAlumPs.executeUpdate();
            ResultSet rs = guarAlumPs.getGeneratedKeys();
            
            if (rs.next()) {
                alumno.setIdAlumno(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Alumno agendado");
            }else{
            JOptionPane.showMessageDialog(null,"El alumno no se inscribio");
            }
            guarAlumPs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse: " + ex.getMessage());
        }
    }
}
