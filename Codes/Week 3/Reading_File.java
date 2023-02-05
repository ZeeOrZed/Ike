// Zuhair Farhan, 27100
// Week 3 (31-01-23), Reading File Class (Task 4)

import java.io.*;
import java.util.*;

public class Reading_File
{
    public static void main(String[] args) throws Exception
    {
        File file = new File("Students_File.txt");
        Scanner input = new Scanner(file);
        FileWriter output = new FileWriter(file, true);

        byte student_no = 1;
        String student_first_name;
        String student_last_name;
        String best_student_first_name = "";
        String best_student_last_name = "";
        String line;

        int[] marks = new int[5];
        int failed = 0;
        int total = 0;
        int max = -99999;
        int student_index = -1;

        input.nextLine();
        student_first_name = input.nextLine().split(" ")[2];
        student_last_name = input.nextLine().split(" ")[2];
        input.nextLine();

        while(input.hasNext())
        {
            for (int i = 0; i < marks.length ; i++)
            {
                line = input.nextLine();
                String[] split = line.split(" ");
                marks[i] = Integer.parseInt(split[1]);
            }

            for (int i = 0; i < marks.length ; i++)
            {
                if (marks[i] < 50)
                {
                    total = 0;
                    failed++;
                    break;
                }
                else
                    total = total + marks[i];
            }

            if (total > max)
            {
                student_index = student_no;
                best_student_first_name = student_first_name;
                best_student_last_name = student_last_name;
                max = total;
            }

            total = 0;
            student_no++;

            input.nextLine();
            input.nextLine();
            input.nextLine();
            student_first_name = input.nextLine().split(" ")[2];
            student_last_name = input.nextLine().split(" ")[2];
            input.nextLine();
        }

        if (failed == 20)
        {
            output.write("\n");
            output.write("\n");
            output.write("There is no high achiever in this class. Everyone is a failure.");
        }
        else
        {
            output.write("\n");
            output.write("\n");
            output.write("The highest scorer of the class is: " + best_student_first_name + " " + best_student_last_name + "! Congratulations " + best_student_first_name + "!");
            output.write("\n");
            output.write("Student number: " + (student_index));
        }

        input.close();
        output.close();
    }
}
