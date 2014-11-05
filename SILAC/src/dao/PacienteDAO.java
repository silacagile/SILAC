/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import modelo.Paciente;

/**
 *
 * @author Marcelo
 */
public interface PacienteDAO {

    /**
     * Retorna un paciente en base a su id.
     *
     * @param id
     * @return Paciente si se encontró, null si no se encontró
     */
    public Paciente findPaciente(String id);

    /**
     * Añade un paciente nuevo.
     *
     * @param paciente
     * @return
     */
    public boolean insertPaciente(Paciente paciente);

    /**
     * Elimina un paciente dado su id.
     *
     * @param id
     * @return
     */
    public boolean deletePaciente(String id);

    /**
     * Edicion de un paciente dado.
     *
     * @param paciente
     * @return
     */
    public boolean updatePaciente(Paciente paciente);

    /**
     * Retorna todos los pacientes.
     *
     * @return
     */
    public List<Paciente> getAllPacientes();

}
