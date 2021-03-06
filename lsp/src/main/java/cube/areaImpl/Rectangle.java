package cube.areaImpl;

import cube.Area;

/**
 * Created by lodz on 2016/03/28.
 */
public class Rectangle implements Area {
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int area() {
        return getBreadth()*getLength();
    }
}
