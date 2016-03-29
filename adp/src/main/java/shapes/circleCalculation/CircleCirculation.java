package shapes.circleCalculation;

import shapes.circleApp.*;
import shapes.circleDetails.*;

/**
 * Created by lodz on 2016/03/29.
 */
public class CircleCirculation extends CircleDetails implements CircleApp,CircleSet {

    CircleSet circleSet;
    public CircleCirculation(CircleSet circleSet)
    {
        this.circleSet = circleSet;
    }

    public int area() {
        return (22/7)*(circleSet.getRadius()*circleSet.getRadius());
    }

    public int circumfrence() {
        return 2*(22/7)*circleSet.getRadius();
    }
}
