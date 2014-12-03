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
        try{
            return Rol.values()[value];
        }catch( ArrayIndexOutOfBoundsException e ) {
            return Rol.NA;
        }
    }
    
    public static boolean logeable(Rol value) {
        System.out.println(value);
        System.out.println(value.getValue() == Rol.NA.getValue()  || value.getValue() == Rol.DOCTOR.getValue());
        return value.getValue() != Rol.NA.getValue()  || value.getValue() != Rol.DOCTOR.getValue();
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }
}
