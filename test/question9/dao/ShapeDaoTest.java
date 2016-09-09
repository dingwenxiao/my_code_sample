package question9.dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dingwen.cache.ShapeCache;
import dingwen.shapes.Shape;
import java.math.BigInteger;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import dingwen.shapes.Point;
import dingwen.shapes.imp.Circle;
import dingwen.shapes.imp.Donut;
import dingwen.shapes.imp.Ellipse;
import dingwen.shapes.imp.Rectangle;
import dingwen.shapes.imp.Square;
import dingwen.shapes.imp.Triangle;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasEntry;
/**
 *
 * @author dingwen
 */
public class ShapeDaoTest {
    ShapeCache instance = null;
    Shape expResult = null;
    public ShapeDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new ShapeCache();
        expResult = new Circle(new Point(0,0),3);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addShape method, of class ShapeCache.
     */
    @Test
    public void testAddShape() {
        System.out.println("addShape");
        BigInteger id = instance.addShape(expResult);
        Shape result = instance.getShape(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of removeShape method, of class ShapeCache.
     */
    @Test
    public void testRemoveShape() {
        System.out.println("removeShape");
        BigInteger id = instance.addShape(expResult);
        Shape result = instance.removeShape(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of getShape method, of class ShapeCache.
     */
    @Test
    public void testGetShape() {
        System.out.println("getShape");
        BigInteger id = instance.addShape(expResult);
        Shape result = instance.getShape(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of getShapes method, of class ShapeCache.
     */
   // @Test
    public void testGetShapes() {
        System.out.println("getShapes");
        Shape circle = new Circle(new Point(0,0),3);
        BigInteger circleId = instance.addShape(circle);
        
        Shape donut = new Donut(new Point(0,0),3,5);
        BigInteger donutId = instance.addShape(donut);
        
        Shape ellipse = new Ellipse(new Point(0,0),3,4);
        BigInteger ellipseId = instance.addShape(ellipse);
        
        Shape rectangle = new Rectangle(new Point(0,0),4,5);
        BigInteger rectangleId = instance.addShape(rectangle);
        
        Shape square = new Square(new Point(0,0),4);
        BigInteger squareId = instance.addShape(square);
        
        Point point1 = new Point(0,4);
        Point point2 = new Point(-3,0);
        Point point3 = new Point(2,0);
        
        Shape triangle = new Triangle(point1, point2, point3);
        BigInteger triangleId = instance.addShape(triangle);
        
        Map<BigInteger, Shape> result = instance.getShapes();
        assertEquals(6,result.size());
        assertThat(result, hasEntry(circleId,circle));
        assertThat(result, hasEntry(rectangleId,rectangle));
        assertThat(result, hasEntry(triangleId,triangle));
        assertThat(result, hasEntry(donutId,donut));
        assertThat(result, hasEntry(squareId,square));
        assertThat(result, hasEntry(ellipseId,ellipse));
    }

    /**
     * Test of getIncrement method, of class ShapeCache.
     */
    @Test
    public void testGetIncrement() {
        System.out.println("getIncrement");
        ShapeCache shapeDao = new ShapeCache();
        BigInteger expId = shapeDao.getCurrentIndex();
        BigInteger resultId = shapeDao.addShape(new Circle(new Point(1,2),3));
        assertEquals(expId, resultId);
    }
    
}
