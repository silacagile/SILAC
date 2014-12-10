/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.SQLiteDAO;

import dao.AutentificacionDAO;
import dao.Factory.SqliteDAOFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Persona;
import modelo.Rol;
import modelo.Usuario;

/**
 *
 * @author Jorge Aguirre
 */
public class SqliteAutentificacionDAO implements AutentificacionDAO {
    
    Connection db = SqliteDAOFactory.createConnection();

    @Override
    public Usuario getUsuario(String login) {
        Usuario usuario = null;
        Connection connection = SqliteDAOFactory.createConnection();
        ResultSet rs = null;
        Statement statement = null;

        try {
            String sql = "SELECT * "
                    + "FROM usuario "
                    + "WHERE login = " + "'" + login + "'";
            statement = connection.createStatement();
            rs = statement.executeQuery(sql);
            
            if(rs.next()) {
                String password = rs.getString("password");
                usuario = new Usuario();
                usuario.setLogin(login);
                usuario.setPassword(rs.getString("password"));
                    
                    // Persona
                    Persona persona = new Persona();
                    persona.setIdPersona(rs.getString("id_Persona"));
                    
                    usuario.setPersona(persona);

            } 
        } catch(SQLException sqle) {
            System.out.println("Error");
            System.err.println(sqle.getClass().getName() 
                    + ": " + sqle.getMessage());
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch(SQLException e) {}
            }
        }
        
        return usuario;
    }
}
