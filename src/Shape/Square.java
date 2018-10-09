/**
 * @author Trần Đức Hiếu
 * @version 1.0.0
 * @data 09/10/2018
 */
package Shape;

import java.util.ArrayList;

public class Square extends Rectangle {
    public Square(double side, ArrayList<Point> ps) {
        super(side, side, "red", ps);
    }
}
