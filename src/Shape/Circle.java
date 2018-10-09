/**
 * @author Trần Đức Hiếu
 * @version 1.0.0
 * @data 09/10/2018
 */
package Shape;

import java.util.ArrayList;

public class Circle extends Shape {
    private double radius;
    private final double PI = 3.14;
    public Circle(String color, ArrayList<Point> ps, double radius) {
        super(color, ps);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * @return Circle's Perimeter
     */
    public double getPerimeter() {
        return 2 * PI * radius;
    }


    /**
     * @return Circle's Area
     */
    public double getArea() {
        return 2 * PI * radius * radius;
    }
}
