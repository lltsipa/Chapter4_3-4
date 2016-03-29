package circle.Impl;

import circle.Area;

/**
 * Created by lodz on 2016/03/28.
 */
public class CircleArea implements Area {
    Area area;
    private int radius;
    public CircleArea(Area area)
    {
        this.area = area;
    }

    public int area()
    {
        return (22/7)*(getRadius()*getRadius());
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
