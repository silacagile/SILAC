/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Factory;

import dao.AutentificacionDAO;
import dao.EnsayoDAO;
import dao.MuestraDAO;
import dao.PacienteDAO;
import dao.PersonaDAO;
import dao.TratamientoDAO;

/**
 *
 * @author Marcelo
 */
public abstract class DAOFactory {

    public static int POSTGRESQL = 1;
    public static int SQLITE = 2;

    
    /**
     * Devuelve el DAO para un ensayo
     * @return 
     */
    public abstract EnsayoDAO getEnsayoDAO();

    
    /**
     * Devuelve el DAO para una muestra
     * @return 
     */
    public abstract MuestraDAO getMuestraDAO();

    /**
     * Devuelve el DAO para un paciente
     * @return 
     */
    public abstract PacienteDAO getPacienteDAO();
    
    /**
     * Devuelve el DAO para una autentificacion
     * @return 
     */
    public abstract AutentificacionDAO getAutentificacionDAO();
    
    /**
     * Devuelve el DAO para una persona
     * @return 
     */
    public abstract PersonaDAO getPersonaDAO();
    
    /**
     * Devuelve el DAO para un tratamiento
     * @return 
     */
    public abstract TratamientoDAO getTratamientoDAO();

    public static DAOFactory getDAOFactory(int factory) {
        switch (factory) {
            case 1:
                return new PostgresDAOFactory();

            case 2:
                return new SqliteDAOFactory();
            default:
                return null;

        }
    }
}
