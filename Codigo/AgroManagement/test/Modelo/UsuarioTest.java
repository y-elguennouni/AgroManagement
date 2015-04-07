/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author platon
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
     * Test of getUsuario method, of class Usuario.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        Usuario instance = new Usuario("Raul","contraseña", false);
        String expResult = "Raul";
        String result = instance.getUsuario();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPassword method, of class Usuario.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Usuario instance = new Usuario("Raul","contraseña", false);
        String expResult = "contraseña";
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAdmin method, of class Usuario.
     */
    @Test
    public void testGetAdmin() {
        System.out.println("getAdmin");
        Usuario instance = new Usuario("Raul","contraseña", false);
        boolean expResult = false;
        boolean result = instance.getAdmin();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUsuario method, of class Usuario.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        String usuario = "Jose";
        Usuario instance = new Usuario("Raul","contraseña", false);
        instance.setUsuario(usuario);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(usuario, instance.getUsuario());
    }

    /**
     * Test of setPassword method, of class Usuario.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "pass";
        Usuario instance = new Usuario("Raul","contraseña", false);
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(password, instance.getPassword());
    }

    /**
     * Test of setAdmin method, of class Usuario.
     */
    @Test
    public void testSetAdmin() {
        System.out.println("setAdmin");
        boolean admin = true;
        Usuario instance = new Usuario("Raul","contraseña", false);
        instance.setAdmin(admin);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(admin, instance.getAdmin());
    }
    
}
