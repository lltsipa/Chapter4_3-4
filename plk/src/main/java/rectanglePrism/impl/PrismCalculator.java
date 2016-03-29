package rectanglePrism.impl;

import rectanglePrism.IPrisimCalculations;
import rectanglePrism.IRectanglePrism;
import rectanglePrismViolate.IPrismCalculationsViolate;
import rectanglePrismViolate.IRectanglePrismViolate;

/**
 * Created by lodz on 2016/03/29.
 */
public class PrismCalculator implements IPrisimCalculations {

    IPrisimCalculations iPrisimCalculations;

    public PrismCalculator()
    {
        iPrisimCalculations = new PrismCalculation();

    }

    public int surfaceArea(IRectanglePrism iRectanglePrism) {
        return 2*((iRectanglePrism.getWidth()*iRectanglePrism.getLength())+(iRectanglePrism.getHeight()*iRectanglePrism.getLength())+(iRectanglePrism.getHeight()*iRectanglePrism.getWidth()));
    }

    public int volume(IRectanglePrism iRectanglePrismViolate) {
        return 0;
    }
}
