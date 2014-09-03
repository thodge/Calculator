
package model;


public class RectangleCalculatorModel {

    public String calculateArea(String length, String width) {
        double area = Double.parseDouble(length) * Double.parseDouble(width);
        return "" + area;
    }

}
