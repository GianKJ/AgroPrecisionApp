package dao;

import conexion.ConexionSQL;
import modelo.Agricultor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AgricultorDAO {

    // INSERT
    public boolean insertar(Agricultor a) {
        String sql = "INSERT INTO Agricultor(nombre,apellido,dni,telefono,email,direccion) " +
                     "VALUES (?,?,?,?,?,?)";
        try (Connection cn = ConexionSQL.conectar();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setString(1, a.getNombre());
            ps.setString(2, a.getApellido());
            ps.setString(3, a.getDni());
            ps.setString(4, a.getTelefono());
            ps.setString(5, a.getEmail());
            ps.setString(6, a.getDireccion());

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error insertando Agricultor: " + e.getMessage());
            return false;
        }
    }

    // UPDATE
    public boolean actualizar(Agricultor a) {
        String sql = "UPDATE Agricultor SET nombre = ?, apellido = ?, dni = ?, " +
                     "telefono = ?, email = ?, direccion = ? " +
                     "WHERE id_agricultor = ?";
        try (Connection cn = ConexionSQL.conectar();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setString(1, a.getNombre());
            ps.setString(2, a.getApellido());
            ps.setString(3, a.getDni());
            ps.setString(4, a.getTelefono());
            ps.setString(5, a.getEmail());
            ps.setString(6, a.getDireccion());
            ps.setInt(7, a.getIdAgricultor());

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error actualizando Agricultor: " + e.getMessage());
            return false;
        }
    }

    // DELETE
    public boolean eliminar(int idAgricultor) {
        String sql = "DELETE FROM Agricultor WHERE id_agricultor = ?";
        try (Connection cn = ConexionSQL.conectar();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setInt(1, idAgricultor);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error eliminando Agricultor: " + e.getMessage());
            return false;
        }
    }

    // SELECT por ID
    public Agricultor obtenerPorId(int idAgricultor) {
        String sql = "SELECT * FROM Agricultor WHERE id_agricultor = ?";
        Agricultor a = null;

        try (Connection cn = ConexionSQL.conectar();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setInt(1, idAgricultor);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    a = mapear(rs);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error obteniendo Agricultor: " + e.getMessage());
        }
        return a;
    }

    // SELECT todos
    public List<Agricultor> listarTodos() {
        List<Agricultor> lista = new ArrayList<>();
        String sql = "SELECT * FROM Agricultor ORDER BY id_agricultor DESC";

        try (Connection cn = ConexionSQL.conectar();
             PreparedStatement ps = cn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(mapear(rs));
            }
        } catch (SQLException e) {
            System.out.println("Error listando Agricultores: " + e.getMessage());
        }

        return lista;
    }

    // método privado para mapear ResultSet -> objeto
    private Agricultor mapear(ResultSet rs) throws SQLException {
        Agricultor a = new Agricultor();
        a.setIdAgricultor(rs.getInt("id_agricultor"));
        a.setNombre(rs.getString("nombre"));
        a.setApellido(rs.getString("apellido"));
        a.setDni(rs.getString("dni"));
        a.setTelefono(rs.getString("telefono"));
        a.setEmail(rs.getString("email"));
        a.setDireccion(rs.getString("direccion"));
        return a;
    }
}
