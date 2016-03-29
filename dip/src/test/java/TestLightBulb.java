import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import powerViolate.lightBulb.LightBulb;
import powerViolate.powerSwitch.PowerSwitch;

/**
 * Created by lodz on 2016/03/28.
 */
public class TestLightBulb {
    private PowerSwitch powerSwitch;
    private LightBulb lightBulb;
    @Before
    public void setUp() throws Exception {
        lightBulb = new LightBulb();
        powerSwitch = new PowerSwitch(lightBulb);

    }

    @Test
    public void testIsOn() throws Exception {
        Assert.assertEquals(true,powerSwitch.isOn());
    }
}
