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
public class InputValidator {
    
    /**
     * Validate input parameters
     * @param shapeType
     * @param params
     * @return 
     */
    public static boolean areParamsValid(String shapeType, String[] params) {
        if (shapeType == null) {
            System.out.println(CommonStatement.INPUT_INVALID);
            return false;
        }
  
        return isParamsNumValid(shapeType.toLowerCase(),params) && areParamsNotNull(shapeType.toLowerCase(),params);
    }
    
    /**
     * Validate the number of input parameters
     * @param shapeType
     * @param params
     * @return 
     */
    public static boolean isParamsNumValid(String shapeType, String[] params) {
        if(shapeType.equals("circle") && params.length==4
                || (shapeType.equals("square") && params.length==4)
                || (shapeType.equals("rectangle") && params.length==5)
                || (shapeType.equals("triangle") && params.length==7)
                || (shapeType.equals("donut") && params.length==5)
                || (shapeType.equals("ellipse") && params.length==5)) {
            return true;
        } else {
           // System.out.println("the number of parameters is incorrct for given shape");
           System.out.println(CommonStatement.INPUT_INVALID);
            return false;
        }
    }
    
    /**
     * Make sure parameters are not null or empty
     * @param shapeType
     * @param params
     * @return 
     */
    public static boolean areParamsNotNull(String shapeType,String[] params) {
        for (String param : params) {
            if (param == null || "".equals(param)) {
                System.out.println(CommonStatement.EMPTY_PARAMETER);
                return false;
            }
        }
           return true;
    }
    
    /**
     * Transform parameters from string to double
     * @param params
     * @return 
     */
    public static double[] paramsToDouble(String[] params) {
        if(params==null || params.length==0) return null; 
        double[] res = new double[params.length-1];
           for(int i=1; i<params.length; i++) {
               try{
                    res[i-1] = Double.parseDouble(params[i]);
               }catch(java.lang.NumberFormatException e) {
                   System.out.println(CommonStatement.INPUT_INVALID);
                   return null;
               }
           }
           return res;
    }
}
