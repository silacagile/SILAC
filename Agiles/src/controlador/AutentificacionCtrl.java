/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Utilitarios.Configuracion;
import dao.AutentificacionDAO;
import dao.Factory.DAOFactory;
import dao.PersonaDAO;
import java.util.Arrays;
import modelo.Persona;
import modelo.Usuario;

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
    
    private final PersonaDAO personaDAO;
    
    
    /**
     * El constructor
     */
    public AutentificacionCtrl() {
        this.factory = DAOFactory.getDAOFactory(Configuracion.DBMS);
        autentificacionDAO = factory.getAutentificacionDAO();
        personaDAO = factory.getPersonaDAO();
    }
    
    public Usuario autentificar(String login, char[] password) {
        Usuario usuario = autentificacionDAO.getUsuario(login);

        if (usuario != null) {
            // Load Persona data
            Persona persona = personaDAO.buscarPersona(usuario.getPersona().getIdPersona());
            System.out.println(persona.getRol());
            usuario.setPersona(persona);

            if (esCorrecto(password, usuario.getPassword())) {
                return usuario;
            }
        }

        return null;
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
