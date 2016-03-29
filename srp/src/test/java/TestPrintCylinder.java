import cylinder.CylinderCalculation;
import cylinder.PrintCylinder;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lodz on 2016/03/27.
 */
public class TestPrintCylinder {
    //private PrintCylinder printCylinder;
    private CylinderCalculation cylinderCalculation;

    @Before
    public void setUp() throws Exception {
        //printCylinder = new PrintCylinder(cylinderCalculation);
        cylinderCalculation = new PrintCylinder(cylinderCalculation);
        cylinderCalculation.setHeight(3);
        cylinderCalculation.setRadius(2);
    }

    @Test
    public void testDisplaySurfaceArea() throws Exception {
        cylinderCalculation.displaySurfaceArea();
    }

    @Test
    public void testDisplayVolume() throws Exception {
        cylinderCalculation.displayVolume();
    }
}
