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
public class Ellipse implements Shape {

    private Point center;
    private double width;
    private double height;

    public Ellipse(Point center, double width, double height) {
        this.center = center;
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "ellipse with center " + center.toString() + " , height " + getHeight() + " , width " + getWidth();
    }

    @Override
    public boolean contains(Point p) { 
        return Math.pow(p.getX() - center.getX(),2) / Math.pow(width,2)
                + Math.pow(p.getY() - center.getY(),2) / Math.pow(height,2) <= 1;
    }

    @Override
    public double area() {
        return Math.PI*width*height;
    }

    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @return the center
     */
    public Point getCenter() {
        return center;
    }

    /**
     * @param center the center to set
     */
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.center);
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.width) ^ (Double.doubleToLongBits(this.width) >>> 32));
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.height) ^ (Double.doubleToLongBits(this.height) >>> 32));
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
        final Ellipse other = (Ellipse) obj;
        if (Double.doubleToLongBits(this.width) != Double.doubleToLongBits(other.width)) {
            return false;
        }
        if (Double.doubleToLongBits(this.height) != Double.doubleToLongBits(other.height)) {
            return false;
        }
        if (!Objects.equals(this.center, other.center)) {
            return false;
        }
        return true;
    }
    
    
}
