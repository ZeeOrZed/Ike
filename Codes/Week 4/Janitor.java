public class Janitor extends Employee
{

    public int get_hours ()
    {
        return super.get_hours() * 2;
    }
    public int get_salary ()
    {
        return super.get_salary() - 10000;
    }
    public int get_vacation_days()
    {
        return super.get_vacation_days() / 2;
    }
    public void clean ()
    {
        System.out.println("Workin' for the man.");
    }

}