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
public class Square implements Shape{
    
    private Point leftUpper;
    private double length;
            
            
    public Square(Point leftUpper, double length) {
        this.leftUpper = leftUpper;
        this.length = length;
    }
    
    
    
    @Override
    public String toString() {
        return "square with left upper corner " + leftUpper.toString() + " and length " + length;
    }

    /**
     * @return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public boolean contains(Point p) {
        if(p.getX()<leftUpper.getX() || p.getY()>leftUpper.getY()) return false;
        if(p.getX()>leftUpper.getX()+length || p.getY()<leftUpper.getY()-length) return false;
        return true;
    }

    @Override
    public double area() {
        return length * length;
    }

    /**
     * @return the leftUpper
     */
    public Point getLeftUpper() {
        return leftUpper;
    }

    /**
     * @param leftUpper the leftUpper to set
     */
    public void setLeftUpper(Point leftUpper) {
        this.leftUpper = leftUpper;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.leftUpper);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.length) ^ (Double.doubleToLongBits(this.length) >>> 32));
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
        final Square other = (Square) obj;
        if (Double.doubleToLongBits(this.length) != Double.doubleToLongBits(other.length)) {
            return false;
        }
        if (!Objects.equals(this.leftUpper, other.leftUpper)) {
            return false;
        }
        return true;
    }
    
    
}
