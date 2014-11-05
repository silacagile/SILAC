/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.SQLiteDAO;

import dao.Factory.SqliteDAOFactory;
import dao.MuestraDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.*;
import modelo.Muestra;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Veymar Montaño Colqu
 */
public class SqliteMuestraDAO implements MuestraDAO {

    public static void main(String[] args) {
        SqliteMuestraDAO p = new SqliteMuestraDAO();
        Muestra prueba = new Muestra();

        prueba.setIdPaciente("P1");
        prueba.setIdMuestra("M1");
        prueba.setTipoTest("TEst");
        prueba.setInstrumento("ins");
        prueba.setObservaciones("obs");
        prueba.setVolMuestra(1.0);
        prueba.setResultadoFinal("res");
        prueba.setSolucionBuffer("buffer");
        prueba.setTipoMuestra("tipoM");

        //p.insertMuestra(prueba);
        // p.deleteMuestra("P1", "M1");
        for(Muestra m : p.getAllMuestras("P1")) {
            System.out.println(m);
        }
    }

    @Override
    public List<Muestra> getAllMuestras(String idPaciente) {
        List<Muestra> muestras = new ArrayList<>();
        Muestra muestra;
        String sql = "SELECT * "
                + "FROM Muestra "
                + "WHERE id_Paciente = '" + idPaciente + "';";
        ResultSet rs = null;
        Statement statement = null;
        Connection connection = SqliteDAOFactory.createConnection();

        try {
            statement = connection.createStatement();
            rs = statement.executeQuery(sql);
            while (rs.next()) {
                muestra = new Muestra();
                muestra.setIdPaciente(rs.getString("id_Paciente"));
                muestra.setIdMuestra(rs.getString("id_muestra"));
                muestra.setTipoMuestra(rs.getString("tipo_muestra"));
                muestra.setTipoTest(rs.getString("tipo_test"));
                muestra.setSolucionBuffer(rs.getString("solucion_buffer"));
                muestra.setInstrumento(rs.getString("instrumento"));
                muestra.setVolMuestra(rs.getDouble("vol_muestra"));
                muestra.setResultadoFinal(rs.getString("resultado_final"));
                muestra.setObservaciones(rs.getString("observaciones"));
                muestras.add(muestra);
            }
        } catch (SQLException e) {
            System.out.println("Error");
            System.err.println(e.getClass().getName() + ": " + e.getMessage());

        } finally {
            if (connection != null) {
                try {
                    connection.close();
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
        return muestras;
    }

    @Override
    public Muestra findMuestra(String idPaciente, String idMuestra) {
        Muestra muestra = null;

        String sql = "SELECT * FROM Muestra "
                + "where id_Paciente =" + "'" + idPaciente + "' "
                + "and id_muestra =" + "'" + idMuestra + "';";
        ResultSet rs = null;
        Statement statement = null;
        Connection connection = SqliteDAOFactory.createConnection();
        try {
            statement = connection.createStatement();
            rs = statement.executeQuery(sql);
            if (rs.next()) {
                muestra = new Muestra();
                muestra.setIdPaciente(rs.getString("id_Paciente"));
                muestra.setIdMuestra(rs.getString("id_muestra"));
                muestra.setTipoTest(rs.getString("tipo_test"));
                muestra.setTipoMuestra(rs.getString("tipo_muestra"));
                muestra.setSolucionBuffer(rs.getString("solucion_buffer"));
                muestra.setInstrumento(rs.getString("instrumento"));
                muestra.setVolMuestra(rs.getDouble("vol_muestra"));
                muestra.setResultadoFinal(rs.getString("resultado_final"));
                muestra.setObservaciones(rs.getString("observaciones"));
            }
        } catch (SQLException e) {
            System.out.println("Error");
            System.err.println(e.getClass().getName() + ": " + e.getMessage());

        } finally {
            if (connection != null) {
                try {
                    connection.close();
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

        return muestra;
    }

    @Override
    public boolean updateMuestra(Muestra muestra) {
        boolean res = false;
        ResultSet rs = null;
        Statement statement = null;
        Connection connection = SqliteDAOFactory.createConnection();
        try {
            String sql = "update Muestra set id_muestra=" + "'" + muestra.getIdMuestra()
                    + "', tipo_muestra=" + "'" + muestra.getTipoMuestra()
                    + "', tipo_test=" + "'" + muestra.getTipoTest()
                    + "',solucion_buffer=" + "'" + muestra.getSolucionBuffer()
                    + "',instrumento=" + "'" + muestra.getInstrumento()
                    + "',vol_muestra=" + "'" + muestra.getVolMuestra()
                    + "',resultado_final=" + "'" + muestra.getResultadoFinal()
                    + "',observaciones=" + "'" + muestra.getObservaciones() + "'"
                    + "where id_Paciente='" + muestra.getIdPaciente() + "' "
                    + "and id_muestra='" + muestra.getIdMuestra() + "';";
            statement = connection.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("Error");
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            res = false;
        } finally {
            if (connection != null) {
                try {
                    connection.close();
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

    @Override
    public boolean deleteMuestra(String idPaciente, String idMuestra) {
        boolean res = false;
        ResultSet rs = null;
        Statement statement = null;
        Connection connection = SqliteDAOFactory.createConnection();
        try {
            String sql = "DELETE FROM Muestra "
                    + "where id_Paciente =" + "'" + idPaciente + "' "
                    + "and id_muestra =" + "'" + idMuestra + "';";
            statement = connection.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("Error");
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            res = false;
        } finally {
            if (connection != null) {
                try {
                    connection.close();
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

    @Override
    public boolean insertMuestra(Muestra muestra) {
        boolean res = false;
        ResultSet rs = null;
        Statement statement = null;
        Connection connection = SqliteDAOFactory.createConnection();
        try {
            String sql = "insert into Muestra (id_muestra,id_Paciente,tipo_muestra,tipo_test,solucion_buffer"
                    + ",instrumento,vol_muestra,resultado_final,observaciones)"
                    + " values('" + muestra.getIdMuestra()
                    + "','" + muestra.getIdPaciente()
                    + "','" + muestra.getTipoMuestra()
                    + "','" + muestra.getTipoTest()
                    + "','" + muestra.getSolucionBuffer()
                    + "','" + muestra.getInstrumento()
                    + "','" + muestra.getVolMuestra()
                    + "','" + muestra.getResultadoFinal()
                    + "','" + muestra.getObservaciones() + "');";
            statement = connection.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("Error");
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            res = false;
        } finally {
            if (connection != null) {
                try {
                    connection.close();
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
