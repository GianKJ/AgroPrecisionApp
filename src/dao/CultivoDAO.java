package dao;

import conexion.ConexionSQL;
import modelo.Cultivo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CultivoDAO {

    public boolean insertar(Cultivo c) {
        String sql = "INSERT INTO Cultivo(id_agricultor,nombre_parcela,tipo_cultivo," +
                     "area_ha,fecha_inicio,estado) VALUES (?,?,?,?,?,?)";
        try (Connection cn = ConexionSQL.conectar();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setInt(1, c.getIdAgricultor());
            ps.setString(2, c.getNombreParcela());
            ps.setString(3, c.getTipoCultivo());
            ps.setDouble(4, c.getAreaHa());
            ps.setDate(5, c.getFechaInicio());
            ps.setString(6, c.getEstado());

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error insertando Cultivo: " + e.getMessage());
            return false;
        }
    }

    public boolean actualizar(Cultivo c) {
        String sql = "UPDATE Cultivo SET id_agricultor=?, nombre_parcela=?, tipo_cultivo=?, " +
                     "area_ha=?, fecha_inicio=?, estado=? WHERE id_cultivo=?";
        try (Connection cn = ConexionSQL.conectar();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setInt(1, c.getIdAgricultor());
            ps.setString(2, c.getNombreParcela());
            ps.setString(3, c.getTipoCultivo());
            ps.setDouble(4, c.getAreaHa());
            ps.setDate(5, c.getFechaInicio());
            ps.setString(6, c.getEstado());
            ps.setInt(7, c.getIdCultivo());

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error actualizando Cultivo: " + e.getMessage());
            return false;
        }
    }

    public boolean eliminar(int idCultivo) {
        String sql = "DELETE FROM Cultivo WHERE id_cultivo=?";
        try (Connection cn = ConexionSQL.conectar();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setInt(1, idCultivo);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error eliminando Cultivo: " + e.getMessage());
            return false;
        }
    }

    public Cultivo obtenerPorId(int idCultivo) {
        String sql = "SELECT * FROM Cultivo WHERE id_cultivo=?";
        Cultivo c = null;

        try (Connection cn = ConexionSQL.conectar();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setInt(1, idCultivo);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    c = mapear(rs);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error obteniendo Cultivo: " + e.getMessage());
        }
        return c;
    }

    public List<Cultivo> listarPorAgricultor(int idAgricultor) {
        List<Cultivo> lista = new ArrayList<>();
        String sql = "SELECT * FROM Cultivo WHERE id_agricultor=? ORDER BY id_cultivo DESC";

        try (Connection cn = ConexionSQL.conectar();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setInt(1, idAgricultor);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    lista.add(mapear(rs));
                }
            }
        } catch (SQLException e) {
            System.out.println("Error listando Cultivos: " + e.getMessage());
        }
        return lista;
    }

    private Cultivo mapear(ResultSet rs) throws SQLException {
        Cultivo c = new Cultivo();
        c.setIdCultivo(rs.getInt("id_cultivo"));
        c.setIdAgricultor(rs.getInt("id_agricultor"));
        c.setNombreParcela(rs.getString("nombre_parcela"));
        c.setTipoCultivo(rs.getString("tipo_cultivo"));
        c.setAreaHa(rs.getDouble("area_ha"));
        c.setFechaInicio(rs.getDate("fecha_inicio"));
        c.setEstado(rs.getString("estado"));
        return c;
    }    public List<Cultivo> listarTodos() {
        List<Cultivo> lista = new ArrayList<>();
        String sql = "SELECT * FROM Cultivo ORDER BY id_cultivo DESC";

        try (Connection cn = ConexionSQL.conectar();
             PreparedStatement ps = cn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(mapear(rs));
            }

        } catch (SQLException e) {
            System.out.println("Error listando todos los cultivos: " + e.getMessage());
        }

        return lista;
    }

}

