package cylinderIsp.Impl;

import cylinderIsp.Cylinder;
import cylinderIsp.SurfaceArea;

/**
 * Created by lodz on 2016/03/28.
 */
public class SurfaceAreaImpl implements SurfaceArea, Cylinder {
    int radius;
    int height;
    public int surfaceArea() {
        return (2*(22/7)*getRadius()*getHeight())+(2*(22/7)*(getRadius()*getRadius()));
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int getRadius()
    {
        return radius;
    }

    public int getHeight() {
        return height;
    }
}
