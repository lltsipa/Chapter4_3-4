package shapesViolate.circleDetails;

import shapes.circleApp.CircleSet;
import shapesViolate.circleAppViolate.CircleAppViolate;
import shapesViolate.circleAppViolate.CircleSetViolate;

/**
 * Created by lodz on 2016/03/29.
 */
public class CircleDetailsViolate implements CircleSetViolate {
    int radius;
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }
}
