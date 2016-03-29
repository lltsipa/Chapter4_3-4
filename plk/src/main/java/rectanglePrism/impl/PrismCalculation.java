package rectanglePrism.impl;

import rectanglePrism.IPrisimCalculations;
import rectanglePrism.IRectanglePrism;

/**
 * Created by lodz on 2016/03/29.
 */
public class PrismCalculation implements IPrisimCalculations{
    public int surfaceArea(IRectanglePrism iRectanglePrism) {
        return 2*((iRectanglePrism.getWidth()*iRectanglePrism.getLength())+(iRectanglePrism.getHeight()*iRectanglePrism.getLength())+(iRectanglePrism.getHeight()*iRectanglePrism.getWidth()));
    }

    public int volume(IRectanglePrism iRectanglePrism) {
        return iRectanglePrism.getHeight()*iRectanglePrism.getLength()*iRectanglePrism.getWidth();
    }
}
