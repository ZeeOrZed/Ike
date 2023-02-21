package Task2;

public class Cylinder extends Shape
{
    private double height;
    private double radius;

    // Constructor
    public Cylinder(double height, double radius)
    {
        super();
        this.height = height;
        this.radius = radius;
    }

    // Getters
    public double get_height()
    {
        return height;
    }
    public double get_radius()
    {
        return radius;
    }

    // To_String
    public String toString()
    {
        return super.toString() + "\nShape Type: " + get_shape_type() +
                "\nShape Surface Area: " + get_surface_area() + "\nShape Volume: " + get_volume();
    }


    public double get_surface_area()
    {
        return 2 * Math.PI * radius * (radius + height);
    }
    public double get_volume()
    {
        return height * Math.PI * Math.pow(radius, 2);
    }
    public String get_shape_type()
    {
        return "Cylinder";
    }
}
