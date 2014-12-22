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
public class Tratamiento {
    private String idTratamiento;
    private String idMuestra;
    private String idPaciente;
    private String idDoctor;
    private String fechaTratamiento;
    private String descripcion;

    /**
     * @return the idTratamiento
     */
    public String getIdTratamiento() {
        return idTratamiento;
    }

    /**
     * @param idTratamiento the idTratamiento to set
     */
    public void setIdTratamiento(String idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    /**
     * @return the idMuestra
     */
    public String getIdMuestra() {
        return idMuestra;
    }

    /**
     * @param idMuestra the idMuestra to set
     */
    public void setIdMuestra(String idMuestra) {
        this.idMuestra = idMuestra;
    }

    /**
     * @return the idPaciente
     */
    public String getIdPaciente() {
        return idPaciente;
    }

    /**
     * @param idPaciente the idPaciente to set
     */
    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    /**
     * @return the idDoctor
     */
    public String getIdDoctor() {
        return idDoctor;
    }

    /**
     * @param idDoctor the idDoctor to set
     */
    public void setIdDoctor(String idDoctor) {
        this.idDoctor = idDoctor;
    }

    /**
     * @return the fechaTratamiento
     */
    public String getFechaTratamiento() {
        return fechaTratamiento;
    }

    /**
     * @param fechaTratamiento the fechaTratamiento to set
     */
    public void setFechaTratamiento(String fechaTratamiento) {
        this.fechaTratamiento = fechaTratamiento;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
