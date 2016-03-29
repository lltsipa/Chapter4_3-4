import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import shapes.circleApp.*;
import shapes.circleCalculation.CircleApplication;
import shapes.circleCalculation.CircleCirculation;
import shapes.circleDetails.CircleDetails;

/**
 * Created by lodz on 2016/03/29.
 */
public class TestCircleApplication {
    CircleApp circleApp;
    CircleSet circleSet;
    CircleApplication circleApplication;
    @Before
    public void setUp() throws Exception {
        circleSet = new CircleDetails();
        circleApp = new CircleCirculation(circleSet);
        circleSet.setRadius(2);

        circleApplication = new CircleApplication(circleApp,circleSet);
    }

    @Test
    public void testArea() throws Exception {
        Assert.assertEquals(12,circleApplication.area());

    }

    @Test
    public void testCircumfrence() throws Exception {
        Assert.assertEquals(12,circleApplication.circumfrence());
    }
}
