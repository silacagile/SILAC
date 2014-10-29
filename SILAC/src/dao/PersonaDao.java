/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Machis
 */
import modelo.Persona;
import java.util.ArrayList;
import java.util.List;

public class PersonaDao {

    private static List<Persona> personas = new ArrayList<Persona>();

    public PersonaDao(List<Persona> p){
        personas = p;
    }
    
    public Persona getById(int id) {
        Persona res = null;
        for (Persona p : personas) {
            if (p.getId() == id) {
                res = p;
                break;
            }
        }
        return res;
    }
}
