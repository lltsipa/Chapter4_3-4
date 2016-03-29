package circle.Impl;

import circle.Area;
import circle.Circumfrence;

/**
 * Created by lodz on 20i16/03/28.
 */
public class Circle implements Area, Circumfrence{
    Area area;
    CircleArea circleArea = new CircleArea(area);
    Circumfrence circumfrence;
    CircleCircumfrence circleCircumfrence = new CircleCircumfrence(circumfrence);
    private int radius;


    public void setArea(Area area)
    {
        this.area = area;
    }

    public void setCircumfrence(Circumfrence circumfrence)
    {
        this.circumfrence = circumfrence;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        circleCircumfrence.setRadius(radius);

    }

    public int area() {
        return circleArea.area();
    }

    public int circumfrence() {
        return circleCircumfrence.circumfrence();
    }
}
