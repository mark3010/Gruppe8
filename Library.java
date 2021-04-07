/*
 Author of Library.java, @Malthe Gram
 */

import java.util.ArrayList;

public class Library {
    private static String description =
            "Skriv en klasse kaldet Bog, der indeholder ISBN-nummer, titel og udgivelsesår.\n" +
                    "Skriv flg. metoder: Constructor, Getters og setters, toString.\n" +
                    "Skriv en klasse kaldet \"Bibliotek\", der indeholder en liste af Bog objekter\n" +
                    "Indsæt tre forskellige bøgeri Biblioteket. Skriv en metode i Bibliotek klassen,\n" +
                    "som tager et Bog objekt som parameter, og returnerer true, hvis listen indeholderet Bog objekt med samme ISBN";

    public static void main(String[] args) {
        printProblemDescription();

        Book MacMasterRaceVolumeOne = new Book(252510, 2019, "MacMasterRaceVolumeOne");
        Book MacMasterRaceVolumeTwo = new Book(252511, 2020, "MacMasterRaceVolumeTwo");
        Book MacMasterRaceVolumeThree = new Book(252512, 2021, "MacMasterRaceVolumeThree");
        Book MacMasterRaceVolumeFour = new Book(252513, 2021, "MacMasterRaceVolumeFour");
        ArrayList<Book> bookList = new ArrayList<>();

        bookList.add(MacMasterRaceVolumeOne);
        bookList.add(MacMasterRaceVolumeTwo);
        bookList.add(MacMasterRaceVolumeThree);
        // System.out.println(bookList);

        // System.out.println(MacMasterRaceVolumeOne.getTitle() + " has ISBN: " + MacMasterRaceVolumeOne.getISBN());

        System.out.println(isISBNMatching(MacMasterRaceVolumeFour, bookList));
    }


    /*

    Flawed idea TBC:

    public static boolean isISBNMatching(Book bookHere, ArrayList<Book> list) {
        if (list.contains(bookHere.getISBN())){
            System.out.println("Library contains \"" + bookHere.getTitle() + "\"with given ISBN: " +bookHere.getISBN());
            return true;

       } else
        System.out.println("Library does not contain \"" + bookHere.getTitle() + "\" with given ISBN: " +bookHere.getISBN());
            return false;
        }

     */

    // Write a method in the library class, which takes a Book object as parameter and returns true,
    // if the list contains a book object with the same ISBN
    public static boolean isISBNMatching(Book bookHere, ArrayList<Book> list) {
        for (Book book : list) {
            if (book.equals(bookHere)) {
                System.out.println("Library contains \"" + bookHere.getTitle() + "\" with given ISBN: " + bookHere.getISBN());
                return true;
            }
        }
                System.out.println("Library does not contain \"" + bookHere.getTitle() + "\" with given ISBN: " +bookHere.getISBN());
                return false;

    }

    public static void printProblemDescription(){
        System.out.println(description);
    }


}

