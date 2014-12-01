/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.Persona;

/**
 *
 * @author Jorge Aguirre
 */
public interface PersonaDAO {
    
    /**
     * Buscar una persona por su id.
     * 
     * @param id
     * @return 
     */
    public Persona buscarPersona(String id);
}
