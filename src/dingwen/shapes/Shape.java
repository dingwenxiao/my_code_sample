/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dingwen.shapes;

import dingwen.shapes.Point;

/**
 *
 * @author dingwen
 */
public interface Shape {
    public boolean contains(Point p);
    public double area();
    
}
