/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

import dingwen.shapes.ShapeFactory;
import dingwen.shapes.Shape;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import dingwen.shapes.imp.Circle;
import dingwen.shapes.Point;
import dingwen.shapes.imp.Donut;
import dingwen.shapes.imp.Ellipse;
import dingwen.shapes.imp.Rectangle;
import dingwen.shapes.imp.Square;
import dingwen.shapes.imp.Triangle;

/**
 *
 * @author dingwen
 */
public class ShapeFactoryTest {
    
    public ShapeFactoryTest() {
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

    @Test
    public void testGetShapeNotExists() {
        String shapeStatement = "polygon 12 123 44";
        Shape result = ShapeFactory.getShape(shapeStatement);
        assertNull(result);
    }
    
    @Test
    public void testGetCircle() {
        String shapeStatement = "circle 0 0 3.0";
        Shape expResult = new Circle(new Point(0,0),3);
        Shape result = ShapeFactory.getShape(shapeStatement);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetSquare() {
        String shapeStatement = "square 3.55 4.1 2.77";
        Shape expResult = new Square(new Point(3.55,4.1),2.77);
        Shape result = ShapeFactory.getShape(shapeStatement);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetRectangle() {
        String shapeStatement = "rectangle 3.5 2.0 5.6 7.2";
        Shape expResult = new Rectangle(new Point(3.5,2.0),5.6,7.2);
        Shape result = ShapeFactory.getShape(shapeStatement);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetTriangle() {
        String shapeStatement = "triangle 4.5 1 2.5 33 23 0.3";
        Shape expResult = new Triangle(new Point(4.5,1.0),new Point(2.5,33),new Point(23,0.3));
        Shape result = ShapeFactory.getShape(shapeStatement);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetDonut() {
        String shapeStatement = "donut 4.5 7.8 1.5 1.8";
        Shape expResult = new Donut(new Point(4.5,7.8),1.5,1.8);
        Shape result = ShapeFactory.getShape(shapeStatement);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetEllipse() {
        String shapeStatement = "ellipse 4.5 7.8 1.5 1.8";
        Shape expResult = new Ellipse(new Point(4.5,7.8),1.5,1.8);
        Shape result = ShapeFactory.getShape(shapeStatement);
        assertEquals(expResult, result);
    }
    
}
