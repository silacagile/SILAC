/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.SQLiteDAO;

import dao.Factory.SqliteDAOFactory;
import dao.PersonaDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Persona;

/**
 *
 * @author Jorge Aguirre
 */
public class SqlitePersonaDAO implements PersonaDAO {
    
    Connection db = SqliteDAOFactory.createConnection();

    @Override
    public Persona buscarPersona(String id) {
        Persona persona = null;
        Connection connection = SqliteDAOFactory.createConnection();
        ResultSet rs = null;
        Statement statement = null;

        try {
            String sql = "SELECT * "
                    + "FROM persona "
                    + "WHERE id_Persona = " + "'" + id + "'";
            statement = connection.createStatement();
            rs = statement.executeQuery(sql);
            
            while (rs.next()) {
                persona = new Persona();
                persona.setIdPersona(rs.getString("id_Persona"));
                persona.setNombre(rs.getString("nombre"));
                persona.setDireccion(rs.getString("direccion"));
                persona.setTelefono(rs.getString("telefono"));
                persona.setApMaterno(rs.getString("ap_materno"));
                persona.setApPaterno(rs.getString("ap_paterno"));
                persona.setCi(rs.getString("ci"));
                persona.setCorreo(rs.getString("correo"));
                persona.setFnac(rs.getString("fnac"));
                persona.setRol(rs.getInt("rol"));
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
        
        return persona;
    }
    
}
