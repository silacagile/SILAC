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
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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
        paciente.setIdPaciente("P14");
        paciente.setNombre("User Test");
        paciente.setDireccion("Av. Oquendo");
        paciente.setTelefono("75612458");
        paciente.setApPaterno("Gonzales");
        paciente.setApMaterno("Vargas");
        paciente.setCi("745698");
        paciente.setCorreo("prueba@gmail.com");
        paciente.setFnac("10/01/1987");
        paciente.setTipoSangre("ORH+");

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
        /* List<Paciente> lista = p.getAllPacientes();
         for (Paciente pac : lista) {
         System.out.println(pac);
         }
         /**
         * Encontrar Paciente
         */
        Paciente pac = p.findPaciente("P14");
        System.out.println(pac);

    }

    @Override
    public Paciente findPaciente(String id) {
        // System.out.println("Dentro find");
        Paciente paciente = null;
        String sql = "SELECT * FROM Paciente, Persona where id_Paciente =" + "'" + id + "' AND Paciente.id_Paciente = Persona.id_Persona;";
        ResultSet rs = null;
        Statement statement = null;
        Connection connection = SqliteDAOFactory.createConnection();

        try {
            System.out.println("Dentro find dentro");
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
                paciente.setFnac(rs.getString("fnac"));
                paciente.setTipoSangre(rs.getString("tipo_sangre"));

            }
        } catch (SQLException e) {
            System.out.println("Error Findddddddddddddddd");
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
        System.out.println("Antes");
        String fnac = paciente.getFnac();
        System.out.println("Despues");
        String tipoSangre = paciente.getTipoSangre();
        ResultSet rs = null;
        Statement statement = null;
        Connection connection = SqliteDAOFactory.createConnection();
        try {
            String sql = "INSERT INTO Persona(id_Persona,nombre,direccion,telefono,ap_paterno,ap_materno,ci,correo,fnac)"
                    + " values('" + id_Paciente + "','" + nombre + "','" + direccion + "','" + telefono
                    + "','" + apPat + "','" + apMat + "','" + ci + "','" + correo + "','" + fnac + "');";
            statement = connection.createStatement();
            statement.executeUpdate(sql);
            sql = "INSERT INTO Paciente(id_Paciente,tipo_sangre)"
                    + " values('" + id_Paciente + "','" + tipoSangre + "');";
            statement = connection.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("Errorrrrrrrrrrrrrrrr");
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
            sql = "delete from Persona where id_Persona='" + id + "';";
            statement = connection.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("Error2");
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
        String fnac = paciente.getFnac().toString();
        String tipoSangre = paciente.getTipoSangre();
        ResultSet rs = null;
        Statement statement = null;
        Connection connection = SqliteDAOFactory.createConnection();
        try {
            String sql = "update Persona set nombre ='" + nombre + "',direccion='" + direccion + "',telefono='" + telefono
                    + "',ap_paterno='" + apPat + "',ap_materno='" + apMat + "',ci='" + ci + "',correo='" + correo + "',fnac='" + fnac
                    + "' where id_Persona ='" + id_Paciente + "';";
            statement = connection.createStatement();
            statement.executeUpdate(sql);
            sql = "update Paciente set tipo_sangre ='" + tipoSangre + "' where id_Paciente ='" + id_Paciente + "';";
            statement = connection.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("Error Aqui");
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
        String sql = "select * from Paciente , Persona WHERE Paciente.id_Paciente = Persona.id_Persona";
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
                paciente.setFnac(rs.getString("fnac"));
                paciente.setTipoSangre(rs.getString("tipo_sangre"));
                pacientes.add(paciente);
            }
        } catch (SQLException e) {
            System.out.println("Error GEt ALL");
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
