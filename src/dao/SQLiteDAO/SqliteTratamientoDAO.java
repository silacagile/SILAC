/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.SQLiteDAO;

import dao.Factory.SqliteDAOFactory;
import dao.TratamientoDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Tratamiento;

/**
 *
 * @author Jorge Aguirre
 */
public class SqliteTratamientoDAO implements TratamientoDAO {

    Connection db = SqliteDAOFactory.createConnection();

    @Override
    public boolean insertTratamiento(Tratamiento tratamiento) {
        boolean res = false;
        ResultSet rs = null;
        Statement statement = null;
        try {
            String sql = "INSERT INTO tratamiento VALUES('" + tratamiento.getIdTratamiento() + "', '"
                    + tratamiento.getIdMuestra() + "', '" + tratamiento.getIdPaciente() + "', '"
                    + tratamiento.getIdDoctor() + "', '" + tratamiento.getFechaTratamiento() + "', '" 
                    + tratamiento.getDescripcion() + "');";
            statement = db.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("Error");
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            res = false;
        } finally {
            if (db != null) {
                try {
                    db.close();
                } catch (SQLException ignore) {
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ignore) {
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ignore) {
                }
            }
        }
        return res;
    }
    
}
