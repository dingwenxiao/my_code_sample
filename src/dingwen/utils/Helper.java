/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dingwen.utils;

/**
 *
 * @author dingwen
 */
public class Helper {
    
    public static final String DEFAULT_FILE= "input_sample.txt";
            
    public static final String ADD_SHAPE= "-Add a shape: add [shape type] [x coordinate of center] [y coordinate of center] [...]\n"
            + "i.e. add circle 1.7 -5.05 6.9\n"
            + "More details about each type of shape, please type 'help shape'.";
    
    public static final String REMOVE_SHAPE= "-Remove a shape: remove [shape id]\n"
            + "i.e. remove 1";
    
    public static final String LIST_SHAPE= "-List shapes with id; if no id specified, list all shapes: list [id]\n"
            + "i.e. list 1";
    
    public static final String SHAPE_CONTAINS= "-List type,surface area, and total area of shapes that contain a point specified: cointains [x coordinate] [y coordinate]\n"
            + "i.e. contains 1.7 -5.05";
    
    public static final String HELP = "-Show help instructions: help";
    
    public static final String EXIT = "-Exit: exit";
    
    public static final String ADD_CIRCLE= "-Add a circle: add circle [x coordinate of center] [y coordinate of center] [radius]\n"
            + "i.e. add circle 1.7 -5.05 6.9";
    
    public static final String ADD_RECTANGLE= "-Add a rectangle: add rectangle [x coordinate of left upper corner] [y coordinate of left upper corner] [height] [width]\n"
            + "i.e. add rectangle 3.5 2.0 5.6 7.2";
    
    public static final String ADD_SQUARE= "-Add a square: add square [x coordinate of left upper corner] [y coordinate of left upper corner] [length]\n"
            + "i.e. add square 3.5 2.0 5.6";
    
    public static final String ADD_DONUT= "-Add a donut: add donut [x coordinate of center] [y coordinate of center] [inner radius] [outer radius]\n"
            + "i.e. add donut 3.5 2.0 5.6 7.2";
    
    public static final String ADD_TRIANLE= "-Add a triangle: add triangle [point 1 - x coordinate] [point 1 - y coordinate] [point 2 - x coordinate] [point 2 - y coordinate] [point 3 - x coordinate] [point 3 - y coordinate]\n"
            + "i.e. add triangle 3.5 2.0 5.6 7.2 1 1";
    
    public static final String ADD_ELLIPSE= "-Add a ellipse: add ellipse [x coordinate of center] [y coordinate of center] [height] [width]\n"
            + "i.e. add ellipse 3.5 2.0 5.6 7.2";
}
