package cylinder;

/**
 * Created by lodz on 2016/03/27.
 */
public class PrintCylinder extends CylinderCalculation{
    CylinderCalculation cylinderCalculation;

    public PrintCylinder(CylinderCalculation calculation)
    {
        this.cylinderCalculation = calculation;
    }

    @Override
    public void displaySurfaceArea() {
        System.out.println("The Surface Area of the cylinder is: " + surfaceArea());
    }

    @Override
    public void displayVolume() {
        System.out.println("The volume of the cylinder is: " + volume());
    }
}
