/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

import dingwen.Command;
import dingwen.shapes.Shape;
import dingwen.cache.ShapeCache;
import java.math.BigInteger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import dingwen.shapes.Point;
import dingwen.shapes.imp.Circle;

/**
 *
 * @author dingwen
 */
public class CommandTest {
    ShapeCache instance = null;
    ShapeCache shapDao = null;
    public CommandTest() {
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
        shapDao = new ShapeCache();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addShapeCmd method, of class Command.
     */
    @Test
    public void testAddShapeCmd() {
        System.out.println("addShapeCmd");
        String command = "add circle 0 0 3";
        Shape expResult = new Circle(new Point(0,0),3);
        Command.addShapeCmd(command, shapDao);
        Shape result = shapDao.getShape(shapDao.getCurrentIndex().add(new BigInteger("-1")));
        assertEquals(expResult, result);
    }

    /**
     * Test of removeShapeCmd method, of class Command.
     */
    @Test
    public void testRemoveShapeCmd() {
        System.out.println("removeShapeCmd");
        BigInteger id = shapDao.addShape(new Circle(new Point(0,0),3));
        String command = "remove "+id;
        Command.removeShapeCmd(command, shapDao);
        assertNull(shapDao.getShape(id));
    }

}
