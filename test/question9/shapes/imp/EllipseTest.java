/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9.shapes.imp;

import dingwen.shapes.imp.Ellipse;
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
public class EllipseTest {
    
    Ellipse instance = null;
    
    public EllipseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Ellipse(new Point(0,0),3,4);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toString method, of class Ellipse.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "ellipse with center (0.0,0.0) , height 4.0 , width 3.0";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of contains method, of class Ellipse.
     */
    @Test
    public void testInside() {
        System.out.println("contains");
        Point p = new Point(3,0.5);
        boolean result = instance.contains(p);
        assertTrue(result);
    }
    
    /**
     * Test of contains method, of class Ellipse.
     */
    @Test
    public void testOutside() {
        System.out.println("contains");
        Point p = new Point(1,2);
        boolean result = instance.contains(p);
        assertFalse(result);
    }

    /**
     * Test of area method, of class Ellipse.
     */
    @Test
    public void testArea() {
        System.out.println("area");
        double expResult = Math.PI * 3 * 4;
        double result = instance.area();
        assertEquals(expResult, result, 0.0001);
    }

    /**
     * Test of contains method, of class Ellipse.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Point p = null;
        Ellipse instance = null;
        boolean expResult = false;
        boolean result = instance.contains(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWidth method, of class Ellipse.
     */
    @Test
    public void testGetWidth() {
        System.out.println("getWidth");
        Ellipse instance = null;
        double expResult = 0.0;
        double result = instance.getWidth();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWidth method, of class Ellipse.
     */
    @Test
    public void testSetWidth() {
        System.out.println("setWidth");
        double width = 0.0;
        Ellipse instance = null;
        instance.setWidth(width);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHeight method, of class Ellipse.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        Ellipse instance = null;
        double expResult = 0.0;
        double result = instance.getHeight();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHeight method, of class Ellipse.
     */
    @Test
    public void testSetHeight() {
        System.out.println("setHeight");
        double height = 0.0;
        Ellipse instance = null;
        instance.setHeight(height);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCenter method, of class Ellipse.
     */
    @Test
    public void testGetCenter() {
        System.out.println("getCenter");
        Ellipse instance = null;
        Point expResult = null;
        Point result = instance.getCenter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCenter method, of class Ellipse.
     */
    @Test
    public void testSetCenter() {
        System.out.println("setCenter");
        Point center = null;
        Ellipse instance = null;
        instance.setCenter(center);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
