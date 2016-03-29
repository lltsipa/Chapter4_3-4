package circle.Impl;

import circle.Circumfrence;

/**
 * Created by lodz on 2016/03/28.
 */
public class CircleCircumfrence implements Circumfrence {

    private int radius;
    Circumfrence circumfrence;

    public CircleCircumfrence(Circumfrence circumfrence)
    {
        this.circumfrence = circumfrence;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int circumfrence() {
        return 2*(22/7)*getRadius();
    }
}
