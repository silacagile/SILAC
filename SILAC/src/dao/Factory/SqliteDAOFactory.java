/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Factory;

import Utilitarios.Constantes;
import dao.EnsayoDAO;
import dao.MuestraDAO;
import dao.PacienteDAO;
import dao.SQLiteDAO.SqliteEnsayoDAO;
import dao.SQLiteDAO.SqliteMuestraDAO;
import dao.SQLiteDAO.SqlitePacienteDAO;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcelo
 */
public class SqliteDAOFactory extends DAOFactory {

    public static final String DRIVER = Constantes.SQLITE_DRIVER;
    public static final String DBURL = Constantes.SQLITE_DBURL;

    public static Connection createConnection() {
        Connection connection = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager
                    .getConnection(DBURL);

            if (connection != null) {
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
        return connection;
    }

    @Override
    public EnsayoDAO getEnsayoDAO() {
        return new SqliteEnsayoDAO();
    }

    @Override
    public MuestraDAO getMuestraDAO() {
        return new SqliteMuestraDAO();
    }

    @Override
    public PacienteDAO getPacienteDAO() {
        return new SqlitePacienteDAO();
    }
}
