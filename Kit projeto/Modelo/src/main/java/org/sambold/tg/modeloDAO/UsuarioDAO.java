package org.sambold.tg.modeloDAO;

import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.sambold.tg.conexao.Conexao;
import org.sambold.tg.tgmodeloBeans.Usuario;

public class UsuarioDAO {

    public List<Usuario> listarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT email, senha_hash, perfil, ativo FROM usuario";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String email = rs.getString("email");
                String senha = rs.getString("senha_hash");
                String perfil = rs.getString("perfil");
                boolean ativo = rs.getBoolean("ativo");

                Usuario usuario = new Usuario(email, senha, perfil, ativo);
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }

    public boolean inserirUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuario (email, senha_hash, perfil, ativo) VALUES (?, ?, ?, ?)";
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, usuario.getEmail());
            stmt.setString(2, usuario.getSenha());
            stmt.setString(3, usuario.getPerfil());
            stmt.setBoolean(4, usuario.isAtivo());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}