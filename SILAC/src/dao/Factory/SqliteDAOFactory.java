/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Factory;

import dao.EnsayoDAO;
import dao.MuestraDAO;
import dao.PacienteDAO;
import dao.SQLiteDAO.SqliteEnsayoDAO;
import dao.SQLiteDAO.SqliteMuestraDAO;
import dao.SQLiteDAO.SqlitePacienteDAO;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcelo
 */
public class SqliteDAOFactory extends DAOFactory {

   

    public static final String DRIVER = "org.sqlite.JDBC";
    public static final String DBURL = "jdbc:sqlite:silac.db";

    public static void main(String[] args) {
        SqliteDAOFactory s = new SqliteDAOFactory();

    }

    public static Connection createConnection() {
        Connection connection = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager
                    .getConnection(DBURL);
            String sql = "select * from Paciente";

            if (connection != null) {
                System.out.println("Conexion exitosa!");
            } else {
                System.out.println("Conexion fallida!");
            }
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            JOptionPane.showMessageDialog(new Frame(), "Error con la Base de Datos", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        return connection;
    }

    /**
     * Executes the given SQL statement, which may be an INSERT, UPDATE, or
     * DELETE statement or an SQL statement that returns nothing, such as an SQL
     * DDL statement.
     *
     * @param sql
     * @return True if everything went well
     */
//    public static boolean updateDB(String sql) {
//        try {
//            sentencia = createConnection().createStatement();
//            sentencia.executeUpdate(sql);
//            sentencia.close();
//            //conexion.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return false;
//        }finally {
//            SqliteDAOFactory.close(null);
//        }
//        return true;
//    }

    /**
     * Executes the given SQL statement, which is a Select statement
     *
     * @param sql
     * @return
     */
//    public static ResultSet consultar(String sql) {
//        ResultSet resultado = null;
//        try {
//            sentencia = createConnection().createStatement();
//            resultado = sentencia.executeQuery(sql);
//            //conexion.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//            System.out.println("La consulta fallo");
//            return null;
//        }
//        System.out.println("La consulta Fue Exitosa");
//        return resultado;
//    }

//    public static void close(ResultSet resultSet) {
//        if (conexion != null) {
//            try {
//                conexion.close();
//            } catch (SQLException ignore) {
//            }
//        }
//        if (sentencia != null) {
//            try {
//                sentencia.close();
//            } catch (SQLException ignore) {
//            }
//        }
//        if (resultSet != null) {
//            try {
//                resultSet.close();
//            } catch (SQLException ignore) {
//            }
//        }
//    }



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
