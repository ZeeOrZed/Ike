import java.util.*;

public class Student
{
    public String first_name;
    public String last_name;
    String[] courses = {"Math", "", "English", "", "Physics", "", "Chemistry", "", "CS", ""};

    Student(String name)
    {
        Scanner input = new Scanner(name);
        this.first_name = input.next();
        this.last_name = input.next();

        courses[1] = Integer.toString(randomNumberGenerator());
        courses[3] = Integer.toString(randomNumberGenerator());
        courses[5] = Integer.toString(randomNumberGenerator());
        courses[7] = Integer.toString(randomNumberGenerator());
        courses[9] = Integer.toString(randomNumberGenerator());
    }


    private int randomNumberGenerator()
    {
        return (int) (Math.random()*101);
    }

    public String getDetails()
    {
        return "First name: " + first_name + "\nLast name: " + last_name
                + "\n\n" + courses[0] + ": " + courses[1] + calculateGrade(Integer.parseInt(courses[1]))
                + "\n" + courses[2] + ": " + courses[3] + calculateGrade(Integer.parseInt(courses[3])) + "\n"
                + courses[4] + ": " + courses[5] + calculateGrade(Integer.parseInt(courses[5]))
                + "\n" + courses[6] + ": " + courses[7] + calculateGrade(Integer.parseInt(courses[7]))
                + "\n" + courses[8] + ": " + courses[9] + calculateGrade(Integer.parseInt(courses[9])) + "\n";
    }

    private String calculateGrade (int marks)
    {
        if (marks >= 90)
            return " A";
        else if (marks >= 80)
            return " B";
        else if (marks >= 70)
            return " C";
        else if (marks >= 60)
            return " D";
        else if (marks >= 50)
            return " E";
        else
            return " F";
    }
}