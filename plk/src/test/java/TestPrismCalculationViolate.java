import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import rectanglePrism.IPrisimCalculations;
import rectanglePrism.impl.RectanglePrism;
import rectanglePrismViolate.Impl.PrismCalculationViolate;
import rectanglePrismViolate.Impl.RectanglePrismViolate;

/**
 * Created by lodz on 2016/03/29.
 */
public class TestPrismCalculationViolate {
    PrismCalculationViolate prismCalculationViolate;
    RectanglePrismViolate rectanglePrismViolate;
    @Before
    public void setUp() throws Exception {
        prismCalculationViolate = new PrismCalculationViolate();
        rectanglePrismViolate = new RectanglePrismViolate();

        rectanglePrismViolate.setHeight(2);
        rectanglePrismViolate.setLength(2);
        rectanglePrismViolate.setWidth(2);
    }

    @Test
    public void testSurfaceArea() throws Exception {
        Assert.assertEquals(12,prismCalculationViolate.surfaceArea(rectanglePrismViolate));

    }

    @Test
    public void testVolume() throws Exception {
        Assert.assertEquals(12,prismCalculationViolate.volume(rectanglePrismViolate));

    }
}
