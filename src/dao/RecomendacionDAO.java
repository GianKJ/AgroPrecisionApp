package dao;

import conexion.ConexionSQL;
import modelo.Recomendacion;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RecomendacionDAO {

    // INSERTAR
    public boolean insertar(Recomendacion r) {
        String sql = "INSERT INTO Recomendacion(" +
                "id_prediccion, tipo, descripcion, es_leida, alerta_critica, fecha_generacion" +
                ") VALUES (?,?,?,?,?,?)";

        try (Connection cn = ConexionSQL.conectar();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setInt(1, r.getIdPrediccion());
            ps.setString(2, r.getTipo());
            ps.setString(3, r.getDescripcion());
            ps.setBoolean(4, r.isEsLeida());
            ps.setBoolean(5, r.isAlertaCritica());
            ps.setTimestamp(6, r.getFechaGeneracion());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error insertando recomendación: " + e.getMessage());
            return false;
        }
    }

    // ACTUALIZAR
    public boolean actualizar(Recomendacion r) {
        String sql = "UPDATE Recomendacion SET " +
                "id_prediccion=?, tipo=?, descripcion=?, es_leida=?, alerta_critica=? " +
                "WHERE id_recomendacion=?";

        try (Connection cn = ConexionSQL.conectar();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setInt(1, r.getIdPrediccion());
            ps.setString(2, r.getTipo());
            ps.setString(3, r.getDescripcion());
            ps.setBoolean(4, r.isEsLeida());
            ps.setBoolean(5, r.isAlertaCritica());
            ps.setInt(6, r.getIdRecomendacion());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error actualizando recomendación: " + e.getMessage());
            return false;
        }
    }

    // ELIMINAR
    public boolean eliminar(int idRecomendacion) {
        String sql = "DELETE FROM Recomendacion WHERE id_recomendacion=?";

        try (Connection cn = ConexionSQL.conectar();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setInt(1, idRecomendacion);
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error eliminando recomendación: " + e.getMessage());
            return false;
        }
    }

    // LISTAR TODAS
    public List<Recomendacion> listarTodas() {
        List<Recomendacion> lista = new ArrayList<>();
        String sql = "SELECT * FROM Recomendacion ORDER BY fecha_generacion DESC";

        try (Connection cn = ConexionSQL.conectar();
             PreparedStatement ps = cn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(mapear(rs));
            }

        } catch (SQLException e) {
            System.out.println("Error listando recomendaciones: " + e.getMessage());
        }

        return lista;
    }

    // LISTAR POR PREDICCIÓN
    public List<Recomendacion> listarPorPrediccion(int idPrediccion) {
        List<Recomendacion> lista = new ArrayList<>();
        String sql = "SELECT * FROM Recomendacion WHERE id_prediccion=? ORDER BY fecha_generacion DESC";

        try (Connection cn = ConexionSQL.conectar();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setInt(1, idPrediccion);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    lista.add(mapear(rs));
                }
            }

        } catch (SQLException e) {
            System.out.println("Error listando por predicción: " + e.getMessage());
        }

        return lista;
    }

    // MAPEAR RESULTSET → OBJETO
    private Recomendacion mapear(ResultSet rs) throws SQLException {
        Recomendacion r = new Recomendacion();

        r.setIdRecomendacion(rs.getInt("id_recomendacion"));
        r.setIdPrediccion(rs.getInt("id_prediccion"));
        r.setTipo(rs.getString("tipo"));
        r.setDescripcion(rs.getString("descripcion"));
        r.setEsLeida(rs.getBoolean("es_leida"));
        r.setAlertaCritica(rs.getBoolean("alerta_critica"));
        r.setFechaGeneracion(rs.getTimestamp("fecha_generacion"));

        return r;
    }
}
