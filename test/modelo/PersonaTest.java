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
public class PersonaTest {
    
    public PersonaTest() {
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
     * Test of getIdPersona method, of class Persona.
     */
    @Test
    public void testGetIdPersona() {
        System.out.println("getIdPersona");
        Persona instance = new Persona();
        String expResult = null;
        String result = instance.getIdPersona();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdPersona method, of class Persona.
     */
    @Test
    public void testSetIdPersona() {
        System.out.println("setIdPersona");
        String idPersona = "P1";
        Persona instance = new Persona();
        instance.setIdPersona(idPersona);
        assertEquals(idPersona, instance.getIdPersona());
    }

    /**
     * Test of getNombre method, of class Persona.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Persona instance = new Persona();
        String expResult = null;
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombre method, of class Persona.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "Juan";
        Persona instance = new Persona();
        instance.setNombre(nombre);
        assertEquals(nombre, instance.getNombre());
    }

    /**
     * Test of getDireccion method, of class Persona.
     */
    @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        Persona instance = new Persona();
        String expResult = null;
        String result = instance.getDireccion();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDireccion method, of class Persona.
     */
    @Test
    public void testSetDireccion() {
        System.out.println("setDireccion");
        String direccion = "Av. Blanco Galindo";
        Persona instance = new Persona();
        instance.setDireccion(direccion);
        assertEquals(direccion, instance.getDireccion());
    }

    /**
     * Test of getTelefono method, of class Persona.
     */
    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        Persona instance = new Persona();
        String expResult = null;
        String result = instance.getTelefono();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTelefono method, of class Persona.
     */
    @Test
    public void testSetTelefono() {
        System.out.println("setTelefono");
        String telefono = "4351205";
        Persona instance = new Persona();
        instance.setTelefono(telefono);
        assertEquals(telefono, instance.getTelefono());
    }

    /**
     * Test of getApPaterno method, of class Persona.
     */
    @Test
    public void testGetApPaterno() {
        System.out.println("getApPaterno");
        Persona instance = new Persona();
        String expResult = null;
        String result = instance.getApPaterno();
        assertEquals(expResult, result);
    }

    /**
     * Test of setApPaterno method, of class Persona.
     */
    @Test
    public void testSetApPaterno() {
        System.out.println("setApPaterno");
        String apPaterno = "Jaldin";
        Persona instance = new Persona();
        instance.setApPaterno(apPaterno);
        assertEquals(apPaterno, instance.getApPaterno());
    }

    /**
     * Test of getApMaterno method, of class Persona.
     */
    @Test
    public void testGetApMaterno() {
        System.out.println("getApMaterno");
        Persona instance = new Persona();
        String expResult = null;
        String result = instance.getApMaterno();
        System.out.println(result);
        assertEquals(expResult, result);
    }

    /**
     * Test of setApMaterno method, of class Persona.
     */
    @Test
    public void testSetApMaterno() {
        System.out.println("setApMaterno");
        String apMaterno = "Robles";
        Persona instance = new Persona();
        instance.setApMaterno(apMaterno);
        assertEquals(apMaterno, instance.getApMaterno());
    }

    /**
     * Test of getCi method, of class Persona.
     */
    @Test
    public void testGetCi() {
        System.out.println("getCi");
        Persona instance = new Persona();
        String expResult = null;
        String result = instance.getCi();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCi method, of class Persona.
     */
    @Test
    public void testSetCi() {
        System.out.println("setCi");
        String ci = "65221558";
        Persona instance = new Persona();
        instance.setCi(ci);
        assertEquals(ci, instance.getCi());
    }

    /**
     * Test of getCorreo method, of class Persona.
     */
    @Test
    public void testGetCorreo() {
        System.out.println("getCorreo");
        Persona instance = new Persona();
        String expResult = null;
        String result = instance.getCorreo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCorreo method, of class Persona.
     */
    @Test
    public void testSetCorreo() {
        System.out.println("setCorreo");
        String correo = "";
        Persona instance = new Persona();
        instance.setCorreo(correo);
        assertEquals(correo, instance.getCorreo());
    }

    /**
     * Test of getFnac method, of class Persona.
     */
    @Test
    public void testGetFnac() {
        System.out.println("getFnac");
        Persona instance = new Persona();
        String expResult = null;
        String result = instance.getFnac();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFnac method, of class Persona.
     */
    @Test
    public void testSetFnac() {
        System.out.println("setFnac");
        String fnac = "2014-01-01";
        Persona instance = new Persona();
        instance.setFnac(fnac);
        assertEquals(fnac, instance.getFnac());
    }
    
}
