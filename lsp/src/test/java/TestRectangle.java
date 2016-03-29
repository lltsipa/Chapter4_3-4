import cube.areaImpl.Rectangle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lodz on 2016/03/28.
 */
public class TestRectangle {
    private Rectangle rectangle;

    @Before
    public void setUp() throws Exception {
        rectangle = new Rectangle();
        rectangle.setBreadth(2);
        rectangle.setLength(2);
    }

    @Test
    public void testArea() throws Exception {
        Assert.assertEquals(4,rectangle.area());

    }
}
