/**
 * @author Trần Đức Hiếu
 * @version 1.0.0
 * @data 09/10/2018
 */
import java.util.ArrayList;

public class Diagram {
    private ArrayList<Layer> arr;

    public Diagram(ArrayList<Layer> arr) {
        this.arr = arr;
    }

    /**
     * Remove all the Circle instance off the Diagram
     */
    public void removeCircle() {
        for(int i = 0; i < arr.size(); i++) {
            arr.get(i).removeCircle();
        }
    }

    /**
     * Print all Shape of the Diagram
     */
    public void print() {
        for(int i = 0; i < arr.size(); i++) {
            arr.get(i).print();
            System.out.println();
        }
    }
}
