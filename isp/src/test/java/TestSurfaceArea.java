import cylinderIsp.Impl.SurfaceAreaImpl;
import cylinderViolateIsp.calculationsImpl.SurfaceArea;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lodz on 2016/03/28.
 */
public class TestSurfaceArea {
    SurfaceAreaImpl surfaceArea;

    @Before
    public void setUp() throws Exception {
        surfaceArea = new SurfaceAreaImpl();
        surfaceArea.setRadius(2);
        surfaceArea.setHeight(2);
    }

    @Test
    public void testSurfaceArea() throws Exception {
        Assert.assertEquals(48, surfaceArea.surfaceArea());
    }
}
