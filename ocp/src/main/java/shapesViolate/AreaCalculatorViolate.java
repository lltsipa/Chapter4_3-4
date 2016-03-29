package shapesViolate;

/**
 * Created by lodz on 2016/03/27.
 */
public class AreaCalculatorViolate {
    public int area(Object obj)
    {
        RectangleViolate rectangleViolate = new RectangleViolate();
       //
        int area =0;

        if(rectangleViolate.equals(obj))
        {
          //  RectangleViolate rectangleViolate = new RectangleViolate();
            area = rectangleViolate.getBreadth()* rectangleViolate.getLength();
        }else
        {
            CircleViolate circleViolate = new CircleViolate();
            area = circleViolate.getRadius() * circleViolate.getRadius() * (22/7);
        }

        return area;
    }
}
