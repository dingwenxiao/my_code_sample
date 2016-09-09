/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9.utils;

import dingwen.utils.InputValidator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dingwen
 */
public class InputValidatorTest {
    
    public InputValidatorTest() {
        
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
     * Test of areParamsValid method, of class InputValidator.
     */
    @Test
    public void testAreParamsValid_True() {
        System.out.println("areParamsValid");
        String shapeType = "circle";
        String[] params = {"circle", "1.7", "-5.05", "6.9"};
        boolean expResult = true;
        boolean result = InputValidator.areParamsValid(shapeType, params);
        assertEquals(expResult, result);
    }

    /**
     * Test of areParamsValid method, of class InputValidator.
     */
    @Test
    public void testAreParamsValid_False() {
        System.out.println("areParamsValid false");
        String shapeType = "circle";
        String[] params = {"circle", "1.7", "-5.05"};
        boolean expResult = false;
        boolean result = InputValidator.areParamsValid(shapeType, params);
        assertEquals(expResult, result);
        //fail(" ");
    }
    
    /**
     * Test of isParamsNumValid method, of class InputValidator.
     */
    @Test
    public void testIsParamsNumValid() {
        System.out.println("isParamsNumValid");
        String shapeType = "circle";
        String[] params = {"circle", "1.7", "dd "};;
        boolean expResult = false;
        boolean result = InputValidator.isParamsNumValid(shapeType, params);
        assertEquals(expResult, result);
       // fail("parameters are not valid number");
    }

    /**
     * Test of areParamsNotNull method, of class InputValidator.
     */
    @Test
    public void testAreParamsNotNull() {
        System.out.println("areParamsNotNull");
        String shapeType = "";
        String[] params = {"","sdfsdf"};
        boolean expResult = false;
        boolean result = InputValidator.areParamsNotNull(shapeType, params);
        assertEquals(expResult, result);
       // fail("parameters are not null or empty");
    }

    /**
     * Test of paramsToDouble method, of class InputValidator.
     */
    @Test
    public void testParamsToDouble() {
        System.out.println("paramsToDouble");
        String[] params = null;
        double[] result = InputValidator.paramsToDouble(params);
        assertNull(result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("parameters are not parseable");
    }

    /**
     * Test of areParamsValid method, of class InputValidator.
     */
    @Test
    public void testAreParamsValid() {
        System.out.println("areParamsValid");
        String shapeType = "";
        String[] params = null;
        boolean expResult = false;
        boolean result = InputValidator.areParamsValid(shapeType, params);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
