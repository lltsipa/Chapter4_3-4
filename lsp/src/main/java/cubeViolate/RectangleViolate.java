package cubeViolate;

/**
 * Created by lodz on 2016/03/28.
 */
public class RectangleViolate {
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

    public int area()
    {
        return getBreadth()*getLength();
    }
}
