// Zuhair Farhan, 27100
// Week 2,  Lab Assignment 2 (24-01-23)

import java.util.*;

public class Car
{
    String make;
    String model;
    int year;
    String colour;
    int wheels;
    int doors;

    Car(String make, String model, int year, String colour, int wheels, int doors)
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.colour = colour;
        this.wheels = wheels;
        this.doors = doors;
    }

    public String details ()
    {
       return "Car make: " + this.make + "\nCar model: " + this.model + "\nCar Year: " + this.year + "\nCar Colour: " + this.colour + "\nCar Wheels: " + this.wheels + "\nCar Doors: " + this.doors;
    }

    public static void main (String[] args)
    {
        Car[] my_cars = new Car[3];
        my_cars[0] = new Car("Toyota", "Camry", 2007, "red", 4, 2);
        my_cars[1] = new Car("Suzuki", "Mehran", 1999, "yellow", 4, 3);
        my_cars[2] = new Car("Toyota", "Vigo", 2019, "Black", 4, 4);

        System.out.println(my_cars[0].details());
        System.out.println();
        System.out.println(my_cars[1].details());
        System.out.println();
        System.out.println(my_cars[2].details());
        System.out.println();
    }
}