package bt.task7;

public class TestCylinder {
    public static void main(String[] args){
        Cylinder cy1 = new Cylinder();
        //Construced a Circle with Circle()
        //Construced a Cylinder with Cylinder()
        System.out.println("Radius is " + cy1.getRadius()
        + ", Height is : " + cy1.getHeight()
        + ", Color is " + cy1.getColor()
        + ", Volume is " + cy1.getVolume());
        // radius is 1.0, height is 1.0, color is red,
        // base area is 3.1415926, volume is 3.1415926

        Cylinder cy2 = new Cylinder(5.0,2.0);
        System.out.println("Radius is " + cy2.getRadius()
                + ", Height is : " + cy2.getHeight()
                + ", Color is " + cy2.getColor()
                + ", Volume is " + cy2.getVolume());
        // radius is 2.0, height is 5.0, color is red,
        // base area is 12.566, volume is 62.831
    }
}
