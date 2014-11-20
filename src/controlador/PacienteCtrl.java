/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Utilitarios.Configuracion;
import dao.Factory.DAOFactory;
import dao.PacienteDAO;
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
}
