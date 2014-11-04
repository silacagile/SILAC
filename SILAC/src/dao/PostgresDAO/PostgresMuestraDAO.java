/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.PostgresDAO;

import dao.Factory.PostgresDAOFactory;
import dao.MuestraDAO;
import java.sql.ResultSet;
import java.util.*;
import modelo.Muestra;
import java.sql.SQLException;

/**
 *
 * @author Veymar Montaño Colqu
 */
public class PostgresMuestraDAO implements MuestraDAO {
    
    public static void main(String[] args) {
        PostgresMuestraDAO p = new PostgresMuestraDAO();
        Muestra prueba = new Muestra();
        
        prueba.setIdPaciente("P1");
        prueba.setIdMuestra("1");
        prueba.setTipoTest("TEst");
        prueba.setInstrumento("ins");
        prueba.setObservaciones("obs");
        prueba.setVolMuestra(1.0);
        prueba.setResultadoFinal("res");
        prueba.setSolucionBuffer("buffer");
        prueba.setTipoMuestra("tipoM");
        
        //p.insertMuestra(prueba);
        
//        for (Muestra m : p.getAllMuestras("P1")) {
//            System.out.println(m);
//        }
    }
    
    @Override
    public List<Muestra> getAllMuestras(String idPaciente) {
        List<Muestra> muestras = new ArrayList<>();
        Muestra muestra;
        String sql = "SELECT *"
                + "FROM \"Muestra\""
                + "WHERE \"id_Paciente\" = '" + idPaciente + "';";
        
        try {
            ResultSet rs = PostgresDAOFactory.consultar(sql);
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
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("All Records successfully");
        return muestras;
    }
    
    @Override
    public Muestra findMuestra(String idPaciente, String idMuestra) {
        Muestra muestra = null;
        
        String sql = "SELECT * FROM \"Muestra\" "
                + "where \"id_Paciente\" =" + "'" + idPaciente + "' "
                + "and \"id_muestra\" =" + "'" + idMuestra + "';";
        try {
            ResultSet rs = PostgresDAOFactory.consultar(sql);
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
            System.out.println(e.getMessage() + " No se encontró la muestra específica para el paciente!");
            System.exit(0);
        }
        return muestra;
    }
    
    @Override
    public boolean updateMuestra(Muestra muestra) {
        boolean res = false;
        String sql = "update \"Muestra\" set \"id_muestra\"=" + "'" + muestra.getIdMuestra()
                + "', \"tipo_muestra\"=" + "'" + muestra.getTipoMuestra()
                + "', \"tipo_test\"=" + "'" + muestra.getTipoTest()
                + "',\"solucion_buffer\"=" + "'" + muestra.getSolucionBuffer()
                + "',instrumento=" + "'" + muestra.getInstrumento()
                + "',\"vol_muestra\"=" + "'" + muestra.getVolMuestra()
                + "',\"resultado_final\"=" + "'" + muestra.getResultadoFinal()
                + "',observaciones=" + "'" + muestra.getObservaciones() + "'"
                + "where \"id_Paciente\"='" + muestra.getIdPaciente() + "' "
                + "and \"id_muestra\"='" + muestra.getIdMuestra() + "';";
        res = PostgresDAOFactory.updateDB(sql);
        return res;
    }
    
    @Override
    public boolean deleteMuestra(String idPaciente, String idMuestra) {
        boolean res = false;
        String sql = "DELETE FROM \"Muestra\" "
                + "where \"id_Paciente\" =" + "'" + idPaciente + "' "
                + "and \"id_muestra\" =" + "'" + idMuestra + "';";
        res = PostgresDAOFactory.updateDB(sql);
        return res;
    }
    
    @Override
    public boolean insertMuestra(Muestra muestra) {
        boolean res = false;
        String sql = "insert into \"Muestra\" (\"id_muestra\",\"id_Paciente\",\"tipo_muestra\",\"tipo_test\",\"solucion_buffer\""
                + ",instrumento,\"vol_muestra\",\"resultado_final\",observaciones)"
                
                + " values('" + muestra.getIdMuestra()
                + "','" + muestra.getIdPaciente()
                + "','" + muestra.getTipoMuestra()
                + "','" + muestra.getTipoTest()
                + "','" + muestra.getSolucionBuffer()
                + "','" + muestra.getInstrumento()
                + "','" + muestra.getVolMuestra()
                + "','" + muestra.getResultadoFinal()
                + "','" + muestra.getObservaciones() + "');";
        res = PostgresDAOFactory.updateDB(sql);
        return res;
    }
}
