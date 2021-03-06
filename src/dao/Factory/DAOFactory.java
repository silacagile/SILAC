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

/**
 *
 * @author Marcelo
 */
public abstract class DAOFactory {

    public static int POSTGRESQL = 1;
    public static int SQLITE = 2;

    public abstract EnsayoDAO getEnsayoDAO();

    public abstract MuestraDAO getMuestraDAO();

    public abstract PacienteDAO getPacienteDAO();
    
    public abstract AutentificacionDAO getAutentificacionDAO();
    
    public abstract PersonaDAO getPersonaDAO();

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
