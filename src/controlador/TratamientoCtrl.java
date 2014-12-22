/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Utilitarios.Configuracion;
import dao.Factory.DAOFactory;
import dao.TratamientoDAO;
import modelo.Tratamiento;

/**
 *
 * @author Jorge Aguirre
 */
public class TratamientoCtrl {
    
    /**
     * DAOFactory
     */
    private final DAOFactory factory;

    /**
     * EnsayoDAO
     */
    private final TratamientoDAO tratamientoDAO;
    
    public TratamientoCtrl() {
        this.factory = DAOFactory.getDAOFactory(Configuracion.DBMS);
        tratamientoDAO = factory.getTratamientoDAO();
    }
    
    /**
     * 
     * @param tratamiento
     * @return 
     */
    public boolean guardarTratamiento(Tratamiento tratamiento) {
        return tratamientoDAO.insertTratamiento(tratamiento);
    }
}
