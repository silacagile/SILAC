/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

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
public class EmailValidatorTest {
    
    public EmailValidatorTest() {
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
     * Test of validate method, of class EmailValidator.
     */
    @Test
    public void testValidateFalse() {
        System.out.println("validate");
        // Empty string should not passed the validation
        String hex = "";
        EmailValidator instance = new EmailValidator();
        boolean expResult = true;
        boolean result = instance.validate(hex);
    }
    
}
