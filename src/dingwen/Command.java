/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dingwen;

import dingwen.cache.ShapeCache;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import org.apache.commons.lang3.math.NumberUtils;
import dingwen.shapes.ShapeFactory;
import dingwen.shapes.Point;
import dingwen.shapes.Shape;
import dingwen.utils.CommonStatement;
import dingwen.utils.Helper;

/**
 *
 * @author dingwen
 */
public class Command {

    public static void addShapeCmd(String command, ShapeCache shapeCache) {
        Shape shape = ShapeFactory.getShape(command.substring(command.indexOf(" ") + 1));
        if (shape != null) {
            shapeCache.addShape(shape);
        }
    }

    public static void removeShapeCmd(String command, ShapeCache shapeCache) {
        BigInteger id = null;
        if (NumberUtils.isNumber(command.substring(command.indexOf(" ") + 1))) {
            id = new BigInteger(command.substring(command.indexOf(" ") + 1));
            Shape shape = shapeCache.removeShape(id);
            if (shape == null) {
                System.out.println(CommonStatement.SHAPE_NOT_EXISTS);
            } else {
                System.out.println("Removed shape " + id + " : " + shape.toString());
            }
        } else {
            System.out.println(CommonStatement.ID_INVALID);
        }
    }

    public static void containsCmd(String command, ShapeCache shapeCache) {
        String x_coordinate = command.substring(command.indexOf(" ") + 1, command.lastIndexOf(" "));
        String y_coordinate = command.substring(command.lastIndexOf(" ") + 1);

        if (!NumberUtils.isParsable(x_coordinate) || !NumberUtils.isParsable(y_coordinate)) {
            System.out.println(CommonStatement.INPUT_INVALID);
            return;
        }

        double x = Double.parseDouble(command.substring(command.indexOf(" "), command.lastIndexOf(" ")));
        double y = Double.parseDouble(command.substring(command.lastIndexOf(" ")));
        Point p = new Point(x, y);

        double totalArea = 0;
        Iterator it = shapeCache.getShapes().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            BigInteger id = (BigInteger) pair.getKey();
            Shape shape = (Shape) pair.getValue();
            if (shape.contains(p)) {
                System.out.println("shape " + id + " " + shape);
                System.out.println("area is " + shape.area());
                totalArea += shape.area();
            }
        }
        System.out.println("total area is " + totalArea);
    }

    public static void helpCmd() {
        System.out.println();
        System.out.println(CommonStatement.NOTE);

        System.out.println();
        System.out.println(Helper.ADD_SHAPE);

        System.out.println();
        System.out.println(Helper.REMOVE_SHAPE);

        System.out.println();
        System.out.println(Helper.LIST_SHAPE);

        System.out.println();
        System.out.println(Helper.SHAPE_CONTAINS);

        System.out.println();
        System.out.println(Helper.HELP);

        System.out.println();
        System.out.println(Helper.EXIT);
    }

    public static void shapeHelp() {
        System.out.println();
        System.out.println(Helper.ADD_CIRCLE);

        System.out.println();
        System.out.println(Helper.ADD_DONUT);

        System.out.println();
        System.out.println(Helper.ADD_ELLIPSE);

        System.out.println();
        System.out.println(Helper.ADD_RECTANGLE);

        System.out.println();
        System.out.println(Helper.ADD_SQUARE);

        System.out.println();
        System.out.println(Helper.ADD_TRIANLE);

    }

    public static void exitCmd() {
        System.out.println(CommonStatement.SEE_YOU);
    }

    public static void listShapesCmd(String command, ShapeCache shapeCache) {
        BigInteger id = null;
        if (NumberUtils.isParsable(command.substring(command.indexOf(" ") + 1))) {
            id = new BigInteger(command.substring(command.indexOf(" ") + 1));
        }

        if (id == null) {
            Iterator it = shapeCache.getShapes().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry) it.next();
                System.out.println("shape " + pair.getKey() + " " + (Shape) pair.getValue());
            }
        } else if (shapeCache.getShape(id) != null) {
            System.out.println("shape " + id + " " + shapeCache.getShape(id));
        } else {
            System.out.println(CommonStatement.SHAPE_NOT_EXISTS);
        }
    }

    public static void main(String[] args) {
        ShapeCache shapeCache = new ShapeCache();
        String filePath = Helper.DEFAULT_FILE;
        System.out.println(CommonStatement.NOTE);

        if (args != null && args.length != 0) {
            filePath = args[0];
        }
        shapeCache.init(filePath);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                String command = scanner.nextLine();
                if (command.contains("add")) {
                    Command.addShapeCmd(command, shapeCache);

                } else if (command.contains("remove")) {
                    Command.removeShapeCmd(command, shapeCache);

                } else if (command.contains("list")) {
                    Command.listShapesCmd(command, shapeCache);

                } else if (command.contains("contains")) {
                    Command.containsCmd(command, shapeCache);

                } else if (command.equals("help shape")) {
                    Command.shapeHelp();

                } else if (command.contains("help")) {
                    Command.helpCmd();

                } else if (command.contains("exit")) {
                    Command.exitCmd();
                    break;

                } else {
                    System.out.println(CommonStatement.INPUT_NOT_RECOGNIZE);
                }
            } catch (Exception e) {
                System.out.println(CommonStatement.INPUT_NOT_RECOGNIZE);
            }
        }

    }
}
