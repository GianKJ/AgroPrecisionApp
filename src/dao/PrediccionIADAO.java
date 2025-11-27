package dao;

import conexion.ConexionSQL;
import modelo.PrediccionIA;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class PrediccionIADAO {

    public boolean insertar(PrediccionIA p) {
         String sql = "INSERT INTO PrediccionIA " +
                 "(id_cultivo, tipo_prediccion, probabilidad, condiciones_favorables, fecha_prediccion) " +
                 "VALUES (?,?,?,?,?)";

    try (Connection cn = ConexionSQL.conectar();
         PreparedStatement ps = cn.prepareStatement(sql)) {

        ps.setInt(1, p.getIdCultivo());
        ps.setString(2, p.getTipoPrediccion());
        ps.setDouble(3, p.getProbabilidad());
        ps.setString(4, p.getCondicionesFavorables());
        ps.setTimestamp(5, p.getFechaPrediccion());

        return ps.executeUpdate() > 0;

    } catch (SQLException e) {
        // PARA VER el error real:
        System.out.println("Error insertando PrediccionIA: " + e.getMessage());
        javax.swing.JOptionPane.showMessageDialog(
                null,
                "Error SQL al registrar predicción:\n" + e.getMessage(),
                "Error",
                javax.swing.JOptionPane.ERROR_MESSAGE
        );
        return false;
    }

    }

    public boolean actualizar(PrediccionIA p) {
        String sql = "UPDATE PrediccionIA " +
                     "SET id_cultivo = ?, tipo_prediccion = ?, probabilidad = ?, condiciones_favorables = ? " +
                     "WHERE id_prediccion = ?";

        try (Connection cn = ConexionSQL.conectar();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setInt(1, p.getIdCultivo());
            ps.setString(2, p.getTipoPrediccion());
            ps.setInt(3, p.getProbabilidad());
            ps.setString(4, p.getCondicionesFavorables());
            ps.setInt(5, p.getIdPrediccion());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error actualizando PrediccionIA: " + e.getMessage());
            return false;
        }
    }

    public boolean eliminar(int idPrediccion) {
        String sql = "DELETE FROM PrediccionIA WHERE id_prediccion = ?";

        try (Connection cn = ConexionSQL.conectar();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setInt(1, idPrediccion);
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error eliminando PrediccionIA: " + e.getMessage());
            return false;
        }
    }

    public List<PrediccionIA> listarPorCultivo(int idCultivo) {
        List<PrediccionIA> lista = new ArrayList<>();
        String sql = "SELECT * FROM PrediccionIA WHERE id_cultivo = ? ORDER BY fecha_prediccion DESC";

        try (Connection cn = ConexionSQL.conectar();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setInt(1, idCultivo);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    lista.add(mapear(rs));
                }
            }

        } catch (SQLException e) {
            System.out.println("Error listando PrediccionIA por cultivo: " + e.getMessage());
        }

        return lista;
    }

    public List<PrediccionIA> listarTodos() {
        List<PrediccionIA> lista = new ArrayList<>();
        String sql = "SELECT * FROM PrediccionIA ORDER BY fecha_prediccion DESC";

        try (Connection cn = ConexionSQL.conectar();
             PreparedStatement ps = cn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(mapear(rs));
            }

        } catch (SQLException e) {
            System.out.println("Error listando todas las PrediccionIA: " + e.getMessage());
        }

        return lista;
    }

    private PrediccionIA mapear(ResultSet rs) throws SQLException {
        PrediccionIA p = new PrediccionIA();
        p.setIdPrediccion(rs.getInt("id_prediccion"));
        p.setIdCultivo(rs.getInt("id_cultivo"));

        Timestamp ts = rs.getTimestamp("fecha_prediccion");
        p.setFechaPrediccion(ts);

        p.setTipoPrediccion(rs.getString("tipo_prediccion"));
        p.setProbabilidad(rs.getInt("probabilidad"));
        p.setCondicionesFavorables(rs.getString("condiciones_favorables"));

        return p;
    }
}
