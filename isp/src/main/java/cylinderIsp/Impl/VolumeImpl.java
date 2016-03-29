package cylinderIsp.Impl;

import cylinderIsp.Cylinder;
import cylinderIsp.Volume;

/**
 * Created by lodz on 2016/03/28.
 */
public class VolumeImpl implements Volume, Cylinder {
    int radius;
    int height;
    public int volume() {
        return ((22/7)*(getRadius()*getRadius())*getHeight());
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
