/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Utilitarios.Configuracion;
import dao.AutentificacionDAO;
import dao.Factory.DAOFactory;
import java.util.Arrays;

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
    
    public boolean autentificar(String login, char[] password) {
        String dbPassword = autentificacionDAO.getPassword(login);
        return esCorrecto(password, dbPassword);
    }
    
    private boolean esCorrecto(char[] password, String dbPassword)
    {
        boolean res;
        char[] correcto = dbPassword.toCharArray();
        
        if(password.length != correcto.length)
            res = false;
        else
            res = Arrays.equals(password, correcto);
        
        Arrays.fill(correcto,'0');

        return res;
    }
}
