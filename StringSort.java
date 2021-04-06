import java.util.*;

public class StringSort {

    public void runStringSort() {
        Scanner sc = new Scanner(System.in);

        printProblemDescription();

        printList(getUserDefinedStringList(sc));
    }

    private void printList(Collection<String> words) {
        for(String s : words) {
            System.out.println(s);
        }
    }

    private Collection<String> getUserDefinedStringList(Scanner sc) {
        Collection<String> words = new TreeSet<>();

        // when input is q, immediately exit and print result, do not add q to the list

        var word = "";

        while(!word.equals("q")) {
            System.out.println("write a new word and press enter, or q to exit");

            word = "" + sc.nextLine().toLowerCase();


            if(word.isEmpty()) {
                askForProperInputString();

            } else {
                words.add(word);
            }
        }
        return words;
    }

    private void askForProperInputString() {
        System.out.println("that was not a word, try again");
    }

    private void printProblemDescription() {
        System.out.println("Sortering\n" +
                "Skriven metode, der indlæser 5 tekststrenge fra tastaturet\n" +
                "og udskriver dem på skærmen i alfabetisk faldende orden på skærmen.\n" +
                "Hvis der indlæses:abekat\nmusefælde\nananas\nslut\nsolskin\n" +
                "skal der udskrives følgende på skærmen:\n" +
                "solskin\nslut\nmusefælde\nananas\nabekat\n");
    }
}

