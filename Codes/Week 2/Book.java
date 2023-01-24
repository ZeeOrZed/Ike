// Zuhair Farhan, 27100
// Week 2,  Lab Assignment 1 (24-01-23)

import java.util.*;

public class Book
{
    String title;
    String author;
    String isbn;
    int pages;

    Book(String title, String author, String isbn, int pages)
    {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.pages = pages;
    }

    public String summary()
    {
        return "Book title: " + this.title + "\n Book author: " + this.author + "\n Book isbn: " + this.isbn + "\n Book pages: " + this.pages;
    }

    public static void main (String[] args)
    {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter the Book title: ");
        String title = input.nextLine();
        System.out.println("Enter the Author of the book: ");
        String author = input.nextLine();
        System.out.println("Enter the ISBN number of the book: ");
        String isbn = input.nextLine();
        System.out.println("Enter the number of pages the book: ");
        int pages = input.nextInt();

        Book my_book = new Book(title, author, isbn, pages);

        System.out.println();
        System.out.println(my_book.summary());
    }
}
