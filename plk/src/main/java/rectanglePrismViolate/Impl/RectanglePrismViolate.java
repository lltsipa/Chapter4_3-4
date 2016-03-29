package rectanglePrismViolate.Impl;

import rectanglePrismViolate.IRectanglePrismViolate;

/**
 * Created by lodz on 2016/03/28.
 */
public class RectanglePrismViolate implements IRectanglePrismViolate{
    int length;
    int height;
    int width;

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
