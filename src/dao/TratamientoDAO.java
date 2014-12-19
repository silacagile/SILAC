/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.Tratamiento;

/**
 *
 * @author Jorge Aguirre
 */
public interface TratamientoDAO {
    /**
     * Saves a tratamiento in database.
     * 
     * @param tratamiento the tratamiento
     * @return 
     */
    public boolean insertTratamiento(Tratamiento tratamiento);
}
