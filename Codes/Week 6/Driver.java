package Task2;

import java.util.ArrayList;
import java.util.Iterator;

public class Driver
{
    public static void main (String[] args)
    {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Sphere(6.0));
        shapes.add(new Cylinder(6.0, 4.0));
        shapes.add(new Cuboid(6.0, 4.0, 5.0));
        shapes.add(new Cube(6.0));

        Iterator<Shape> looper = shapes.iterator();
        while (looper.hasNext())
        {
            System.out.println(looper.next());
            System.out.println();
        }

        /*
        System.out.println(looper.next());
        System.out.println();
        System.out.println(looper.next());
        System.out.println();
        System.out.println(looper.next());
        System.out.println();
        System.out.println(looper.next());
        System.out.println();
        */
    }
}
