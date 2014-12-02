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
public class DoctorTest {
    
    public DoctorTest() {
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
     * Test of setIdDoctor method, of class Doctor.
     */
    @Test
    public void testSetIdDoctor() {
        System.out.println("setIdDoctor");
        String idDoctor = "D1";
        Doctor instance = new Doctor();
        instance.setIdDoctor(idDoctor);
        assertEquals(idDoctor, instance.getIdDoctor());
    }

    /**
     * Test of getIdDoctor method, of class Doctor.
     */
    @Test
    public void testGetIdDoctor() {
        System.out.println("getIdDoctor");
        Doctor instance = new Doctor();
        String expResult = null;
        String result = instance.getIdDoctor();
        assertEquals(expResult, result);
    }

    /**
     * Test of getGrado method, of class Doctor.
     */
    @Test
    public void testGetGrado() {
        System.out.println("getGrado");
        Doctor instance = new Doctor();
        String expResult = null;
        String result = instance.getGrado();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGrado method, of class Doctor.
     */
    @Test
    public void testSetGrado() {
        System.out.println("setGrado");
        String grado = "Grado1";
        Doctor instance = new Doctor();
        instance.setGrado(grado);
        assertEquals(grado, instance.getGrado());
    }

    /**
     * Test of getEspecialidad method, of class Doctor.
     */
    @Test
    public void testGetEspecialidad() {
        System.out.println("getEspecialidad");
        Doctor instance = new Doctor();
        String expResult = null;
        String result = instance.getEspecialidad();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEspecialidad method, of class Doctor.
     */
    @Test
    public void testSetEspecialidad() {
        System.out.println("setEspecialidad");
        String especialidad = "Esp1";
        Doctor instance = new Doctor();
        instance.setEspecialidad(especialidad);
        assertEquals(especialidad, instance.getEspecialidad());
    }
    
}
