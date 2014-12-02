/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jorge Aguirre
 */
public class MuestraTest {
    
    public MuestraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getIdMuestra method, of class Muestra.
     */
    @Test
    public void testGetIdMuestra() {
        System.out.println("getIdMuestra");
        Muestra instance = new Muestra();
        String expResult = null;
        String result = instance.getIdMuestra();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdMuestra method, of class Muestra.
     */
    @Test
    public void testSetIdMuestra() {
        System.out.println("setIdMuestra");
        String idMuestra = "M1";
        Muestra instance = new Muestra();
        instance.setIdMuestra(idMuestra);
        assertEquals(idMuestra, instance.getIdMuestra());
    }

    /**
     * Test of getTipoMuestra method, of class Muestra.
     */
    @Test
    public void testGetTipoMuestra() {
        System.out.println("getTipoMuestra");
        Muestra instance = new Muestra();
        String expResult = null;
        String result = instance.getTipoMuestra();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTipoMuestra method, of class Muestra.
     */
    @Test
    public void testSetTipoMuestra() {
        System.out.println("setTipoMuestra");
        String tipoMuestra = "T1";
        Muestra instance = new Muestra();
        instance.setTipoMuestra(tipoMuestra);
        assertEquals(tipoMuestra, instance.getTipoMuestra());
    }

    /**
     * Test of getSolucionBuffer method, of class Muestra.
     */
    @Test
    public void testGetSolucionBuffer() {
        System.out.println("getSolucionBuffer");
        Muestra instance = new Muestra();
        String expResult = null;
        String result = instance.getSolucionBuffer();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSolucionBuffer method, of class Muestra.
     */
    @Test
    public void testSetSolucionBuffer() {
        System.out.println("setSolucionBuffer");
        String solucionBuffer = "SB";
        Muestra instance = new Muestra();
        instance.setSolucionBuffer(solucionBuffer);
        assertEquals(solucionBuffer, instance.getSolucionBuffer());
    }

    /**
     * Test of getInstrumento method, of class Muestra.
     */
    @Test
    public void testGetInstrumento() {
        System.out.println("getInstrumento");
        Muestra instance = new Muestra();
        String expResult = null;
        String result = instance.getInstrumento();
        assertEquals(expResult, result);
    }

    /**
     * Test of setInstrumento method, of class Muestra.
     */
    @Test
    public void testSetInstrumento() {
        System.out.println("setInstrumento");
        String instrumento = "";
        Muestra instance = new Muestra();
        instance.setInstrumento(instrumento);
        assertEquals(instrumento, instance.getInstrumento());
    }

    /**
     * Test of getVolMuestra method, of class Muestra.
     */
    @Test
    public void testGetVolMuestra() {
        System.out.println("getVolMuestra");
        Muestra instance = new Muestra();
        double expResult = 0.0;
        double result = instance.getVolMuestra();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setVolMuestra method, of class Muestra.
     */
    @Test
    public void testSetVolMuestra() {
        System.out.println("setVolMuestra");
        double volMuestra = 0.0;
        Muestra instance = new Muestra();
        instance.setVolMuestra(volMuestra);
        assertEquals(volMuestra, instance.getVolMuestra(), 0.0);
    }

    /**
     * Test of getResultadoFinal method, of class Muestra.
     */
    @Test
    public void testGetResultadoFinal() {
        System.out.println("getResultadoFinal");
        Muestra instance = new Muestra();
        String expResult = null;
        String result = instance.getResultadoFinal();
        assertEquals(expResult, result);
    }

    /**
     * Test of setResultadoFinal method, of class Muestra.
     */
    @Test
    public void testSetResultadoFinal() {
        System.out.println("setResultadoFinal");
        String resultadoFinal = "RF";
        Muestra instance = new Muestra();
        instance.setResultadoFinal(resultadoFinal);
        assertEquals(resultadoFinal, instance.getResultadoFinal());
    }

    /**
     * Test of getObservaciones method, of class Muestra.
     */
    @Test
    public void testGetObservaciones() {
        System.out.println("getObservaciones");
        Muestra instance = new Muestra();
        String expResult = null;
        String result = instance.getObservaciones();
        assertEquals(expResult, result);
    }

    /**
     * Test of setObservaciones method, of class Muestra.
     */
    @Test
    public void testSetObservaciones() {
        System.out.println("setObservaciones");
        String observaciones = "O1";
        Muestra instance = new Muestra();
        instance.setObservaciones(observaciones);
        assertEquals(observaciones, instance.getObservaciones());
    }

    /**
     * Test of toString method, of class Muestra.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Muestra instance = new Muestra();
        String result = instance.toString();
        assertNotNull(result);
    }

    /**
     * Test of getIdPaciente method, of class Muestra.
     */
    @Test
    public void testGetIdPaciente() {
        System.out.println("getIdPaciente");
        Muestra instance = new Muestra();
        String expResult = null;
        String result = instance.getIdPaciente();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdPaciente method, of class Muestra.
     */
    @Test
    public void testSetIdPaciente() {
        System.out.println("setIdPaciente");
        String idPaciente = "P1";
        Muestra instance = new Muestra();
        instance.setIdPaciente(idPaciente);
        assertEquals(idPaciente, instance.getIdPaciente());
    }

    /**
     * Test of getTipoTest method, of class Muestra.
     */
    @Test
    public void testGetTipoTest() {
        System.out.println("getTipoTest");
        Muestra instance = new Muestra();
        String expResult = null;
        String result = instance.getTipoTest();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTipoTest method, of class Muestra.
     */
    @Test
    public void testSetTipoTest() {
        System.out.println("setTipoTest");
        String tipoTest = "T1";
        Muestra instance = new Muestra();
        instance.setTipoTest(tipoTest);
        assertEquals(tipoTest, instance.getTipoTest());
    }
    
}
