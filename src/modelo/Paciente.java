/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Machis
 */
public class Paciente extends Persona {

    private String tipoSangre;

    public void setIdPaciente(String idPaciente) {
        super.setIdPersona(idPaciente);
    }

    public String getIdPaciente() {
        return super.getIdPersona();
    }

    /**
     * @return the tipoSangre
     */
    public String getTipoSangre() {
        return tipoSangre;
    }

    /**
     * @param tipoSangre the tipoSangre to set
     */
    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    /**
     *
     * @return Descripción de la clase Paciente
     */
    @Override
    public String toString() {
        String res
                = "*** Datos Paciente *** \n"
                + "Id Paciente : " + getIdPaciente() + "\n"
                + "Nombre : " + super.getNombre() + "\n"
                + "Direccion : " + super.getDireccion() + "\n"
                + "Telefono : " + super.getTelefono() + "\n"
                + "Apellido Paterno : " + super.getApPaterno() + "\n"
                + "Apellido Materno : " + super.getApMaterno() + "\n"
                + "Ci : " + super.getCi() + "\n"
                + "Correo : " + super.getCorreo() + "\n"
                + "Fecha Nacimiento : " + super.getFnac().toString() + "\n"
                + "Tipo Sangre : " + getTipoSangre();
        return res;
    }
}
