/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9.shapes.imp;

import dingwen.shapes.imp.Donut;
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
public class DonutTest {
    
    Donut instance = null;
    
    public DonutTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Donut(new Point(0,0),3,5);
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "donut with center (0.0,0.0), inner radius 3.0, outer radius 5.0";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of contains method, of class Donut.
     */
    @Test
    public void testInside() {
        System.out.println("contains");
        Point p = new Point(2.2,2.2);
        boolean result = instance.contains(p);
        assertTrue(result);
    }
    
    /**
     * Test of contains method, of class Donut.
     */
    @Test
    public void testOutside() {
        System.out.println("contains");
        Point p = new Point(0,2);
        boolean result = instance.contains(p);
        assertFalse(result);
    }

    /**
     * Test of area method, of class Donut.
     */
    @Test
    public void testArea() {
        System.out.println("area");
        double expResult = Math.PI*(5*5-3*3);
        double result = instance.area();
        assertEquals(expResult, result, 0.0001);
    }

    /**
     * Test of getRadiusInner method, of class Donut.
     */
    @Test
    public void testGetRadiusInner() {
        System.out.println("getRadiusInner");
        Donut instance = null;
        double expResult = 0.0;
        double result = instance.getRadiusInner();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRadiusInner method, of class Donut.
     */
    @Test
    public void testSetRadiusInner() {
        System.out.println("setRadiusInner");
        double radiusInner = 0.0;
        Donut instance = null;
        instance.setRadiusInner(radiusInner);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRadiusOuter method, of class Donut.
     */
    @Test
    public void testGetRadiusOuter() {
        System.out.println("getRadiusOuter");
        Donut instance = null;
        double expResult = 0.0;
        double result = instance.getRadiusOuter();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRadiusOuter method, of class Donut.
     */
    @Test
    public void testSetRadiusOuter() {
        System.out.println("setRadiusOuter");
        double radiusOuter = 0.0;
        Donut instance = null;
        instance.setRadiusOuter(radiusOuter);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class Donut.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Point p = null;
        Donut instance = null;
        boolean expResult = false;
        boolean result = instance.contains(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
