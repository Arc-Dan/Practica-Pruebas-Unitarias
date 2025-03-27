/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mx.itson.castor.business;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author dag13
 */
public class TemperaturaTest {
    
    public TemperaturaTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    /*
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    } */

    /**
     * Test of convertirGrados method, of class Temperatura.
     */
    @org.junit.jupiter.api.Test
    public void testConvertirGrados() {
        // Nombre y descripción del caso de prueba:
        System.out.println("convertirGrados");
        
        // Datos de entrada (Inputs):
        double centigrados = 20;
        
        // Resultados esperados:
        double expResult = 68;
        
        // Resultado obtenido:
        double result = Temperatura.convertirGrados(centigrados);
        
        // Ejecución de la prueba:
        assertEquals(expResult, result, 0); //El tercer parámetro es el margen de error entre ambos resultados
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calcularPendiente method, of class Temperatura.
     */
    @Test
    public void testCalcularPendiente() {
        System.out.println("calcularPendiente");
        int x1 = 4;
        int y1 = 8;
        int x2 = 8;
        int y2 = 20;
        int expResult = 3;
        int result = Temperatura.calcularPendiente(x1, y1, x2, y2);
        assertEquals(expResult, result);
    }
    
}
