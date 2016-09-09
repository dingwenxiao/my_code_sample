/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9.shapes.imp;

import dingwen.shapes.imp.Circle;
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
public class CircleTest {
    
    Circle instance = null;
    
    public CircleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
        
    }
    
    @Before
    public void setUp() {
        instance = new Circle(new Point(0,0),3);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toString method, of class Circle.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "circle with center at (0.0,0.0) and radius 3.0";
        String result = instance.toString();
        System.out.println(result);
        assertEquals(expResult, result);
    }

    /**
     * Test of contains method, of class Circle.
     */
    @Test
    public void testInside() {
        System.out.println("contains");
        Point p = new Point(1,2);
        boolean result = instance.contains(p);
        assertTrue(result);
    }
    
    /**
     * Test of contains method, of class Circle.
     */
    @Test
    public void testOutside() {
        System.out.println("contains");
        Point p = new Point(0,4);
        boolean result = instance.contains(p);
        assertFalse(result);
    }

    /**
     * Test of area method, of class Circle.
     */
    @Test
    public void testArea() {
        System.out.println("area");
        double expResult = Math.PI*3*3;
        double result = instance.area();
        assertEquals(expResult, result, 0.0001);
    }

}
