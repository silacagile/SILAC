/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;
import dao.*;
import modelo.Persona;
/**
 *
 * @author Machis
 */
public class PersonaController {
    private final PersonaDao personaDao;

    public PersonaController(PersonaDao p){
        personaDao = p;
    }
    
    public Persona getPersona(int id){
        return personaDao.getById(id);
    }
    
}
