package Problem4.Java;

import Problem1andProblem2.Java.LinkedList;

public class MakingStrings
{
    public static void dp_str (LinkedList l)
    {
        int index = 0;
        while (true)
        {
            if (l.get_val(index) != 0)
                System.out.print((char)l.get_val(index));
            else
                break;
            index++;
        }
    }
}
