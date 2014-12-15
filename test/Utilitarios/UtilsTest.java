/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

import java.util.Calendar;
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
public class UtilsTest {
    
    public UtilsTest() {
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
     * Test of esDouble method, of class Utils.
     */
    @Test
    public void testEsDouble() {
        System.out.println("esDouble");
        String entrada = "";
        boolean expResult = false;
        boolean result = Utils.esDouble(entrada);
        assertEquals(expResult, result);
    }

    /**
     * Test of formatoFecha method, of class Utils.
     */
    @Test
    public void testFormatoFecha() {
        System.out.println("formatoFecha");
        String fecha = "";
        Calendar expResult = null;
        Calendar result = Utils.formatoFecha(fecha);
        assertEquals(expResult, result);
    }
    
}
