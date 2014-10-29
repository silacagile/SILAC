/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Daniel Rocha
 */
public class PostgresConn {
    
    private Connection conexion;
    private Statement sentencia;
    
    
    public PostgresConn conectar(){
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/Silac",
                            "postgres", "postgres");
           
            if (conexion != null) {
                System.out.println("Conexion exitosa!");
            } else {
                System.out.println("Conexion fallida!");
            }
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.out.println("No se pudo conectar a la BD");
            System.exit(0);
        }
        return this;
    }
    
    /**
     * Executes the given SQL statement, which may be an INSERT, 
     * UPDATE, or DELETE statement or an SQL statement that returns nothing, 
     * such as an SQL DDL statement.
     * @param sql
     * @return True if everything went well
     */
    public boolean updateDB(String sql) {
        try {
            sentencia = getConexion().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            sentencia.executeUpdate(sql);
            sentencia.close();
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    /**
     * Executes the given SQL statement, which is a Select statement
     * @param sql
     * @return 
     */
    public ResultSet consultar(String sql) {
        ResultSet resultado = null;
        try {
            sentencia = getConexion().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            resultado = sentencia.executeQuery(sql);
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("La consulta fallo");
            return null;
        }
        System.out.println("La consulta Fue Exitosa");
        return resultado;
    }
    
    public Connection getConexion() {
        return conexion;
    }
}
