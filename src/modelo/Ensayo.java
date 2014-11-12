/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Daniel Rocha
 */
public class Ensayo {

    private String idEnsayo;
    private String idPaciente;
    private String idMuestra;
    private String fechaExtraccion;
    private String tipoExtraccion;
    private String resultado;
    private int numeroExtraccion;
    private String tipoGel;
    private String fechaGel;

    public Ensayo() {
    }

    ;

    public Ensayo(String idEnsayo, String idPaciente, String idMuestra,
            String fechaExtraccion, String tipoExtraccion, String resultado,
            int numeroExtraccion, String tipoGel, String fechaGel) {
        this.idEnsayo = idEnsayo;
        this.idPaciente = idPaciente;
        this.idMuestra = idMuestra;
        this.fechaExtraccion = fechaExtraccion;
        this.tipoExtraccion = tipoExtraccion;
        this.resultado = resultado;
        this.numeroExtraccion = numeroExtraccion;
        this.tipoGel = tipoGel;
        this.fechaGel = fechaGel;
    }

    public void setIdEnsayo(String idEnsayo) {
        this.idEnsayo = idEnsayo;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    public void setIdMuestra(String idMuestra) {
        this.idMuestra = idMuestra;
    }

    public void setFechaExtraccion(String fechaExtraccion) {
        this.fechaExtraccion = fechaExtraccion;
    }

    public void setTipoExtraccion(String tipoExtraccion) {
        this.tipoExtraccion = tipoExtraccion;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public void setNumeroExtraccion(int numeroExtraccion) {
        this.numeroExtraccion = numeroExtraccion;
    }

    public void setTipoGel(String tipoGel) {
        this.tipoGel = tipoGel;
    }

    public void setFechaGel(String fechaGel) {
        this.fechaGel = fechaGel;
    }

    public String getIdEnsayo() {
        return idEnsayo;
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public String getIdMuestra() {
        return idMuestra;
    }

    public String getFechaExtraccion() {
        return fechaExtraccion;
    }

    public String getTipoExtraccion() {
        return tipoExtraccion;
    }

    public String getResultado() {
        return resultado;
    }

    public int getNumeroExtraccion() {
        return numeroExtraccion;
    }

    public String getTipoGel() {
        return tipoGel;
    }

    public String getFechaGel() {
        return fechaGel;
    }

    @Override
    public String toString() {
        String res = "*** ENSAYO ***\n"
                + "Id Paciente: " + idPaciente + "\n"
                + "Id Muestra: " + idMuestra + "\n"
                + "Id_Ensayo:  " + idEnsayo + "\n"
                + "Fecha Extraccion " + fechaExtraccion + "\n"
                + "Tipo Extraccion: " + tipoExtraccion + "\n"
                + "Fecha Gel:" + fechaGel + "\n"
                + "Numero Extraccion:" + numeroExtraccion + "\n"
                + "Tipo Gel: " + tipoGel + "\n"
                + "Resultado:" + resultado + "\n";
        return res;
    }
}
