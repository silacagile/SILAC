/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.SQLiteDAO;

import dao.Factory.SqliteDAOFactory;
import dao.PacienteDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import modelo.Paciente;
import java.util.ArrayList;

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
        ResultSet rs;
        try {
            rs = SqliteDAOFactory.consultar(sql);
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
            SqliteDAOFactory.close();
        } catch (SQLException e) {
            System.out.println("Error");
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        } finally{
           
            SqliteDAOFactory.close();
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

        String sql = "INSERT INTO Paciente(id_Paciente,nombre,direccion,telefono,ap_paterno,ap_materno,ci,correo)"
                + " values('" + id_Paciente + "','" + nombre + "','" + direccion + "','" + telefono
                + "','" + apPat + "','" + apMat + "','" + ci + "','" + correo + "');";
        res = SqliteDAOFactory.updateDB(sql);
        SqliteDAOFactory.close();
        return res;
    }

    @Override
    public boolean deletePaciente(String id) {
        boolean res = false;
        String sql = "delete from Paciente where id_Paciente='" + id + "';";
        res = SqliteDAOFactory.updateDB(sql);
        SqliteDAOFactory.close();
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
        String sql = "update Paciente set nombre ='" + nombre + "',direccion='" + direccion + "',telefono='" + telefono
                + "',ap_paterno='" + apPat + "',ap_materno='" + apMat + "',ci='" + ci + "',correo='" + correo
                + "' where id_Paciente ='" + id_Paciente + "';";
        res = SqliteDAOFactory.updateDB(sql);
        SqliteDAOFactory.close();
        return res;
    }

    @Override
    public List<Paciente> getAllPacientes() {
        List<Paciente> pacientes = new ArrayList<Paciente>();
        Paciente paciente;
        String sql = "select * from Paciente";
        try {
            ResultSet rs = SqliteDAOFactory.consultar(sql);
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
            SqliteDAOFactory.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return pacientes;
    }

}
