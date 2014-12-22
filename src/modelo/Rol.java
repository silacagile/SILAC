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
public enum Rol {
    ADMINISTRADOR(0),
    DOCTOR(1),
    ANALISTA(2),
    SECRETARIA(7),
    NA(8);
    
    private final int value;
    
    Rol(int value) {
        this.value = value;
    }
    
    public static Rol fromValue(int value) {
        Rol res = null;

        for (Rol rol : Rol.values()) {
            if (rol.getValue() == value) {
                res = rol;
                break;
            }
        }
        
        return res;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }
}
