/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9.shapes.imp;

import dingwen.shapes.imp.Rectangle;
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
public class RectangleTest {
    Rectangle instance = null;
    Point testP = new Point(2,2);
    public RectangleTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Rectangle(testP,4,5);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toString method, of class Rectangle.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "rectangle with left upper cornner " + testP.toString() + ", height " + 4.0 +" , width " + 5.0;
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of contains method, of class Rectangle.
     */
    @Test
    public void testInside() {
        System.out.println("contains");
        Point p = new Point(6,2);
        boolean result = instance.contains(p);
        assertTrue(result);
    }
    
    /**
     * Test of contains method, of class Rectangle.
     */
    @Test
    public void testOutside() {
        System.out.println("contains");
        Point p = new Point(8,2);
        boolean result = instance.contains(p);
        assertFalse(result);
    }
    
    /**
     * Test of area method, of class Rectangle.
     */
    @Test
    public void testArea() {
        System.out.println("area");
        double expResult = 5 * 4;
        double result = instance.area();
        assertEquals(expResult, result, 0.0001);
    }

    /**
     * Test of getWidth method, of class Rectangle.
     */
    @Test
    public void testGetWidth() {
        System.out.println("getWidth");
        Rectangle instance = null;
        double expResult = 0.0;
        double result = instance.getWidth();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWith method, of class Rectangle.
     */
    @Test
    public void testSetWith() {
        System.out.println("setWith");
        double width = 0.0;
        Rectangle instance = null;
        instance.setWith(width);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class Rectangle.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Point p = null;
        Rectangle instance = null;
        boolean expResult = false;
        boolean result = instance.contains(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLeftUpperPoint method, of class Rectangle.
     */
    @Test
    public void testGetLeftUpperPoint() {
        System.out.println("getLeftUpperPoint");
        Rectangle instance = null;
        Point expResult = null;
        Point result = instance.getLeftUpperPoint();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLeftUpperPoint method, of class Rectangle.
     */
    @Test
    public void testSetLeftUpperPoint() {
        System.out.println("setLeftUpperPoint");
        Point leftUpperPoint = null;
        Rectangle instance = null;
        instance.setLeftUpperPoint(leftUpperPoint);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHeight method, of class Rectangle.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        Rectangle instance = null;
        double expResult = 0.0;
        double result = instance.getHeight();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHeight method, of class Rectangle.
     */
    @Test
    public void testSetHeight() {
        System.out.println("setHeight");
        double height = 0.0;
        Rectangle instance = null;
        instance.setHeight(height);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWidth method, of class Rectangle.
     */
    @Test
    public void testSetWidth() {
        System.out.println("setWidth");
        double width = 0.0;
        Rectangle instance = null;
        instance.setWidth(width);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
