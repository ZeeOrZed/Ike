public class Lawyer extends Employee
{

    public int get_vacation_days()
    {
        return super.get_vacation_days() + 7;
    }
    public String get_vacation_form ()
    {
        return "Pink Form";
    }
    public void sue ()
    {
        System.out.println("I will see you in court.");
    }

}