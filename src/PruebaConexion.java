import conexion.ConexionSQL;
import java.sql.Connection;

public class PruebaConexion {
    public static void main(String[] args) {
        Connection cn = ConexionSQL.conectar();
        if (cn != null) {
            System.out.println("Conectado correctamente.");
        }
    }
}
