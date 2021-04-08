import java.util.ArrayList;

public class GitExerciseMain {
    public static void main(String[] args) throws Exception {
        StringSort sort = new StringSort();
        sort.runStringSort();
        System.out.println();

        // Library Assignment
        Library.printProblemDescription();

        Book MacMasterRaceVolumeOne = new Book(252510, 2019, "MacMasterRaceVolumeOne");
        Book MacMasterRaceVolumeTwo = new Book(252511, 2020, "MacMasterRaceVolumeTwo");
        Book MacMasterRaceVolumeThree = new Book(252512, 2021, "MacMasterRaceVolumeThree");
        Book MacMasterRaceVolumeFour = new Book(252513, 2021, "MacMasterRaceVolumeFour");
        ArrayList<Book> bookList = new ArrayList<>();

        bookList.add(MacMasterRaceVolumeOne);
        bookList.add(MacMasterRaceVolumeTwo);
        bookList.add(MacMasterRaceVolumeThree);

        System.out.println(Library.isISBNMatching(MacMasterRaceVolumeOne,bookList));

        SquarePrinter2000.main(args);

        //Search
        ArrayList<String> searchList = new ArrayList<String>();
        searchList.add("banana");
        searchList.add("monke");

        int searchTest = Search.searchArrayListForString(searchList,"monke");
        System.out.println(searchTest);
    }
}

