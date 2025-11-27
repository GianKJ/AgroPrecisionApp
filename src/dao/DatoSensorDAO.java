package dao;

import conexion.ConexionSQL;
import modelo.DatoSensor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatoSensorDAO {

    // Insertar una lectura
    public boolean insertar(DatoSensor d) {
        String sql = "INSERT INTO DatoSensor(id_sensor,fecha,valor,unidad) VALUES (?,?,?,?)";

        try (Connection cn = ConexionSQL.conectar();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setInt(1, d.getIdSensor());
            ps.setTimestamp(2, d.getFecha());
            ps.setDouble(3, d.getValor());
            ps.setString(4, d.getUnidad());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error insertando DatoSensor: " + e.getMessage());
            return false;
        }
    }

    // Listar últimas N lecturas de un sensor
    public List<DatoSensor> listarPorSensor(int idSensor, int limite) {
        List<DatoSensor> lista = new ArrayList<>();
        String sql = "SELECT TOP (?) * FROM DatoSensor WHERE id_sensor = ? ORDER BY fecha DESC";

        try (Connection cn = ConexionSQL.conectar();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setInt(1, limite);
            ps.setInt(2, idSensor);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    DatoSensor d = new DatoSensor();
                    d.setIdDato(rs.getInt("id_dato"));
                    d.setIdSensor(rs.getInt("id_sensor"));
                    d.setFecha(rs.getTimestamp("fecha"));
                    d.setValor(rs.getDouble("valor"));
                    d.setUnidad(rs.getString("unidad"));
                    lista.add(d);
                }
            }

        } catch (SQLException e) {
            System.out.println("Error listando datos de sensor: " + e.getMessage());
        }

        return lista;
    }
}
