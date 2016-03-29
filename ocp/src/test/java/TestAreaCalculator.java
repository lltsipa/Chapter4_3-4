import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import shapes.AreaCalculator;
import shapes.Circle;
import shapes.Rectangle;

/**
 * Created by lodz on 2016/03/28.
 */
public class TestAreaCalculator {
    private AreaCalculator areaCalculator;
    private Circle circle;
    private Rectangle rectangle;

    @Before
    public void setUp() throws Exception {
        areaCalculator = new AreaCalculator();
        circle = new Circle();
        rectangle = new Rectangle();
        circle.setRadius(2);
        rectangle.setBreadth(2);
        rectangle.setLength(3);
    }

    @Test
    public void testCircleArea() throws Exception {
        Assert.assertEquals(12,areaCalculator.area(circle));

    }

    @Test
    public void testRectangleArea() throws Exception {
        Assert.assertEquals(6,areaCalculator.area(rectangle));
    }
}
