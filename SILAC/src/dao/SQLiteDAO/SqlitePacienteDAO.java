/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.SQLiteDAO;

import dao.Factory.SqliteDAOFactory;
import static dao.Factory.SqliteDAOFactory.createConnection;
import dao.PacienteDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.Paciente;

/**
 *
 * @author Marcelo
 */
public class SqlitePacienteDAO implements PacienteDAO {

    public static void main(String[] args) {
        SqlitePacienteDAO p = new SqlitePacienteDAO();
        Paciente paciente = new Paciente();
        paciente.setIdPaciente("P10");
        paciente.setNombre("User Test");
        paciente.setDireccion("Av. Oquendo");
        paciente.setTelefono("75612458");
        paciente.setApPaterno("Gonzales");
        paciente.setApMaterno("Vargas");
        paciente.setCi("745698");
        paciente.setCorreo("prueba@gmail.com");

        /**
         * Insertar Paciente
         */
        //p.insertPaciente(paciente);
        /**
         * Eliminar Paciente
         */
        //p.deletePaciente("P10");
        /**
         * Obtener todos los pacientes
         */
        List<Paciente> lista = p.getAllPacientes();
        for (Paciente pac : lista) {
            System.out.println(pac);
        }
        /**
         * Encontrar Paciente
         */
        /* Paciente pac = p.findPaciente("P1");
         System.out.println(pac);*/

    }

    @Override
    public Paciente findPaciente(String id) {
        Paciente paciente = null;
        String sql = "SELECT * FROM Paciente where id_Paciente =" + "'" + id + "';";
        ResultSet rs = null;
        Statement statement = null;
        Connection connection = SqliteDAOFactory.createConnection();
        try {
            statement = connection.createStatement();
            rs = statement.executeQuery(sql);
            while (rs.next()) {
                paciente = new Paciente();
                paciente.setIdPaciente(rs.getString("id_Paciente"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setDireccion(rs.getString("direccion"));
                paciente.setTelefono(rs.getString("telefono"));
                paciente.setApMaterno(rs.getString("ap_materno"));
                paciente.setApPaterno(rs.getString("ap_paterno"));
                paciente.setCi(rs.getString("ci"));
                paciente.setCorreo(rs.getString("correo"));

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
        return paciente;

    }

    @Override
    public boolean insertPaciente(Paciente paciente) {
        boolean res = false;
        String id_Paciente = paciente.getIdPaciente();
        String nombre = paciente.getNombre();
        String direccion = paciente.getDireccion();
        String telefono = paciente.getTelefono();
        String apPat = paciente.getApPaterno();
        String apMat = paciente.getApMaterno();
        String ci = paciente.getCi();
        String correo = paciente.getCorreo();
        ResultSet rs = null;
        Statement statement = null;
        Connection connection = SqliteDAOFactory.createConnection();
        try {
            String sql = "INSERT INTO Paciente(id_Paciente,nombre,direccion,telefono,ap_paterno,ap_materno,ci,correo)"
                    + " values('" + id_Paciente + "','" + nombre + "','" + direccion + "','" + telefono
                    + "','" + apPat + "','" + apMat + "','" + ci + "','" + correo + "');";
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
    public boolean deletePaciente(String id) {
        boolean res = false;
        ResultSet rs = null;
        Statement statement = null;
        Connection connection = SqliteDAOFactory.createConnection();
        try {
            String sql = "delete from Paciente where id_Paciente='" + id + "';";
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
    public boolean updatePaciente(Paciente paciente) {
        boolean res = false;
        String id_Paciente = paciente.getIdPaciente();
        String nombre = paciente.getNombre();
        String direccion = paciente.getDireccion();
        String telefono = paciente.getTelefono();
        String apPat = paciente.getApPaterno();
        String apMat = paciente.getApMaterno();
        String ci = paciente.getCi();
        String correo = paciente.getCorreo();
        ResultSet rs = null;
        Statement statement = null;
        Connection connection = SqliteDAOFactory.createConnection();
        try {
            String sql = "update Paciente set nombre ='" + nombre + "',direccion='" + direccion + "',telefono='" + telefono
                    + "',ap_paterno='" + apPat + "',ap_materno='" + apMat + "',ci='" + ci + "',correo='" + correo
                    + "' where id_Paciente ='" + id_Paciente + "';";
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
    public List<Paciente> getAllPacientes() {
        List<Paciente> pacientes = new ArrayList<Paciente>();
        Paciente paciente;
        String sql = "select * from Paciente";
        ResultSet rs = null;
        Statement statement = null;
        Connection connection = SqliteDAOFactory.createConnection();
        try {
            statement = connection.createStatement();
            rs = statement.executeQuery(sql);
            while (rs.next()) {
                paciente = new Paciente();
                paciente.setIdPaciente(rs.getString("id_Paciente"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setDireccion(rs.getString("direccion"));
                paciente.setTelefono(rs.getString("telefono"));
                paciente.setApMaterno(rs.getString("ap_materno"));
                paciente.setApPaterno(rs.getString("ap_paterno"));
                paciente.setCi(rs.getString("ci"));
                paciente.setCorreo(rs.getString("correo"));
                pacientes.add(paciente);
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
        return pacientes;
    }
}
