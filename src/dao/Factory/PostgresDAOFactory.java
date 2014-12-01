/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Factory;

import Utilitarios.Constantes;
import dao.AutentificacionDAO;
import dao.EnsayoDAO;
import dao.MuestraDAO;
import dao.PacienteDAO;
import dao.PersonaDAO;
import dao.PostgresDAO.PostgresAutentificacionDAO;
import dao.PostgresDAO.PostgresEnsayoDAO;
import dao.PostgresDAO.PostgresMuestraDAO;
import dao.PostgresDAO.PostgresPacienteDAO;
import dao.PostgresDAO.PostgresPersonaDAO;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Rocha
 */
public class PostgresDAOFactory extends DAOFactory {

    private static Connection conexion;
    private static Statement sentencia;

    public static final String DRIVER = Constantes.POSTGRESQL_DRIVER;
    public static final String DBURL = Constantes.POSTGRESQL_DBURL;

    public static Connection createConnection() {
        try {
            Class.forName(DRIVER);
            conexion = DriverManager
                    .getConnection(DBURL,
                            Constantes.POSTGRESQL_USER,
                            Constantes.POSTGRESQL_PASS);

            if (conexion != null) {
                System.out.println("Conexion exitosa!");
            } else {
                System.out.println("Conexion fallida!");
            }
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            JOptionPane.showMessageDialog(new Frame(),
                    "Error con la Base de Datos", "Error",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        return conexion;
    }

    /**
     * Executes the given SQL statement, which may be an INSERT, UPDATE, or
     * DELETE statement or an SQL statement that returns nothing, such as an SQL
     * DDL statement.
     *
     * @param sql
     * @return True if everything went well
     */
    public static boolean updateDB(String sql) {
        try {
            sentencia = createConnection().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
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
     *
     * @param sql
     * @return
     */
    public static ResultSet consultar(String sql) {
        ResultSet resultado = null;
        try {
            sentencia = createConnection().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
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

    @Override
    public EnsayoDAO getEnsayoDAO() {
        return new PostgresEnsayoDAO();
    }

    @Override
    public MuestraDAO getMuestraDAO() {
        return new PostgresMuestraDAO();
    }

    @Override
    public PacienteDAO getPacienteDAO() {
        return new PostgresPacienteDAO();
    }

    @Override
    public AutentificacionDAO getAutentificacionDAO() {
        return new PostgresAutentificacionDAO();
    }

    @Override
    public PersonaDAO getPersonaDAO() {
        return new PostgresPersonaDAO();
    }
}
