/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Utilitarios.Configuracion;
import dao.EnsayoDAO;
import dao.Factory.DAOFactory;
import modelo.Ensayo;

/**
 *
 * @author Jorge Aguirre
 */
public class EnsayoCtrl {

    /**
     * DAOFactory
     */
    private final DAOFactory factory;

    /**
     * EnsayoDAO
     */
    private final EnsayoDAO ensayoDAO;

    /**
     * El constructor
     */
    public EnsayoCtrl() {
        this.factory = DAOFactory.getDAOFactory(Configuracion.DBMS);
        ensayoDAO = factory.getEnsayoDAO();
    }

    /**
     * Delega al DAO
     *
     * @param pacienteId
     * @param muestraId
     * @param idEnsayo
     * @return
     */
    public Ensayo buscarEnsayo(String pacienteId, String muestraId, String idEnsayo) {
        return ensayoDAO.findEnsayo(pacienteId, muestraId, idEnsayo);
    }

    /**
     * Delega al DAO
     * 
     * @param ensayo 
     */
    public void updateEnsayo(Ensayo ensayo) {
        ensayoDAO.updateEnsayo(ensayo);
    }

    /**
     * Delega al DAO
     * 
     * @param ensayo 
     */
    public void insertarEnsayo(Ensayo ensayo) {
        ensayoDAO.insertEnsayo(ensayo);
    }
}
