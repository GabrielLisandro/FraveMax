
package fravemax.AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion {
    private static final String URL ="jdbc:mariadb://localhost/";
    private static final String DB ="fravemax";
    private static final String USUARIO ="root";
    private static final String PASSWORD ="";
    private static Connection connection;

    public conexion() {
    }

    public static Connection getConexion() {

        if (connection == null) {

            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL+DB,USUARIO,PASSWORD);
                JOptionPane.showMessageDialog(null, "Conexion exitosa");

            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar Driver");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error conexion: ");
            }
        }
        return connection;
    }
}
