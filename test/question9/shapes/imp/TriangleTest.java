/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9.shapes.imp;

import dingwen.shapes.imp.Triangle;
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
public class TriangleTest {
    Triangle instance = null;
    Point point1  = null;
    Point point2 = null;
    Point point3 = null;
    
    public TriangleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        point1 = new Point(0,4);
        point2 = new Point(-3,0);
        point3 = new Point(2,0);
        instance = new Triangle(point1, point2, point3);
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of contains method, of class Square.
     */
    @Test
    public void testInside() {
        System.out.println("contains");
        Point p = new Point(1,1);
        boolean result = instance.contains(p);
        assertTrue(result);
    }
    
    /**
     * Test of contains method, of class Square.
     */
    @Test
    public void testOutside() {
        System.out.println("contains");
        Point p = new Point(1,3);
        boolean result = instance.contains(p);
        assertFalse(result);
    }
    
    /**
     * Test of area method, of class Triangle.
     */
    @Test
    public void testArea() {
        System.out.println("area");
        double expResult = 10.0;
        double result = instance.area();
        assertEquals(expResult, result, 0.00001);
    }

    /**
     * Test of toString method, of class Triangle.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "triangle with point 1 " + point1.toString() + " , point 2 " + point2.toString() + " , point 3 " + point3.toString();
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of contains method, of class Triangle.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Point p = null;
        Triangle instance = null;
        boolean expResult = false;
        boolean result = instance.contains(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPoint1 method, of class Triangle.
     */
    @Test
    public void testGetPoint1() {
        System.out.println("getPoint1");
        Triangle instance = null;
        Point expResult = null;
        Point result = instance.getPoint1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPoint1 method, of class Triangle.
     */
    @Test
    public void testSetPoint1() {
        System.out.println("setPoint1");
        Point point1 = null;
        Triangle instance = null;
        instance.setPoint1(point1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPoint2 method, of class Triangle.
     */
    @Test
    public void testGetPoint2() {
        System.out.println("getPoint2");
        Triangle instance = null;
        Point expResult = null;
        Point result = instance.getPoint2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPoint2 method, of class Triangle.
     */
    @Test
    public void testSetPoint2() {
        System.out.println("setPoint2");
        Point point2 = null;
        Triangle instance = null;
        instance.setPoint2(point2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPoint3 method, of class Triangle.
     */
    @Test
    public void testGetPoint3() {
        System.out.println("getPoint3");
        Triangle instance = null;
        Point expResult = null;
        Point result = instance.getPoint3();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPoint3 method, of class Triangle.
     */
    @Test
    public void testSetPoint3() {
        System.out.println("setPoint3");
        Point point3 = null;
        Triangle instance = null;
        instance.setPoint3(point3);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
