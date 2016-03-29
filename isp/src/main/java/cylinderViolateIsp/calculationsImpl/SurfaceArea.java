package cylinderViolateIsp.calculationsImpl;

import cylinderIsp.Cylinder;
import cylinderViolateIsp.Calculations;

/**
 * Created by lodz on 2016/03/28.
 */
public class SurfaceArea implements Cylinder, cylinderIsp.SurfaceArea {
    int radius;
    int height;
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public int getRadius()
    {
        return this.radius;
    }

    public int surfaceArea() {
        return (2*(22/7)*getRadius()*getHeight())+(2*(22/7)*(getRadius()*getRadius()));
    }
}
