package org.miGuru;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAQ {
    public void guardarUsuario(Usuario usuario) {
        String sql = "INSERT INTO Usuario (idEmpleado, nombre, correo, password, rol) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, usuario.getIdEmpleado());
            pstmt.setString(2, usuario.getNombre());
            pstmt.setString(3, usuario.getCorreo());
            pstmt.setString(4, usuario.getPassword());
            pstmt.setString(5, usuario.getRol());
            pstmt.executeUpdate();
            System.out.println("Usuario guardado en la base de datos.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
