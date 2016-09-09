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
public class Rectangle implements Shape{
    
    private Point leftUpperPoint;
    private double height;
    private double width;

    /**
     * 
     * @param leftUpperPoint left upper corner point coordinate
     * @param height height
     * @param width  width
     */
    public Rectangle(Point leftUpperPoint, double height, double width) {
        this.leftUpperPoint = leftUpperPoint;
        this.height = height;
        this.width = width;
    }
    
    
    
    @Override
    public String toString() {
        return "rectangle with left upper cornner " + getLeftUpperPoint().toString() + ", height " + getHeight() +" , width " + getWidth();
    }

    
    /**
     * @return the with
     */
    public double getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWith(double width) {
        this.setWidth(width);
    }

    @Override
    public double area() {
        return height*width;
    }

    @Override
    public boolean contains(Point p) {
        if(p.getX()<leftUpperPoint.getX() || p.getY()>leftUpperPoint.getY()) return false;
        if(p.getX()>leftUpperPoint.getX()+width || p.getY()<leftUpperPoint.getY()-height) return false;
        return true;
    }

    /**
     * @return the leftUpperPoint
     */
    public Point getLeftUpperPoint() {
        return leftUpperPoint;
    }

    /**
     * @param leftUpperPoint the leftUpperPoint to set
     */
    public void setLeftUpperPoint(Point leftUpperPoint) {
        this.leftUpperPoint = leftUpperPoint;
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
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.leftUpperPoint);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.height) ^ (Double.doubleToLongBits(this.height) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.width) ^ (Double.doubleToLongBits(this.width) >>> 32));
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
        final Rectangle other = (Rectangle) obj;
        if (Double.doubleToLongBits(this.height) != Double.doubleToLongBits(other.height)) {
            return false;
        }
        if (Double.doubleToLongBits(this.width) != Double.doubleToLongBits(other.width)) {
            return false;
        }
        return this.leftUpperPoint.equals(other.leftUpperPoint);
    }
    
    
}
