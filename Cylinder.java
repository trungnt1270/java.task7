package bt.task7;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(){
        super(); // invoke superclass' constructo Circle()
        this.height = 1.0;
        System.out.println("Constructed a Cylinder with Cylinder()"); // for debug
    }

    public Cylinder(double height){
        super();
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height)"); // for debug
    }

    public Cylinder(double height, double radius){
        super(radius);
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height, radius)"); // for debug
    }

    public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height, radius, color)"); // for debug
    }

    //Getter and Setter
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height = height;
    }

    /** Return the volumme of this Cylinder */
    public  double getVolume(){
        return getArea()*height; // use circle's getArea()
    }

    /** return a self-descriptive String */
    public String toString(){
        return "This is a Cylinder"; // to be refined later
    }

    // Override the getArea() method inherited from superclass Circle
    @Override
    public double getArea(){
        return 2*Math.PI*getRadius()*height + 2*super.getArea();
    }
    //Need to change the getVolume() as well

//    public double getVolume(){
//        return super.getArea()*height;
//    }

    //Override the inherited toString()
//    @Override
//    public String toString(){
//        return "Cylinder[" + super.toString() + ", height=" + height + "]";
//    }
}
