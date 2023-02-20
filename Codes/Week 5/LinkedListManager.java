package Problem1andProblem2.Java;

import Problem3.Java.StoringStrings;

import static Problem3.Java.StoringStrings.*;
import static Problem4.Java.MakingStrings.*;

public class LinkedListManager
{
    public static void main(String[] args)
    {
        LinkedList l = new LinkedList();

        l.append(2);
        l.append(11);
        l.append(77);
        l.append(101);
        l.add(3, 1);
        l.print_linked_list();
        System.out.println();

        l.remove_index(0);
        l.remove_index(0);
        l.remove_index(1);
        l.print_linked_list();
        System.out.println();

        l.upd_ll_with_ys(str_vals(str_str()));
        l.print_linked_list();
        System.out.println();

        System.out.println("The string that is made from the ASCII values stored in your linked list is: ");
        dp_str(l);
    }
}