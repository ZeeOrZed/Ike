package Problem3.Java;

import Problem1andProblem2.Java.Node;
import java.util.*;

public class StoringStrings
{
    public static String str_str ()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a String. We will store the ASCII value of each character of the String in a linked list.");
        System.out.print("Enter your String: ");
        return input.nextLine();
    }

    public static int[] str_vals (String ys)
    {
        int[] values = new int[ys.length()];
        for (int i = 0; i < values.length; i++)
            values[i] = ys.charAt(i);
        return values;
    }
}
