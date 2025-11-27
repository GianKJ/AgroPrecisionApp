package dao;

import conexion.ConexionSQL;
import modelo.Sensor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SensorDAO {

    public boolean insertar(Sensor s) {
        String sql = "INSERT INTO Sensor(id_cultivo,tipo_sensor,modelo,fecha_instalacion,estado) "
                   + "VALUES (?,?,?,?,?)";

        try (Connection cn = ConexionSQL.conectar();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setInt(1, s.getIdCultivo());
            ps.setString(2, s.getTipoSensor());
            ps.setString(3, s.getModelo());
            ps.setDate(4, s.getFechaInstalacion());
            ps.setString(5, s.getEstado());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error insertando Sensor: " + e.getMessage());
            return false;
        }
    }

    public boolean actualizar(Sensor s) {
        String sql = "UPDATE Sensor SET id_cultivo=?, tipo_sensor=?, modelo=?, fecha_instalacion=?, estado=? "
                   + "WHERE id_sensor=?";

        try (Connection cn = ConexionSQL.conectar();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setInt(1, s.getIdCultivo());
            ps.setString(2, s.getTipoSensor());
            ps.setString(3, s.getModelo());
            ps.setDate(4, s.getFechaInstalacion());
            ps.setString(5, s.getEstado());
            ps.setInt(6, s.getIdSensor());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error actualizando Sensor: " + e.getMessage());
            return false;
        }
    }

    public boolean eliminar(int idSensor) {
        String sql = "DELETE FROM Sensor WHERE id_sensor=?";
        try (Connection cn = ConexionSQL.conectar();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setInt(1, idSensor);
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error eliminando Sensor: " + e.getMessage());
            return false;
        }
    }

    public List<Sensor> listarPorCultivo(int idCultivo) {
        List<Sensor> lista = new ArrayList<>();
        String sql = "SELECT * FROM Sensor WHERE id_cultivo=? ORDER BY id_sensor DESC";

        try (Connection cn = ConexionSQL.conectar();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setInt(1, idCultivo);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Sensor s = new Sensor();
                    s.setIdSensor(rs.getInt("id_sensor"));
                    s.setIdCultivo(rs.getInt("id_cultivo"));
                    s.setTipoSensor(rs.getString("tipo_sensor"));
                    s.setModelo(rs.getString("modelo"));
                    s.setFechaInstalacion(rs.getDate("fecha_instalacion"));
                    s.setEstado(rs.getString("estado"));
                    lista.add(s);
                }
            }

        } catch (SQLException e) {
            System.out.println("Error listando sensores: " + e.getMessage());
        }

        return lista;
    }
        // Listar TODOS los sensores (para combos, reportes, etc.)
    public List<Sensor> listarTodos() {
        List<Sensor> lista = new ArrayList<>();
        String sql = "SELECT * FROM Sensor ORDER BY id_sensor DESC";

        try (Connection cn = ConexionSQL.conectar();
             PreparedStatement ps = cn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Sensor s = new Sensor();
                s.setIdSensor(rs.getInt("id_sensor"));
                s.setIdCultivo(rs.getInt("id_cultivo"));
                s.setTipoSensor(rs.getString("tipo_sensor"));
                s.setModelo(rs.getString("modelo"));
                s.setFechaInstalacion(rs.getDate("fecha_instalacion"));
                s.setEstado(rs.getString("estado"));
                lista.add(s);
            }

        } catch (SQLException e) {
            System.out.println("Error listando todos los sensores: " + e.getMessage());
        }

        return lista;
    }

}
