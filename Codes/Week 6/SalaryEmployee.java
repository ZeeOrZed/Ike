package Task1;

public class SalaryEmployee extends Employee
{
    private double weekly_salary;

    // Constructor
    public SalaryEmployee(String first_name, String last_name, Double weekly_salary)
    {
        super(first_name, last_name);
        this.weekly_salary = weekly_salary;
    }

    // Getter
    public double get_weekly_salary()
    {
        return weekly_salary;
    }

    // Setter
    public void set_weekly_salary(double money)
    {
        weekly_salary = money;
    }

    // To_String
    public String to_string ()
    {
        return super.to_string() + "\nWeekly Salary: " + weekly_salary + "\nEarnings: " + earnings();
    }


    // Earnings Method
    public double earnings()
    {
        return weekly_salary * 4;
    }

}