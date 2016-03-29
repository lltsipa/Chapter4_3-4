package cubeViolate;

/**
 * Created by lodz on 2016/03/28.
 */
public class PrismViolate extends RectangleViolate{
  //  private int length;
   // private int breadth;
    private int height;
    //private RectangleViolate rectangleViolate = new RectangleViolate();


    public void setLength(int length) {
        super.setLength(length);
        //this.length = leng
    }

    public void setBreadth(int breadth) {
       // this.breadth = breadth;
        super.setBreadth(breadth);
    }

    public int area()
    {
        return 2*((getBreadth()*getLength())+(getHeight()*getLength())+(getHeight()*getBreadth()));
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
