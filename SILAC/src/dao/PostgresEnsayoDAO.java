/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import controlador.PostgresConn;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Ensayo;

/**
 *
 * @author Daniel Rocha
 */
public class PostgresEnsayoDAO implements EnsayoDAO {

    PostgresConn db = new PostgresConn();

    public static void main(String[] args) {
        PostgresEnsayoDAO en = new PostgresEnsayoDAO();
        //en.insertEnsayo(new Ensayo("1", "P1", "1", "20/10/2014", "frghj", "posi", 5, "gelo", "20/10/2014"));
        //en.updateEnsayo(new Ensayo("2", "P1", "1", "20/10/2013", "modif", "negative", 10, "notgelo", "20/10/2014"));
        //en.deleteEnsayo("1", "1", "P1");
        System.out.println(en.findEnsayo("P4", "2", "2"));
       // for (Ensayo e : en.getAllEnsayos("P1", "1")) {
        //    System.out.println(e);
        //}
    }

    @Override
    public Ensayo findEnsayo(String idPaciente, String idMuestra, String idEnsayo) {
        Ensayo ensayo = null;
        String sql = "SELECT * "
                + "FROM \"ensayo\" "
                + "WHERE \"id_Paciente\" = " + "'" + idPaciente + "' "
                + " and \"id_muestra\" = " + "'" + idMuestra + "' "
                + " and \"id_ensayo\" = " + "'" + idEnsayo + "'; ";
        try {
            ResultSet rs = db.conectar().consultar(sql);
            if (rs.next()) {
                ensayo = new Ensayo();
                ensayo.setIdEnsayo(rs.getString(1));
                ensayo.setIdPaciente(rs.getString(2));
                ensayo.setIdMuestra(rs.getString(3));;
                ensayo.setFechaExtraccion(rs.getString(4));
                ensayo.setTipoExtraccion(rs.getString(5));
                ensayo.setResultado(rs.getString(6));
                ensayo.setNumeroExtraccion(rs.getInt(7));
                ensayo.setTipoGel(rs.getString(8));
                ensayo.setFechaGel(rs.getString(9));
            }
        } catch (SQLException e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return ensayo;
    }

    @Override
    public boolean insertEnsayo(Ensayo ensayo) {
        boolean res = false;
        String sql = "INSERT INTO ensayo VALUES('" + ensayo.getIdEnsayo() + "', '"
                + ensayo.getIdMuestra() + "', '" + ensayo.getIdPaciente() + "', '"
                + ensayo.getFechaExtraccion() + "', '" + ensayo.getTipoExtraccion() + "','"
                + ensayo.getResultado() + "', " + ensayo.getNumeroExtraccion() + ", '"
                + ensayo.getTipoGel() + "', '" + ensayo.getFechaGel() + "');";
        res = db.conectar().updateDB(sql);
        return res;
    }

    @Override
    public boolean deleteEnsayo(String idEnsayo, String idMuestra, String idPaciente) {
        boolean res = false;
        String sql = "DELETE FROM ensayo WHERE \"id_ensayo\" ='" + idEnsayo + "' AND "
                + "\"id_muestra\" = '" + idMuestra + "' AND " + "\"id_Paciente\" = '" + idPaciente + "';";
        res = db.conectar().updateDB(sql);
        return res;
    }

    @Override
    public boolean updateEnsayo(Ensayo ensayo) {
        boolean res = false;
        String sql = "UPDATE ensayo SET extraccion_fecha ='" + ensayo.getFechaExtraccion()
                + "', extraccion_tipo='" + ensayo.getTipoExtraccion() + "', "
                + "resultado ='" + ensayo.getResultado() + "', numero_extraccion ="
                + ensayo.getNumeroExtraccion() + ", gel_tipo ='" + ensayo.getTipoGel()
                + "', gel_fecha ='" + ensayo.getFechaGel() + "' "
                + "WHERE \"id_ensayo\" ='" + ensayo.getIdEnsayo() + "' AND "
                + "\"id_muestra\" = '" + ensayo.getIdMuestra() + "' AND "
                + "\"id_Paciente\" = '" + ensayo.getIdPaciente() + "';";
        res = db.conectar().updateDB(sql);
        return res;
    }

    @Override
    public List<Ensayo> getAllEnsayos(String idPaciente, String idMuestra) {
        List<Ensayo> ensayos = new ArrayList<Ensayo>();
        Ensayo ensayo = new Ensayo();
        //Recorre todos los ensayos posibles para una muestra y los agrega si es que existan
        for (int i = 1; i <= 5; i++) {
            ensayo = findEnsayo(idPaciente, idMuestra, Integer.toString(i));
            if (ensayo != null) {
                ensayos.add(ensayo);
            }
        }
        return ensayos;
    }
}
