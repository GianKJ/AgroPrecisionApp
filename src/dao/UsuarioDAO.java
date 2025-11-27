package dao;

import conexion.ConexionSQL;
import modelo.Usuario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    public Usuario validarLogin(String usuario, String clave) {

        Usuario u = null;
        String sql = "SELECT * FROM Usuario WHERE nombre_usuario=? AND password_hash=?";

        try (Connection cn = ConexionSQL.conectar();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setString(1, usuario);
            ps.setString(2, clave);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    u = new Usuario();
                    u.setIdUsuario(rs.getInt("id_usuario"));
                    u.setIdAgricultor(rs.getInt("id_agricultor"));
                    u.setNombreUsuario(rs.getString("nombre_usuario"));
                    u.setPasswordHash(rs.getString("password_hash"));
                }
            }

        } catch (SQLException e) {
            System.out.println("Error validando login: " + e.getMessage());
        }

        return u;
    }
}
