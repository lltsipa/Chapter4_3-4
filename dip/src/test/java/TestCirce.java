import circle.Impl.Circle;
import circle.Impl.CircleArea;
import circle.Impl.CircleCircumfrence;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lodz on 2016/03/28.
 */
public class TestCirce {
    private Circle circle;
    CircleArea circleArea;
    CircleCircumfrence circleCircumfrence;

    @Before
    public void setUp() throws Exception {
        circle = new Circle();

        circle.setArea(circleArea);
        circle.setCircumfrence(circleCircumfrence);

        circle.setRadius(2);
    }

    @Test
    public void testArea() throws Exception {
        Assert.assertEquals(12,circle.area());

    }

    @Test
    public void testCircumfrence() throws Exception {
        Assert.assertEquals(13,circle.circumfrence());
    }
}
