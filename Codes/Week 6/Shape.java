package Task2;

public abstract class Shape
{
    private static int number_of_shapes = 0;
    private int id = 1;

    // Constructor
    public Shape()
    {
        number_of_shapes++;
        id = 1 + number_of_shapes;
    }


    // Getters
    public int get_number_of_shapes()
    {
        return number_of_shapes;
    }
    public int get_id()
    {
        return id;
    }

    // To_String
    public String toString()
    {
        return "Number of Shapes: " + number_of_shapes + "\nShape ID: " + id;
    }

    // Abstracted Methods
    public abstract double get_volume();
    public abstract double get_surface_area();
    public abstract String get_shape_type();
}
