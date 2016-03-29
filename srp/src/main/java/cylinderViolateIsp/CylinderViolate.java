package cylinderViolateIsp;

/**
 * Created by lodz on 2016/03/27.
 */
public class CylinderViolate {
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    //Responsibility: Calculations
    public int surfaceArea()
    {
        return (2*(22/7)*getRadius()*getHeight())+(2*(22/7)*(getRadius()*getRadius()));
    }
    public int volume()
    {
        return ((22/7)*(getRadius()*getRadius())*getHeight());
    }

    //Responsibility: Print out Text
    public void displaySurfaceArea()
    {
        System.out.println("The Surface Area of the cylinder is: " + surfaceArea());
    }
    public void displayVolume()
    {
        System.out.println("The volume of the cylinder is: " + volume());
    }

}
