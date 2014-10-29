/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import modelo.Muestra;
import java.util.List;
/**
 *
 * @author Marcelo
 */
public interface MuestraDAO {

    /**
     * Retorna todas las Muestra de un paciente dado.
     * @param idPaciente
     * @return 
     */
    public List<Muestra> getAllMuestras(String idPaciente);

    /**
     * Busca una muestra en base al paciente y la muestra.
     * @param idPaciente
     * @param idMuestra
     * @return 
     */
    public Muestra findMuestra(String idPaciente, String idMuestra);

    /**
     * Edicion de una muestra existente.
     * @param muestra
     * @return 
     */
    public boolean updateMuestra(Muestra muestra);

    /**
     * Elimina una muestra en base al paciente y la muestra.
     * @param idPaciente
     * @param idMuestra
     * @return 
     */
    public boolean deleteMuestra(String idPaciente, String idMuestra);

    /**
     * Inserta un nueva muestra a la base de datos.
     * @param muestra
     * @return 
     */
    public boolean insertMuestra(Muestra muestra);    
}
