package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSQL {

    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=AgroDB_Simple;encrypt=false";
    private static final String USER = "sa"; // tu usuario SQL Server
    private static final String PASS = "continental"; // tu contraseña del usuario SA

    public static Connection conectar() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("✔ Conexión exitosa a SQL Server");
        } catch (SQLException e) {
            System.out.println("❌ Error al conectar: " + e.getMessage());
        }

        return conn;
    }
}
