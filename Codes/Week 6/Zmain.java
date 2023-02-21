package Task1;

public class Zmain
{
    public static void main (String[] args)
    {
        Employee[] workers = new Employee[5];
        workers[0] = new SalaryEmployee("Martin", "Dow", 500.0);
        workers[1] = new HourlyEmployee("Mason", "Casper", 21.0, 11);
        workers[2] = new SalaryEmployee("Bill", "Late", 2100.0);
        workers[3] = new HourlyEmployee("Neil", "Arnold", 25.0, 14);
        workers[4] = new SalaryEmployee("John", "Hammond", 1700.0);

        System.out.println(workers[0].to_string());
        System.out.println();
        System.out.println(workers[1].to_string());
        System.out.println();
        System.out.println(workers[2].to_string());
        System.out.println();
        System.out.println(workers[3].to_string());
        System.out.println();
        System.out.println(workers[4].to_string());
        System.out.println();

    }
}
