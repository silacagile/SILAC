/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.Usuario;

/**
 *
 * @author Jorge Aguirre
 */
public interface AutentificacionDAO {

    /**
     * Verifica la correcta autentificacion de un usuario al sistema
     * 
     * @param login el login
     * @param password el password
     * @return 
     */
    public Usuario getUsuario(String login);
    
}
