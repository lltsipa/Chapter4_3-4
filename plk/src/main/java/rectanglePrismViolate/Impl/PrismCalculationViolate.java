package rectanglePrismViolate.Impl;

import rectanglePrism.IRectanglePrism;
import rectanglePrism.impl.RectanglePrism;
import rectanglePrismViolate.IPrismCalculationsViolate;
import rectanglePrismViolate.IRectanglePrismViolate;

/**
 * Created by lodz on 2016/03/28.
 */
public class PrismCalculationViolate implements IPrismCalculationsViolate {
    IRectanglePrism iRectanglePrism;

    public PrismCalculationViolate()
    {
        iRectanglePrism = new RectanglePrism();
    }
    public int surfaceArea(IRectanglePrismViolate iRectanglePrismViolate) {
       // return 2 * ((iRectanglePrismViolate.getWidth()*iRectanglePrismViolate.getLength());

        return 2*((iRectanglePrism.getWidth()*iRectanglePrism.getLength())+(iRectanglePrism.getHeight()*iRectanglePrism.getLength())+(iRectanglePrism.getHeight()*iRectanglePrism.getWidth()));
    }

    public int volume(IRectanglePrismViolate iRectanglePrismViolate) {
        return iRectanglePrismViolate.getLength() * iRectanglePrismViolate.getWidth() * iRectanglePrismViolate.getHeight();
    }
}
