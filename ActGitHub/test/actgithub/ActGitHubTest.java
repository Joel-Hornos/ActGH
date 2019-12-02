/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actgithub;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Joel
 */
public class ActGitHubTest {
    
    public ActGitHubTest() {
    }
    
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
    }

    /**
     * Test of main method, of class ActGitHub.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ActGitHub.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sumar method, of class ActGitHub.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        int a = 1;
        int b = 2;
        int expResult = 0;
        int result = ActGitHub.sumar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");//
    }

    /**
     * Test of multiplicar method, of class ActGitHub.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int a = 3;
        int b = 3;
        int expResult = 0;
        int result = ActGitHub.multiplicar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");//
    }
    
}
