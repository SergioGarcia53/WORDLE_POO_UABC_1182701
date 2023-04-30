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
public class TecladoTest {
    
    public TecladoTest() {
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
     * Test of imprimirTeclado method, of class Teclado.
     */
    @Test
    public void testImprimirTeclado() {
        System.out.println("imprimirTeclado");
        Teclado instance = new Teclado();
        instance.imprimirTeclado();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of eliminarLetrasteclado method, of class Teclado.
     */
    @Test
    public void testEliminarLetrasteclado() {
        System.out.println("eliminarLetrasteclado");
        String letra = "";
        Teclado instance = new Teclado();
        instance.eliminarLetrasteclado(letra);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
