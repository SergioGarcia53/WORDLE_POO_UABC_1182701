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
public class palabraIntentoTest {
    
    public palabraIntentoTest() {
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
     * Test of agregarPalabra method, of class palabraIntento.
     */
    @Test
    public void testAgregarPalabra() {
        System.out.println("agregarPalabra");
        String intento = "";
        palabraIntento instance = new palabraIntento();
        instance.agregarPalabra(intento);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of imprimirIntento method, of class palabraIntento.
     */
    @Test
    public void testImprimirIntento() {
        System.out.println("imprimirIntento");
        palabraIntento instance = new palabraIntento();
        instance.imprimirIntento();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getResultado method, of class palabraIntento.
     */
    @Test
    public void testGetResultado() {
        System.out.println("getResultado");
        String intento = "";
        String objetivo = "";
        palabraIntento instance = new palabraIntento();
        
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getLetraAEliminar method, of class palabraIntento.
     */
    @Test
    public void testGetLetraAEliminar() {
        System.out.println("getLetraAEliminar");
        int i = 0;
        palabraIntento instance = new palabraIntento();
        String expResult = "";
        
       
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getSizeLetrasEliminar method, of class palabraIntento.
     */
    @Test
    public void testGetSizeLetrasEliminar() {
        System.out.println("getSizeLetrasEliminar");
        palabraIntento instance = new palabraIntento();
        int expResult = 0;
        int result = instance.getSizeLetrasEliminar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
