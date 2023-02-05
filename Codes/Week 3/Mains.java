// Zuhair Farhan, 27100
// Week 3 (31-01-23), Main Class

import java.io.*;
import java.util.*;
import java.util.concurrent.ExecutionException;

public class Mains
{
    public static void main(String[] args) throws Exception
    {
        String[] first_name = {"Jacob", "Quinn", "Liam", "Markus", "Nate", "Andy", "Wally", "Bob", "Danny"};
        String[] last_name = {"Smith", "Roth", "John", "Rhein", "Khan", "Mason", "Stevens", "Xavier", "Zack", "Dawson"};

        byte failed = 0;
        int total = 0;
        int max = -99999;
        int student_index = -1;

        Student[] students = new Student[20];

        File file = new File("Students_File.txt");
        PrintWriter output = new PrintWriter(file);

        System.out.println(students.length);

        for (int i = 0; i < students.length; i++)
        {
            System.out.println();
            students[i] = new Student(randomName(first_name, last_name));
            System.out.println("Student #" + (i+1));
            System.out.println(students[i].getDetails());

            output.println("Student #" + (i+1));
            output.println(students[i].getDetails());
            output.println();

            for (int j = 1; j <= 9 ; j+=2)
            {
                if (Integer.parseInt(students[i].courses[j]) < 50)
                {
                    total = 0; // done so that if a student failed in a subject but did very well in the others, it won't be possible for him to be the high achiever.
                    failed++;
                    break;
                }
                else
                    total = total + Integer.parseInt(students[i].courses[j]);
            }

            if (total > max)
            {
                student_index = i;
                max = total;
            }

            total = 0;
        }


        if (failed == 20)
        {
            System.out.println();
            System.out.println("There is no high achiever in this class. Everyone is a failure.");
        }
        else
        {
            System.out.println();
            System.out.println("The highest scorer of the class is: " + students[student_index].first_name + " " + students[student_index].last_name + "! Congratulations " + students[student_index].first_name + "!");
            System.out.println("Student number: " + (student_index+1));
        }

        output.println("----- ----- -----");
        output.println("----- ----- ----- -----");
        output.println("----- ----- ----- -----");
        output.println("----- ----- -----");
        output.close();
    }

    public static String randomName (String[] first_name, String[] last_name)
    {
        return first_name[(int)(Math.random()*9)] + " " + last_name[(int)(Math.random()*9)];
    }
}