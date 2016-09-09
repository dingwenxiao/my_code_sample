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
public class Donut implements Shape{
    
    private Point center;
    
    private double radiusInner;
    private double radiusOuter;

    public Donut(Point center, double radiusInner, double radiusOuter) {
        this.center = center;
        this.radiusInner = radiusInner;
        this.radiusOuter = radiusOuter;
    }
    
    
    @Override
    public String toString() {
        return "donut with center " + center.toString() + ", inner radius " + radiusInner +", outer radius " + radiusOuter;
    }

    /**
     * @return the radiusInner
     */
    public double getRadiusInner() {
        return radiusInner;
    }

    /**
     * @param radiusInner the radiusInner to set
     */
    public void setRadiusInner(double radiusInner) {
        this.radiusInner = radiusInner;
    }

    /**
     * @return the radiusOuter
     */
    public double getRadiusOuter() {
        return radiusOuter;
    }

    /**
     * @param radiusOuter the radiusOuter to set
     */
    public void setRadiusOuter(double radiusOuter) {
        this.radiusOuter = radiusOuter;
    }

    @Override
    public boolean contains(Point p) {
           double radius0 = Point.getDistance(center, p);
           return radius0>=radiusInner && radius0<=radiusOuter;
    }

    @Override
    public double area() {
        return  Math.PI*(radiusOuter*radiusOuter-radiusInner*radiusInner);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.center);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.radiusInner) ^ (Double.doubleToLongBits(this.radiusInner) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.radiusOuter) ^ (Double.doubleToLongBits(this.radiusOuter) >>> 32));
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
        final Donut other = (Donut) obj;
        if (Double.doubleToLongBits(this.radiusInner) != Double.doubleToLongBits(other.radiusInner)) {
            return false;
        }
        if (Double.doubleToLongBits(this.radiusOuter) != Double.doubleToLongBits(other.radiusOuter)) {
            return false;
        }
        if (!Objects.equals(this.center, other.center)) {
            return false;
        }
        return true;
    }
    
    
}
