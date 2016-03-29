package shapesViolate.circleApplicationViolate;

import shapes.circleDetails.CircleDetails;
import shapesViolate.circleDetails.CircleDetailsViolate;

/**
 * Created by lodz on 2016/03/29.
 */
public class CircleCulculation extends CircleDetails{
    CircleDetailsViolate circleDetails;

    public int area()
    {
        return (22/7)*(circleDetails.getRadius()*circleDetails.getRadius());
    }
    public int circumfrence()
    {
        return 2*(22/7)*circleDetails.getRadius();
    }
}
