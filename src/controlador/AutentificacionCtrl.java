/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Utilitarios.Configuracion;
import dao.AutentificacionDAO;
import dao.Factory.DAOFactory;

/**
 *
 * @author Jorge Aguirre
 */
public class AutentificacionCtrl {
    
    /**
     * DAOFactory
     */
    private final DAOFactory factory;
    
    /**
     * AutentificacionDAO
     */
    private final AutentificacionDAO autentificacionDAO;
    
    
    /**
     * El constructor
     */
    public AutentificacionCtrl() {
        this.factory = DAOFactory.getDAOFactory(Configuracion.DBMS);
        autentificacionDAO = factory.getAutentificacionDAO();
    }
    
    public boolean autentificar(String login, String password) {
        return autentificacionDAO.autentificar(login, password);
    }
}
