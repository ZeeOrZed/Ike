// Zuhair Farhan, 27100
// Week 2,  Lab Assignment 3 (24-01-23)

public class Pet
{
    String name;
    String breed;
    int age;

    Pet (String name, String breed, int age)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String get_details ()
    {
        return "\nPet name: " + this.name + "\nPet Breed: " + this.breed + "\nPet age: " + this.age;
    }
}