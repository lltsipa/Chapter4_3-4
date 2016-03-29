import cylinderViolateIsp.CylinderViolate;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lodz on 2016/03/27.
 */
public class TestCylinderViolate {
    private CylinderViolate cylinderViolate;

    @Before
    public void setUp() throws Exception {
        cylinderViolate = new CylinderViolate();
        cylinderViolate.setHeight(3);
        cylinderViolate.setRadius(2);
    }

    @Test
    public void testSurfaceArea() throws Exception {
        Assert.assertEquals(60,cylinderViolate.surfaceArea());
    }

    @Test
    public void testVolume() throws Exception {
        Assert.assertEquals(36,cylinderViolate.volume());
    }

    @Test
    public void testPrintSurfaceArea() throws Exception {
        cylinderViolate.displaySurfaceArea();
    }

    @Test
    public void testPrintVolume() throws Exception {
        cylinderViolate.displayVolume();

    }
}
