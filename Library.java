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

    }
    // Mangler at færdiggøres
    public boolean isISBNMatching(Book bookHere, ArrayList<Book> list) {
        if ((list.contains(bookHere.getISBN() = bookHere.getISBN())){
            return true;
        }
            return false;
        }
}


}

