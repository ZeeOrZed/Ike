package Task1;

public class HourlyEmployee extends Employee
{
    private double hourly_wage;
    private int hours_worked;

    // Constructor
    public HourlyEmployee (String first_name, String last_name, double wage, int hours)
    {
        super(first_name, last_name);
        hourly_wage = wage;
        hours_worked = hours;
    }

    // Getters
    public double get_hourly_wage()
    {
        return hourly_wage;
    }
    public int get_hours_worked()
    {
        return hours_worked;
    }

    // Setters
    public void set_hourly_wage(double wage)
    {
        hourly_wage = wage;
    }
    public void set_hours_worked(int hours)
    {
        hours_worked = hours;
    }

    // To_String
    public String to_string ()
    {
        return super.to_string() + "\nHourly Wage: " + hourly_wage + "\nHours Worked: " + hours_worked + "\nEarnings :" + earnings();
    }


    // Earnings Method
    public double earnings()
    {
        return hourly_wage * hours_worked;
    }
}