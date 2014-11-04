/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Veymar Montaño Colqu
 */
public class Muestra {
    
    private String idPaciente;
    private String idMuestra;
    private String tipoMuestra;
    private String tipoTest;
    private String solucionBuffer;
    private String instrumento;
    private double volMuestra;
    private String resultadoFinal;
    private String observaciones;

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
     * @return the tipoMuestra
     */
    public String getTipoMuestra() {
        return tipoMuestra;
    }

    /**
     * @param tipoMuestra the tipoMuestra to set
     */
    public void setTipoMuestra(String tipoMuestra) {
        this.tipoMuestra = tipoMuestra;
    }

    /**
     * @return the solucionBuffer
     */
    public String getSolucionBuffer() {
        return solucionBuffer;
    }

    /**
     * @param solucionBuffer the solucionBuffer to set
     */
    public void setSolucionBuffer(String solucionBuffer) {
        this.solucionBuffer = solucionBuffer;
    }

    /**
     * @return the instrumento
     */
    public String getInstrumento() {
        return instrumento;
    }

    /**
     * @param instrumento the instrumento to set
     */
    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    /**
     * @return the volMuestra
     */
    public double getVolMuestra() {
        return volMuestra;
    }

    /**
     * @param volMuestra the volMuestra to set
     */
    public void setVolMuestra(double volMuestra) {
        this.volMuestra = volMuestra;
    }

    /**
     * @return the resultadoFinal
     */
    public String getResultadoFinal() {
        return resultadoFinal;
    }

    /**
     * @param resultadoFinal the resultadoFinal to set
     */
    public void setResultadoFinal(String resultadoFinal) {
        this.resultadoFinal = resultadoFinal;
    }

    /**
     * @return the observaciones
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * @param observaciones the observaciones to set
     */
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    @Override
    public String toString(){
        String res = "Id Paciente : " + idPaciente + "\n" +
                    "Id Muestra : " + idMuestra+ "\n"  +
                    "Tipo de Muestra : " + tipoMuestra  + "\n" +
                    "Solucion Buffer : " + solucionBuffer + "\n" +
                    "Instrumento : " + instrumento + "\n" +
                    "Volumen de la Muestra : " + volMuestra + "\n" +
                    "Resultado Final : " + resultadoFinal + "\n" +
                    "Observaciones : " + observaciones + "\n";
        return res;
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
     * @return the tipoTest
     */
    public String getTipoTest() {
        return tipoTest;
    }

    /**
     * @param tipoTest the tipoTest to set
     */
    public void setTipoTest(String tipoTest) {
        this.tipoTest = tipoTest;
    }
}
