import cylinder.CylinderCalculation;
import cylinder.PrintCylinder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lodz on 2016/03/27.
 */
public class TestCylinderCalculation {
    private CylinderCalculation cylinderCalculation;

    @Before
    public void setUp() throws Exception {
        cylinderCalculation = new PrintCylinder(cylinderCalculation);
        cylinderCalculation.setRadius(2);
        cylinderCalculation.setHeight(3);
    }

    @Test
    public void testSurfaceArea() throws Exception {
        Assert.assertEquals(60, cylinderCalculation.surfaceArea());
    }

    @Test
    public void testVolume() throws Exception {
        Assert.assertEquals(36,cylinderCalculation.volume());
    }
}
