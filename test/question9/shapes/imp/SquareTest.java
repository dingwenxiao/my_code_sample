/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9.shapes.imp;

import dingwen.shapes.imp.Square;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import dingwen.shapes.Point;
import static org.junit.Assert.*;

/**
 *
 * @author dingwen
 */
public class SquareTest {
    
    Square instance = null;
    Point testP = new Point(2,2);
    
    public SquareTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Square(testP,4);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toString method, of class Square.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "square with left upper corner " + testP.toString() + " and length 4.0";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of contains method, of class Square.
     */
    @Test
    public void testInside() {
        System.out.println("contains");
        Point p = new Point(2,1);
        boolean result = instance.contains(p);
        assertTrue(result);
    }
    
    /**
     * Test of contains method, of class Square.
     */
    @Test
    public void testOutside() {
        System.out.println("contains");
        Point p = new Point(7,2);
        boolean result = instance.contains(p);
        assertFalse(result);
    }
    
     /**
     * Test of area method, of class Square.
     */
    @Test
    public void testArea() {
        System.out.println("area");
        double expResult = 4 * 4;
        double result = instance.area();
        assertEquals(expResult, result, 0.0001);
    }

    /**
     * Test of getLength method, of class Square.
     */
    @Test
    public void testGetLength() {
        System.out.println("getLength");
        Square instance = null;
        double expResult = 0.0;
        double result = instance.getLength();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLength method, of class Square.
     */
    @Test
    public void testSetLength() {
        System.out.println("setLength");
        double length = 0.0;
        Square instance = null;
        instance.setLength(length);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class Square.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Point p = null;
        Square instance = null;
        boolean expResult = false;
        boolean result = instance.contains(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLeftUpper method, of class Square.
     */
    @Test
    public void testGetLeftUpper() {
        System.out.println("getLeftUpper");
        Square instance = null;
        Point expResult = null;
        Point result = instance.getLeftUpper();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLeftUpper method, of class Square.
     */
    @Test
    public void testSetLeftUpper() {
        System.out.println("setLeftUpper");
        Point leftUpper = null;
        Square instance = null;
        instance.setLeftUpper(leftUpper);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
