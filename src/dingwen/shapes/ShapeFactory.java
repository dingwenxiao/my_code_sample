/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dingwen.shapes;

import dingwen.shapes.imp.Circle;
import dingwen.shapes.imp.Donut;
import dingwen.shapes.imp.Ellipse;
import dingwen.shapes.imp.Rectangle;
import dingwen.shapes.imp.Square;
import dingwen.shapes.imp.Triangle;
import dingwen.utils.InputValidator;

/**
 *
 * @author dingwen
 */
public class ShapeFactory {

    //use getShape method to get object of type shape 
    public static Shape getShape(String shapeStatement) {

        String[] shapeParams = shapeStatement.split(" ");
        String shapeType = shapeParams[0];

        if (!InputValidator.areParamsValid(shapeType, shapeParams)) {
            return null;
        }

        double[] doubleParms = InputValidator.paramsToDouble(shapeParams);
        if (doubleParms == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle(new Point(doubleParms[0], doubleParms[1]), doubleParms[2]);

        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle(new Point(doubleParms[0], doubleParms[1]), doubleParms[2], doubleParms[3]);

        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square(new Point(doubleParms[0], doubleParms[1]), doubleParms[2]);

        } else if (shapeType.equalsIgnoreCase("Ellipse")) {
            return new Ellipse(new Point(doubleParms[0], doubleParms[1]), doubleParms[2], doubleParms[3]);

        } else if (shapeType.equalsIgnoreCase("DONUT")) {
            return new Donut(new Point(doubleParms[0], doubleParms[1]), doubleParms[2], doubleParms[3]);
            
        } else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
            return new Triangle(new Point(doubleParms[0], doubleParms[1]), new Point(doubleParms[2], doubleParms[3]), new Point(doubleParms[4], doubleParms[5]));
            
        }

        return null;
    }

}
