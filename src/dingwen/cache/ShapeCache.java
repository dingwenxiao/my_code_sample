package dingwen.cache;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import dingwen.shapes.Shape;
import dingwen.shapes.ShapeFactory;

/**
 *
 * @author dingwen
 */
public class ShapeCache {

    private final Map<BigInteger, Shape> shapes = new HashMap<>();
    
    //increment identifier
    private BigInteger currentIndex = BigInteger.ZERO;

    /**
     * Load shape objects from the file
     * @param path file path
     */
    public void init(String path) {

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String shapeStatement;

            while ((shapeStatement = br.readLine()) != null) {
                // System.out.println(shapeStatement);
                Shape shape = ShapeFactory.getShape(shapeStatement);
                shapes.put(currentIndex, shape);
                System.out.println("shape " + currentIndex.toString() + " " + shape);
                currentIndex = currentIndex.add(BigInteger.ONE);
            }
        } catch (IOException e) {
            System.out.println("Cannot open the file with the input name");
        }

    }

    public BigInteger addShape(Shape shape) {
        shapes.put(currentIndex, shape);
        System.out.println("Added shape " + currentIndex + " "+ shape);
        BigInteger lastIndex = currentIndex;
        currentIndex = currentIndex.add(BigInteger.ONE);
        return lastIndex;
    }

    public Shape removeShape(BigInteger id) {
        return shapes.remove(id);
    }

    public Shape getShape(BigInteger id) {
        return shapes.get(id);
    }

//    public List<Shape> findAllOverrlaps(BigInteger id) {
//        
//    }
//    
//   public static boolean testIntersection(Shape shapeA, Shape shapeB) {
//    Area areaA = new Area(shapeA);
//    areaA.intersect(new Area(shapeB));
//    return !areaA.isEmpty();
//}
    /**
     * @return the map of shapes
     */
    public Map<BigInteger, Shape> getShapes() {
        return new HashMap<>(shapes);
    }

    /**
     * @return the currentIndex
     */
    public BigInteger getCurrentIndex() {
        return currentIndex;
    }

}
