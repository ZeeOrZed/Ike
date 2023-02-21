package Task2;

public class Cuboid extends Shape
{
    private double length;
    private double breadth;
    private double height;

    // Constructor
    public Cuboid (double length, double breadth, double height)
    {
        super();
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    // Getters
    public double get_length()
    {
        return length;
    }
    public double get_breadth()
    {
        return breadth;
    }
    public double get_height()
    {
        return height;
    }

    // To String
    public String toString()
    {
        return super.toString() + "\nShape Type: " + get_shape_type() +
                "\nShape Surface Area: " + get_surface_area() + "\nShape Volume: " + get_volume();
    }


    public double get_surface_area()
    {
         return 2 * (length * (breadth + breadth) * (height + height) * length);
    }
    public double get_volume()
    {
        return length * breadth * height;
    }
    public String get_shape_type()
    {
        return "Cuboid";
    }

}
