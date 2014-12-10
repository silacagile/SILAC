/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import modelo.Ensayo;

/**
 * @author Daniel Rocha
 */
public interface EnsayoDAO {

    /**
     * Busqueda de un ensayo en base al paciente, muestra y el ensayo.
     *
     * @param idPaciente
     * @param idMuestra
     * @param idEnsayo
     * @return Null if its not in the database
     */
    public Ensayo findEnsayo(String idPaciente, String idMuestra, String idEnsayo);

    /**
     * Inserta un nuevo ensayo.
     *
     * @param ensayo
     * @return
     */
    public boolean insertEnsayo(Ensayo ensayo);

    /**
     * Edicion de un ensayo.
     *
     * @param ensayo
     * @return true if Succeed
     */
    public boolean updateEnsayo(Ensayo ensayo);

    /**
     * Dado el id del ensayo, se eliminara el registro de la base de datos
     *
     * @param idEnsayo
     * @param idMuestra
     * @param idPaciente
     * @return true if Succeed
     */
    public boolean deleteEnsayo(String idEnsayo, String idMuestra, String idPaciente);

    /**
     * Retorna todos los ensayos de un paciente y su muestra.
     *
     * @param idPaciente
     * @param idMuestra
     * @return retorna los ensayos de una muestra tomada a un paciente
     */
    public List<Ensayo> getAllEnsayos(String idPaciente, String idMuestra);
}
