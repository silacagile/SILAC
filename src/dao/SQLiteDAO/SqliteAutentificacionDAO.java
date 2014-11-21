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

/**
 *
 * @author Jorge Aguirre
 */
public class SqliteAutentificacionDAO implements AutentificacionDAO {
    
    Connection db = SqliteDAOFactory.createConnection();

    @Override
    public String getPassword(String login) {
        String res = null;
        Connection connection = SqliteDAOFactory.createConnection();
        ResultSet rs = null;
        Statement statement = null;

        try {
            String sql = "SELECT password "
                    + "FROM usuario "
                    + "WHERE login = " + "'" + login + "'";
            statement = connection.createStatement();
            rs = statement.executeQuery(sql);
            
            if(rs.next()) res = rs.getString("password");
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
        
        return res;
    }
}
