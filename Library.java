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


        // System.out.println(bookList);

        // System.out.println(MacMasterRaceVolumeOne.getTitle() + " has ISBN: " + MacMasterRaceVolumeOne.getISBN());
    }

    public static boolean isISBNMatching(Book bookHere, ArrayList<Book> list) {
        for (Book book : list) {
            if (book.equals(bookHere)) {
                System.out.println("Library contains \"" + bookHere.getTitle() + "\" with given ISBN: " + bookHere.getISBN());
                return true;
            }
        }
        System.out.println("Library does not contain \"" + bookHere.getTitle() + "\" with given ISBN: " + bookHere.getISBN());
        return false;

    }

    public static void printProblemDescription(){
        System.out.println(description);
    }


}

    /*

    }
    // Mangler at færdiggøres
    public boolean isISBNMatching(Book bookHere, ArrayList<Book> list) {
        if ((list.contains(bookHere.getISBN() = bookHere.getISBN())){
            return true;
        }
            return false;
        }
}


}*/

