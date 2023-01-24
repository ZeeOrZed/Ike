// Zuhair Farhan, 27100
// Week 2,  Lab Assignment 3 (24-01-23)

import java.util.*;

public class Person
{

    String name;
    int age;
    Pet pet;

    Person (String name, int age, Pet pet)
    {
        this.name = name;
        this.age = age;
        this.pet = pet;
    }

    public String get_details()
    {
        return "Name: " + this.name + "\nAge: " + this.age + pet.get_details();
    }

    public static void main (String[] args)
    {
        Pet my_pet = new Pet("Edgar", "Bulldog", 10);
        Person me = new Person("Felix", 21, my_pet);

        System.out.println(me.get_details());
    }
}