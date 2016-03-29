import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import shapesViolate.AreaCalculatorViolate;
import shapesViolate.CircleViolate;
import shapesViolate.RectangleViolate;

/**
 * Created by lodz on 2016/03/27.
 */
public class TestAreaCalculatorViolate {
    private CircleViolate circleViolate;
    private RectangleViolate rectangleViolate;
    private AreaCalculatorViolate areaCalculatorViolate;

    @Before
    public void setUp() throws Exception {
        circleViolate = new CircleViolate();
        rectangleViolate = new RectangleViolate();
        areaCalculatorViolate = new AreaCalculatorViolate();
        circleViolate.setRadius(2);
        rectangleViolate.setBreadth(2);
        rectangleViolate.setLength(2);
    }

    @Test
    public void testCircleArea() throws Exception {
     //   Assert.assertEquals(12, areaCalculatorViolate.area(circleViolate));

    }

    @Test
    public void testRectangleArea() throws Exception {
        Assert.assertEquals(13,areaCalculatorViolate.area(rectangleViolate));

    }
}
