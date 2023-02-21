package Task2;

public class Sphere extends Shape {
    private double radius;

    // Constructor
    public Sphere(double radius) {
        super();
        this.radius = radius;
    }

    // Getter
    public double get_radius() {
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
        return 4 * Math.PI * Math.pow(radius, 2);
    }
    public double get_volume()
    {
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }
    public String get_shape_type()
    {
        return "Sphere";
    }
}
