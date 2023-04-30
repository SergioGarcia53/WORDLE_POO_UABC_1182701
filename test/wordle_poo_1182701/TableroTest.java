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
public class TableroTest {
    
    public TableroTest() {
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
     * Test of getX method, of class Tablero.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Tablero instance = new Tablero();
        int expResult = 0;
        int result = instance.getX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setX method, of class Tablero.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        int x = 0;
        Tablero instance = new Tablero();
        instance.setX(x);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of desplegarTablero method, of class Tablero.
     */
    @Test
    public void testDesplegarTablero() {
        System.out.println("desplegarTablero");
        int numIntentos = 0;
        Tablero instance = new Tablero();
        instance.desplegarTablero(numIntentos);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of desplegarTeclado method, of class Tablero.
     */
    @Test
    public void testDesplegarTeclado() {
        System.out.println("desplegarTeclado");
        Tablero instance = new Tablero();
        instance.desplegarTeclado();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of eliminarLetras method, of class Tablero.
     */
    @Test
    public void testEliminarLetras() {
        System.out.println("eliminarLetras");
        Tablero instance = new Tablero();
        instance.eliminarLetras();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of agregarLetraAEliminar method, of class Tablero.
     */
    @Test
    public void testAgregarLetraAEliminar() {
        System.out.println("agregarLetraAEliminar");
        String letra = "";
        Tablero instance = new Tablero();
        instance.agregarLetraAEliminar(letra);
        
    }
    
}
