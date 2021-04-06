/*
 Author of Library.java, @Malthe Gram
 */

import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {

        Book MacMasterRaceVolumeOne = new Book(252510, 2019, "MacMasterRaceVolumeOne");
        Book MacMasterRaceVolumeTwo = new Book(252511, 2020, "MacMasterRaceVolumeTwo");
        Book MacMasterRaceVolumeThree = new Book(252512, 2021, "MacMasterRaceVolumeThree");
        ArrayList<Book> bookList = new ArrayList<>();

        bookList.add(MacMasterRaceVolumeOne);
        bookList.add(MacMasterRaceVolumeTwo);
        bookList.add(MacMasterRaceVolumeThree);
        System.out.println(bookList.);



    }
    // Mangler at færdiggøres
    public boolean isISBNMatching(Book bookHere, ArrayList<Book> list) {
        if ((list.contains(bookHere.getISBN() = bookHere.getISBN())){
            return true;
        }
            return false;
        }
}
