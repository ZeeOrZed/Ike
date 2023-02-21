package Task1;

public abstract class Employee {
    private String fname;
    private String lname;

    // Constructor
    public Employee(String first_name, String last_name)
    {
        fname = first_name;
        lname = last_name;
    }

    // Getters
    public String get_fname()
    {
        return fname;
    }
    public String get_lname()
    {
        return lname;
    }

    // Setters
    public void set_fname (String first_name)
    {
        fname = first_name;
    }
    public void set_lname (String last_name)
    {
        lname = last_name;
    }

    // To_String

    public String to_string ()
    {
        return fname + " " + lname;
    }

    // Abstracted Earnings Method
    public abstract double earnings();
}