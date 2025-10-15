package org.sambold.tg.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {

     private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
     private static final String URL = "jdbc:mysql://localhost:3306/tgdb?useTimezone=true&serverTimezone=UTC";
     private static final String USER = "root";
     private static final String PASS = "";

    
        // Método para conectar ao banco de dados da API
    public static Connection conectar() {
        try {
            Class.forName(DRIVER);
        // Retorna a conexão ao programa
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver não encontrado: " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
        }
        return null; 

    }
    public static void fecharConexao(Connection con){

            try {
                if(con!=null){
                    con.close();
                }
            } catch (SQLException ex) {

            }   
    }  

    public static void fecharConexao(Connection con, PreparedStatement stmt){

            fecharConexao(con);

            try {
                if(stmt!=null){
                    stmt.close();
                }
            } catch (SQLException ex) {

            }   
    }

    public static void fecharConexao(Connection con, PreparedStatement stmt, ResultSet rs){

            fecharConexao(con, stmt);

            try {
                if(rs!=null){
                    rs.close();
                }
            } catch (SQLException ex) {
    
            }   
    }
    public static Connection getConnection() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getConnection'");
    }

}
