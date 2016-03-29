import circle.Impl.CircleCircumfrence;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lodz on 2016/03/28.
 */
public class TestCircumfrence {
    private CircleCircumfrence circumfrence;

    @Before
    public void setUp() throws Exception {
        circumfrence = new CircleCircumfrence(circumfrence);
        circumfrence.setRadius(2);
    }

    @Test
    public void testCircumfrence() throws Exception {
        Assert.assertEquals(12,circumfrence.circumfrence());
    }
}
