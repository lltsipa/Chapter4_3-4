package shapes;

/**
 * Created by lodz on 2016/03/28.
 */
public class Circle extends Shapes {
    private int radius;

    @Override
    public int area() {
        return  (getRadius() * getRadius()) * (22/7);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
