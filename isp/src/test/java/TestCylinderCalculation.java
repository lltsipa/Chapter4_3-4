import cylinderIsp.Impl.CylinderCalculation;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lodz on 2016/03/28.
 */
public class TestCylinderCalculation
{
    private CylinderCalculation cylinderCalculation;

    @Before
    public void setUp() throws Exception {
        cylinderCalculation = new CylinderCalculation();
        cylinderCalculation.setRadius(2);
        cylinderCalculation.setHeight(2);
    }

    @Test
    public void testSurfaceArea() throws Exception {
        Assert.assertEquals(48,cylinderCalculation.surfaceArea());
    }

    @Test
    public void testVolume() throws Exception {
        Assert.assertEquals(24,cylinderCalculation.volume());
    }
}
