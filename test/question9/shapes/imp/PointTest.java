/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9.shapes.imp;

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
public class PointTest {
    
    public PointTest() {
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
     * Test of getDistance method, of class Point.
     */
    @Test
    public void testGetDistance() {
        System.out.println("getDistance");
        Point p1 = null;
        Point p2 = null;
        double expResult = 0.0;
        double result = Point.getDistance(p1, p2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getX method, of class Point.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Point instance = null;
        double expResult = 0.0;
        double result = instance.getX();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setX method, of class Point.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        double x = 0.0;
        Point instance = null;
        instance.setX(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getY method, of class Point.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Point instance = null;
        double expResult = 0.0;
        double result = instance.getY();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setY method, of class Point.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        double y = 0.0;
        Point instance = null;
        instance.setY(y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Point.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Point instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
