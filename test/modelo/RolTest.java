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
public class RolTest {
    
    public RolTest() {
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
     * Test of values method, of class Rol.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        Rol[] expResult = {Rol.ADMINISTRADOR, Rol.DOCTOR, Rol.ANALISTA, Rol.SECRETARIA, Rol.NA};
        Rol[] result = Rol.values();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of fromValue method, of class Rol.
     */
    @Test
    public void testFromValue() {
        System.out.println("fromValue");
        int value = 0;
        Rol expResult = Rol.ADMINISTRADOR;
        Rol result = Rol.fromValue(value);
        assertEquals(expResult, result);
    }  
}
