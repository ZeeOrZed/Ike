package Task2;

public class Cube extends Cuboid
{
    // Constructor
    public Cube (double edge)
    {
        super(edge, edge, edge);
    }


    public String get_shape_type()
    {
        return "Cube";
    }
}