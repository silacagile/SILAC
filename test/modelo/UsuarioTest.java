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
public class UsuarioTest {
    
    public UsuarioTest() {
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
     * Test of setLogin method, of class Usuario.
     */
    @Test
    public void testSetLogin() {
        System.out.println("setLogin");
        String login = "login";
        Usuario instance = new Usuario();
        instance.setLogin(login);
        assertEquals(login, instance.getLogin());
    }

    /**
     * Test of getLogin method, of class Usuario.
     */
    @Test
    public void testGetLogin() {
        System.out.println("getLogin");
        Usuario instance = new Usuario();
        String expResult = null;
        String result = instance.getLogin();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPassword method, of class Usuario.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "mipass";
        Usuario instance = new Usuario();
        instance.setPassword(password);
        assertEquals(password, instance.getPassword());
    }

    /**
     * Test of getPassword method, of class Usuario.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Usuario instance = new Usuario();
        String expResult = null;
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPersona method, of class Usuario.
     */
    @Test
    public void testGetPersona() {
        System.out.println("getPersona");
        Usuario instance = new Usuario();
        Persona expResult = null;
        Persona result = instance.getPersona();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPersona method, of class Usuario.
     */
    @Test
    public void testSetPersona() {
        System.out.println("setPersona");
        Persona persona = new Persona();
        Usuario instance = new Usuario();
        instance.setPersona(persona);
        assertEquals(persona, instance.getPersona());
    }
    
}
