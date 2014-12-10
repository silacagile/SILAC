/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Utilitarios.Configuracion;
import dao.Factory.DAOFactory;
import dao.MuestraDAO;
import java.util.List;
import modelo.Muestra;

/**
 *
 * @author Jorge Aguirre
 */
public class MuestraCtrl {

    /**
     * DAOFactory
     */
    private final DAOFactory factory;

    /**
     * MuestraDAO
     */
    private final MuestraDAO muestraDAO;

    /**
     * El constructor
     */
    public MuestraCtrl() {
        this.factory = DAOFactory.getDAOFactory(Configuracion.DBMS);
        muestraDAO = factory.getMuestraDAO();
    }

    /**
     * Delega la creacion de la muestra a su respectivo DAO
     *
     * @param muestra
     */
    public void insertarMuestra(Muestra muestra) {
        muestraDAO.insertMuestra(muestra);
    }

    /**
     * Delega la edicion de la muestra al DAO
     *
     * @param muestra
     */
    public void updateMuestra(Muestra muestra) {
        muestraDAO.updateMuestra(muestra);
    }

    /**
     * Delega al DAO
     * 
     * @param pacienteId
     * @param muestraId
     * @return 
     */
    public Muestra buscarMuestra(String pacienteId, String muestraId) {
        return muestraDAO.findMuestra(pacienteId, muestraId);
    }
    
    public List<Muestra> getAllMuestras(String idPaciente){
        return muestraDAO.getAllMuestras(idPaciente);
    }
}
