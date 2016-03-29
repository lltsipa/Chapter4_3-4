import cylinderIsp.Impl.VolumeImpl;
import cylinderIsp.Volume;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lodz on 2016/03/28.
 */
public class TestVolume {
    VolumeImpl volume;

    @Before
    public void setUp() throws Exception {
        volume = new VolumeImpl();
        volume.setHeight(2);
        volume.setRadius(2);
    }

    @Test
    public void testVolume() throws Exception {
        Assert.assertEquals(24, volume.volume());
    }
}
