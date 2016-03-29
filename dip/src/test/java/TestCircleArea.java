import circle.Area;
import circle.Impl.CircleArea;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lodz on 2016/03/28.
 */
public class TestCircleArea {
    private CircleArea circleArea;


    @Before
    public void setUp() throws Exception {
        circleArea = new CircleArea(circleArea);
        circleArea.setRadius(2);
    }

    @Test
    public void testArea() throws Exception {
        Assert.assertEquals(12,circleArea.area());

    }
}
