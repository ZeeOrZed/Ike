package Problem1andProblem2.Java;

public class LinkedList
{
    Node head;

    public void append(int data)
    {
        if (head == null)
        {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null)
        {
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void remove(int data)
    {
        if (head == null)
        {
            return;
        }
        if (head.data == data)
        {
            head = head.next;
            System.out.println(" removed ");
            return;
        }
        Node current = head;
        while (current.next != null)
        {
            if (current.next.data == data)
            {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    // Problem 2 solution below

    public void add (int index, int data)
    {
        if (head == null)
        {
            head = new Node(data);
            return;
        }
        else
        {
            Node current = head;
            int count = 0;
            while (current.next != null && count < index-1)
            {
                current = current.next;
                count++;
            }
            Node add = new Node(data);
            add.next = current.next;
            current.next = add;
        }
    }

    public void remove_index (int index)
    {
        int count = 0;
        Node current = head;

        if (count == index)
                head = current.next;
        else
        {
            while (current.next != null && count < index - 1)
            {
                current = current.next;
                count++;
            }
            if (current.next != null)
                current.next = current.next.next;

        }
    }

    public void remove_occurrences (int num)
    {
        Node current = head;
        Node new_head = new Node(0);

        while (head.data == num)
        {
            new_head.data = current.next.data;
            new_head.next = current.next.next;
            head = new_head;
        }

        current = head.next;
        Node new_rep = new Node(0);
        while (current.next != null)
        {
            if (current.data == num)
            {
                new_rep.data = current.next.data;
                new_rep.next = current.next.next;
                current.next = new_rep;
                current = current.next;
            }
            else
                current = current.next;
        }
    }

    public void print_linked_list ()
    {
        Node current = head;
        while (current.next != null)
        {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println(current.data);
    }


    // Half of the Solution of Problem 3 below (Other Half in "StoringStrings" Class)

    public void upd_ll_with_ys (int[] values)
    {
        for (int i = 0; i < values.length; i++)
            add(999999, values[i]);
    }


    // Half of the Solution of Problem 4 is below (Other Half in "MakingStrings" Class)

    public int get_val (int count)
    {
        Node current = head;
        int index = 0;
        while (current.next != null && index < count)
        {
            current = current.next;
            index++;
        }

        if (index == count)
            return current.data;
        else
            return 0;
    }

}