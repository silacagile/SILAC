/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Jorge Aguirre
 */
public class Rol {

    private int idRol;
    private String name;
    
    public Rol() {}
    
    public Rol(int idRol, String name) {
        this.idRol = idRol;
        this.name = name;
    }
    
    public int getIdRol() {
        return this.idRol;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
}
