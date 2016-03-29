import cubeViolate.PrismViolate;
import cubeViolate.RectangleViolate;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lodz on 2016/03/28.
 */
public class TestPrismViolate {
    private PrismViolate prismViolate;
    private RectangleViolate rectangleViolate;

    @Before
    public void setUp() throws Exception {
        prismViolate = new PrismViolate();
        rectangleViolate = new PrismViolate();
        prismViolate.setLength(2);
        prismViolate.setLength(2);
        prismViolate.setHeight(2);
    }

    @Test
    public void testSurfaceArea() throws Exception {
        Assert.assertEquals(8,prismViolate.area());

    }

    @Test
    public void testArea() throws Exception {
        Assert.assertEquals(8,rectangleViolate.area());

    }
}
