
package model;


public class RectangleModel {

    public String calculateArea(String length, String width) {
        double area = Double.parseDouble(length) * Double.parseDouble(width);
        return "" + area;
    }

}
