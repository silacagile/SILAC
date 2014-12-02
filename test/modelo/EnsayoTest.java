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
public class EnsayoTest {
    
    public EnsayoTest() {
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
     * Test of setIdEnsayo method, of class Ensayo.
     */
    @Test
    public void testSetIdEnsayo() {
        System.out.println("setIdEnsayo");
        String idEnsayo = "E1";
        Ensayo instance = new Ensayo();
        instance.setIdEnsayo(idEnsayo);
        assertEquals(idEnsayo, instance.getIdEnsayo());
    }

    /**
     * Test of setIdPaciente method, of class Ensayo.
     */
    @Test
    public void testSetIdPaciente() {
        System.out.println("setIdPaciente");
        String idPaciente = "P1";
        Ensayo instance = new Ensayo();
        instance.setIdPaciente(idPaciente);
        assertEquals(idPaciente, instance.getIdPaciente());
    }

    /**
     * Test of setIdMuestra method, of class Ensayo.
     */
    @Test
    public void testSetIdMuestra() {
        System.out.println("setIdMuestra");
        String idMuestra = "M1";
        Ensayo instance = new Ensayo();
        instance.setIdMuestra(idMuestra);
        assertEquals(idMuestra, instance.getIdMuestra());
    }

    /**
     * Test of setFechaExtraccion method, of class Ensayo.
     */
    @Test
    public void testSetFechaExtraccion() {
        System.out.println("setFechaExtraccion");
        String fechaExtraccion = "01-01-01";
        Ensayo instance = new Ensayo();
        instance.setFechaExtraccion(fechaExtraccion);
        assertEquals(fechaExtraccion, instance.getFechaExtraccion());
    }

    /**
     * Test of setTipoExtraccion method, of class Ensayo.
     */
    @Test
    public void testSetTipoExtraccion() {
        System.out.println("setTipoExtraccion");
        String tipoExtraccion = "T1";
        Ensayo instance = new Ensayo();
        instance.setTipoExtraccion(tipoExtraccion);
        assertEquals(tipoExtraccion, instance.getTipoExtraccion());
    }

    /**
     * Test of setResultado method, of class Ensayo.
     */
    @Test
    public void testSetResultado() {
        System.out.println("setResultado");
        String resultado = "R1";
        Ensayo instance = new Ensayo();
        instance.setResultado(resultado);
        assertEquals(resultado, instance.getResultado());
    }

    /**
     * Test of setNumeroExtraccion method, of class Ensayo.
     */
    @Test
    public void testSetNumeroExtraccion() {
        System.out.println("setNumeroExtraccion");
        int numeroExtraccion = 0;
        Ensayo instance = new Ensayo();
        instance.setNumeroExtraccion(numeroExtraccion);
        assertEquals(numeroExtraccion, instance.getNumeroExtraccion());
    }

    /**
     * Test of setTipoGel method, of class Ensayo.
     */
    @Test
    public void testSetTipoGel() {
        System.out.println("setTipoGel");
        String tipoGel = "TG";
        Ensayo instance = new Ensayo();
        instance.setTipoGel(tipoGel);
        assertEquals(tipoGel, instance.getTipoGel());
    }

    /**
     * Test of setFechaGel method, of class Ensayo.
     */
    @Test
    public void testSetFechaGel() {
        System.out.println("setFechaGel");
        String fechaGel = "01-01-01";
        Ensayo instance = new Ensayo();
        instance.setFechaGel(fechaGel);
        assertEquals(fechaGel, instance.getFechaGel());
    }

    /**
     * Test of getIdEnsayo method, of class Ensayo.
     */
    @Test
    public void testGetIdEnsayo() {
        System.out.println("getIdEnsayo");
        Ensayo instance = new Ensayo();
        String expResult = null;
        String result = instance.getIdEnsayo();
        assertEquals(expResult, result);
    }

    /**
     * Test of getIdPaciente method, of class Ensayo.
     */
    @Test
    public void testGetIdPaciente() {
        System.out.println("getIdPaciente");
        Ensayo instance = new Ensayo();
        String expResult = null;
        String result = instance.getIdPaciente();
        assertEquals(expResult, result);
    }

    /**
     * Test of getIdMuestra method, of class Ensayo.
     */
    @Test
    public void testGetIdMuestra() {
        System.out.println("getIdMuestra");
        Ensayo instance = new Ensayo();
        String expResult = null;
        String result = instance.getIdMuestra();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFechaExtraccion method, of class Ensayo.
     */
    @Test
    public void testGetFechaExtraccion() {
        System.out.println("getFechaExtraccion");
        Ensayo instance = new Ensayo();
        String expResult = null;
        String result = instance.getFechaExtraccion();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTipoExtraccion method, of class Ensayo.
     */
    @Test
    public void testGetTipoExtraccion() {
        System.out.println("getTipoExtraccion");
        Ensayo instance = new Ensayo();
        String expResult = null;
        String result = instance.getTipoExtraccion();
        assertEquals(expResult, result);
    }

    /**
     * Test of getResultado method, of class Ensayo.
     */
    @Test
    public void testGetResultado() {
        System.out.println("getResultado");
        Ensayo instance = new Ensayo();
        String expResult = null;
        String result = instance.getResultado();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNumeroExtraccion method, of class Ensayo.
     */
    @Test
    public void testGetNumeroExtraccion() {
        System.out.println("getNumeroExtraccion");
        Ensayo instance = new Ensayo();
        int expResult = 0;
        int result = instance.getNumeroExtraccion();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTipoGel method, of class Ensayo.
     */
    @Test
    public void testGetTipoGel() {
        System.out.println("getTipoGel");
        Ensayo instance = new Ensayo();
        String expResult = null;
        String result = instance.getTipoGel();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFechaGel method, of class Ensayo.
     */
    @Test
    public void testGetFechaGel() {
        System.out.println("getFechaGel");
        Ensayo instance = new Ensayo();
        String expResult = null;
        String result = instance.getFechaGel();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Ensayo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Ensayo instance = new Ensayo();
        String result = instance.toString();
        assertNotNull(result);
    }
    
}
