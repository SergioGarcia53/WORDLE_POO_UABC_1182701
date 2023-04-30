/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package wordle_poo_1182701;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sgarc
 */
public class BancoPalabrasTest {
    
    public BancoPalabrasTest() {
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
     * Test of getSize method, of class BancoPalabras.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        BancoPalabras instance = new BancoPalabras();
        int expResult = 291;
        int result = instance.getSize();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getPalabra method, of class BancoPalabras.
     */
    @Test
    public void testGetPalabra() {
        System.out.println("getPalabra");
        int n = 0;
        BancoPalabras instance = new BancoPalabras();
        String expResult = "abeto";
        String result = instance.getPalabra(n);
        assertEquals(expResult, result);
        
    }
    
}
