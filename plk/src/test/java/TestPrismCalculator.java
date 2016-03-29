import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import rectanglePrism.IPrisimCalculations;
import rectanglePrism.IRectanglePrism;
import rectanglePrism.impl.PrismCalculation;
import rectanglePrism.impl.RectanglePrism;

/**
 * Created by lodz on 2016/03/29.
 */
public class TestPrismCalculator {

    IPrisimCalculations iPrisimCalculations;
    IRectanglePrism iRectanglePrism;
    @Before
    public void setUp() throws Exception {
        iPrisimCalculations = new PrismCalculation();
        iRectanglePrism = new RectanglePrism();
        iRectanglePrism.setWidth(2);
        iRectanglePrism.setLength(2);
        iRectanglePrism.setHeight(2);
    }

    @Test
    public void testArea() throws Exception {
        Assert.assertEquals(24,iPrisimCalculations.surfaceArea(iRectanglePrism));
    }

    @Test
    public void testVolume() throws Exception {
        Assert.assertEquals(8,iPrisimCalculations.volume(iRectanglePrism));
    }
}
