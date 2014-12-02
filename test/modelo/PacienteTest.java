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
public class PacienteTest {
    
    public PacienteTest() {
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
     * Test of setIdPaciente method, of class Paciente.
     */
    @Test
    public void testSetIdPaciente() {
        System.out.println("setIdPaciente");
        String idPaciente = "P1";
        Paciente instance = new Paciente();
        instance.setIdPaciente(idPaciente);
        assertEquals(idPaciente, instance.getIdPaciente());
    }

    /**
     * Test of getIdPaciente method, of class Paciente.
     */
    @Test
    public void testGetIdPaciente() {
        System.out.println("getIdPaciente");
        Paciente instance = new Paciente();
        String expResult = null;
        String result = instance.getIdPaciente();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTipoSangre method, of class Paciente.
     */
    @Test
    public void testGetTipoSangre() {
        System.out.println("getTipoSangre");
        Paciente instance = new Paciente();
        String expResult = null;
        String result = instance.getTipoSangre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTipoSangre method, of class Paciente.
     */
    @Test
    public void testSetTipoSangre() {
        System.out.println("setTipoSangre");
        String tipoSangre = "ORH+";
        Paciente instance = new Paciente();
        instance.setTipoSangre(tipoSangre);
        assertEquals(tipoSangre, instance.getTipoSangre());
    }

    /**
     * Test of toString method, of class Paciente.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Paciente instance = new Paciente();
        String result = instance.toString();
        assertNotNull(result);
    }
    
}
