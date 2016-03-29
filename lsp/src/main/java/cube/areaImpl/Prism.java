package cube.areaImpl;

import cube.Area;

/**
 * Created by lodz on 2016/03/28.
 */
public class Prism implements Area{
    private int length;
    private int breadth;
    private int height;

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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int area() {
        return 2*((getBreadth()*getLength())+(getHeight()*getLength())+(getHeight()*getBreadth()));
    }
}
