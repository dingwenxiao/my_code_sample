/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dingwen.shapes.imp;

import dingwen.shapes.Shape;
import dingwen.shapes.Point;
import java.util.Objects;

/**
 *
 * @author dingwen
 */
public class Triangle implements Shape {

    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    @Override
    public boolean contains(Point p) {
        double a = 0, b = 0, c = 0;

        /**/
        Point MA = new Point(p.getX() - point1.getX(), p.getY() - point1.getY());
        Point MB = new Point(p.getX() - point2.getX(), p.getY() - point2.getY());
        Point MC = new Point(p.getX() - point3.getX(), p.getY() - point3.getY());

        /*cross product*/
        a = MA.getX() * MB.getX() - MA.getY() * MB.getX();
        b = MB.getX() * MC.getY() - MB.getY() * MC.getX();
        c = MC.getX() * MA.getY() - MC.getY() * MA.getX();

        if ((a <= 0 && b <= 0 && c <= 0)
                || (a > 0 && b > 0 && c > 0)) {
            return true;
        }

        return false;
    }

    @Override
    public double area() {
        double area = point1.getX()*(point2.getY()-point3.getY()) 
                + point2.getX()*(point3.getY()-point1.getY())
                + point3.getX()*(point1.getY()-point2.getY());
        return Math.abs(area/2);
    }

    /**
     * @return the point1
     */
    public Point getPoint1() {
        return point1;
    }

    /**
     * @param point1 the point1 to set
     */
    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    /**
     * @return the point2
     */
    public Point getPoint2() {
        return point2;
    }

    /**
     * @param point2 the point2 to set
     */
    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    /**
     * @return the point3
     */
    public Point getPoint3() {
        return point3;
    }

    /**
     * @param point3 the point3 to set
     */
    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    @Override
    public String toString() {
        return "triangle with point 1 " + point1.toString() + " , point 2 " + point2.toString() + " , point 3 " + point3.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.point1);
        hash = 83 * hash + Objects.hashCode(this.point2);
        hash = 83 * hash + Objects.hashCode(this.point3);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Triangle other = (Triangle) obj;
        if (!Objects.equals(this.point1, other.point1)) {
            return false;
        }
        if (!Objects.equals(this.point2, other.point2)) {
            return false;
        }
        if (!Objects.equals(this.point3, other.point3)) {
            return false;
        }
        return true;
    }

    
    
}
