import java.io.*;
import java.util.*;
import java.util.concurrent.ExecutionException;

public class Mains
{
    public static void main(String[] args) throws Exception
    {
        String[] first_name = {"Jacob", "Quinn", "Liam", "Markus", "Nate", "Andy", "Wally", "Bob", "Danny"};
        String[] last_name = {"Smith", "Roth", "John", "Rhein", "Khan", "Mason", "Stevens", "Xavier", "Zack", "Dawson"};

        int total = 0;
        int max = -99999;
        int student_index = -1;

        Student[] students = new Student[20];

        File file = new File("Students_File.txt");
        PrintWriter output = new PrintWriter(file);

        for (int i = 0; i <= 19; i++)
        {
            students[i] = new Student(randomName(first_name, last_name));
            System.out.println("Student " + (i+1));
            System.out.println(students[i].getDetails());

            output.println("Student " + (i+1));
            output.println(students[i].getDetails());

            for (int j = 1; j <= 9 ; j+=2)
                    total = total + Integer.parseInt(students[i].courses[j]);

                if (total > max)
                {
                    student_index = i;
                    max = total;
                }

            total = 0;
        }

        System.out.println("The highest scorer of the class is: " + students[student_index].first_name + " " + students[student_index].last_name);
        System.out.println("Student number: " + (student_index+1));

        output.close();
    }

    public static String randomName (String[] first_name, String[] last_name)
    {
        return first_name[(int)(Math.random()*9)] + " " + last_name[(int)(Math.random()*9)];
    }
}