package shapes.circleCalculation;

import shapes.circleApp.CircleApp;
import shapes.circleApp.CircleSet;

/**
 * Created by lodz on 2016/03/29.
 */
public class CircleApplication {

    CircleApp circleApp;
    CircleSet circleSet;
    public CircleApplication(CircleApp circleApp,CircleSet circleSet)
    {
        this.circleApp = circleApp;
        this.circleSet = circleSet;
    }

    public int area()
    {
        return circleApp.area();
    }

    public int circumfrence()
    {
        return circleApp.circumfrence();
    }
}
