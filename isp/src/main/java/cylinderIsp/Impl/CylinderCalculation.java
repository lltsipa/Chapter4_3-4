package cylinderIsp.Impl;

import cylinderIsp.Cylinder;
import cylinderIsp.SurfaceArea;
import cylinderIsp.Volume;

/**
 * Created by lodz on 2016/03/28.
 */
public class CylinderCalculation implements Cylinder, Volume, SurfaceArea{
    int radius;
    int height;
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

    public int volume() {
        return ((22/7)*(getRadius()*getRadius())*getHeight());
    }

    public int surfaceArea() {
        return (2*(22/7)*getRadius()*getHeight())+(2*(22/7)*(getRadius()*getRadius()));
    }
}
