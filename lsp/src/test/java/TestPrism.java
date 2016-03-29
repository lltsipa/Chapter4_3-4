import cube.areaImpl.Prism;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lodz on 2016/03/28.
 */
public class TestPrism {
    private Prism prism;

    @Before
    public void setUp() throws Exception {
        prism = new Prism();
        prism.setLength(2);
        prism.setBreadth(2);
        prism.setHeight(2);
    }

    @Test
    public void testArea() throws Exception {
        Assert.assertEquals(24,prism.area());
    }
}
