/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Utilitarios.Configuracion;
import dao.Factory.DAOFactory;
import dao.PacienteDAO;
import java.util.List;
import modelo.Paciente;

/**
 *
 * @author Jorge Aguirre
 */
public class PacienteCtrl {

    /**
     * DAOFactory
     */
    private final DAOFactory factory;

    /**
     * PacienteDAO
     */
    private final PacienteDAO pacienteDAO;

    /**
     * El constructor
     */
    public PacienteCtrl() {
        this.factory = DAOFactory.getDAOFactory(Configuracion.DBMS);
        pacienteDAO = factory.getPacienteDAO();
    }

    /**
     * Delega la busqueda al DAO
     * 
     * @param pacienteId
     * @return 
     */
    public Paciente buscarPaciente(String pacienteId) {
        System.out.println("");
        return pacienteDAO.findPaciente(pacienteId);
    }
    
    /**
     * Delega al DAO
     *
     * @param paciente
     */
    public void insertarPaciente(Paciente paciente) {
        pacienteDAO.insertPaciente(paciente);
    }
    
     public List<Paciente> getAllPacientes() {
         return pacienteDAO.getAllPacientes();
     }
     
     public boolean updatePaciente(Paciente paciente) {
         return pacienteDAO.updatePaciente(paciente);
     }
     
     public List<Paciente> executePacienteQuery(String column, String criterio){
         return pacienteDAO.executePacienteQuery(column, criterio);
     }
}   
