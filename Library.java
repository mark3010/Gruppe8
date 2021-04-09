/*
 Author of Library.java, @Malthe Gram
 */


import java.util.ArrayList;
import java.util.Scanner;


public class Library {
    private final static String description =
            """
                    Skriv en klasse kaldet Bog, der indeholder ISBN-nummer, titel og udgivelsesår.
                    Skriv flg. metoder: Constructor, Getters og setters, toString.
                    Skriv en klasse kaldet "Bibliotek", der indeholder en liste af Bog objekter
                    Indsæt tre forskellige bøgeri Biblioteket. Skriv en metode i Bibliotek klassen,
                    som tager et Bog objekt som parameter, og returnerer true, hvis listen indeholderet Bog objekt med samme ISBN""";

    public static void printProblemDescription () {
            System.out.println(description);
        }

    public static boolean isISBNMatching(Book bookHere, ArrayList<Book> list) {
        // For each loop: Goes through each book in the list
        for (Book book : list) {
            // Using == since we're comparing ISBN, which is an int, which is a primitive data type.
            if (book.getISBN() == (bookHere.getISBN())) {
                System.out.println("Searching by ISBN, library contains \"" + bookHere.getTitle() + "\" with given ISBN: " + bookHere.getISBN());
                return true;
            }
        }
        System.out.println("Searching by ISBN, library does not contain \"" + bookHere.getTitle() + "\" with given ISBN: " + bookHere.getISBN());
        return false;

    }

    public static boolean isTitleMatching(Book bookHere, ArrayList<Book> list) {
        // For each loop: Goes through each book in the list
        for (Book book : list) {
            // Using .equals since we're comparing titles, which is a String, which is an Object.
            if (book.getTitle().equals(bookHere.getTitle())) {
                System.out.println("Searching by title, library contains \"" + bookHere.getTitle() + "\" with given ISBN: " + bookHere.getISBN());
                return true;
            }
        }
        System.out.println("Searching by title, library does not contain \"" + bookHere.getTitle() + "\" with given ISBN: " + bookHere.getISBN());
        return false;

    }

    public static boolean isTheBookInTheLibrary(String titleInput, ArrayList<Book> list) {

        for (Book book : list) {

            if (titleInput.equals(book.getTitle())) {
                System.out.println("Searching by user input: Library contains \"" + titleInput + "\" with given ISBN: " + book.getISBN());
                return true;
            } else {
                System.out.println("Searching by user input: Library does not contains \"" + titleInput + "\"");
                return false;

            }
        }
                 return false;

    }

  /*  public static void addBookToLibrary(String titleInput, ArrayList<String> list) {
            Scanner yesNo = new Scanner(System.in);

            System.out.println("Would you like to add \"" + titleInput + "\" to the library?");
            yesNo.nextLine();
            if (titleInput.equals("Yes") || titleInput.equals("yes")) {
                list.add(titleInput);

            } else if (titleInput.equals("No") || titleInput.equals("no"))
                System.out.println("Terminating program");
        }

   */



}



