public class Marketer extends Employee
{

    public int get_salary ()
    {
        return super.get_salary() + 10000;
    }
    public void advertise ()
    {
        System.out.println("Act now, while the supplies last!");
    }

}