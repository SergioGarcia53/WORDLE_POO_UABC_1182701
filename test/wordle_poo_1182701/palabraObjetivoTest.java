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
public class palabraObjetivoTest {
    
    public palabraObjetivoTest() {
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
     * Test of getPalabraObjetivo method, of class palabraObjetivo.
     */
    @Test
    public void testGetPalabraObjetivo() {
        System.out.println("getPalabraObjetivo");
        palabraObjetivo instance = new palabraObjetivo();
        String expResult = "";
        String result = instance.getPalabraObjetivo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of setPalabraObjetivo method, of class palabraObjetivo.
     */
    @Test
    public void testSetPalabraObjetivo() {
        System.out.println("setPalabraObjetivo");
        String palabraObjetivo = "";
        palabraObjetivo instance = new palabraObjetivo();
        instance.setPalabraObjetivo(palabraObjetivo);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of toString method, of class palabraObjetivo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        palabraObjetivo instance = new palabraObjetivo();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
