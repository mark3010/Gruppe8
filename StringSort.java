import java.util.*;

public class StringSort {
    private final String problemDescription = ">>>>>>> OPGAVEN ER LAVET AF HE<<<<<<<\n" +
            "Sortering\n" +
            "Skriven metode, der indlæser 5 tekststrenge fra tastaturet\n" +
            "og udskriver dem på skærmen i alfabetisk faldende orden på skærmen.\n" +
            "Hvis der indlæses:abekat\nmusefælde\nananas\nslut\nsolskin\n" +
            "skal der udskrives følgende på skærmen:\n" +
            "solskin\nslut\nmusefælde\nananas\nabekat\n";

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
        Collection<String> words = new TreeSet<>(); // new elements are added in sorted order

        var flag = true;

        while(flag) {
            var word = "";
            promptForInput();
            word = "" + sc.nextLine().toLowerCase();
            if(word.equals("q")) {
                flag = false;
            } else {
                if(word.isEmpty()) {
                    break;
                } else {
                    words.add(word);
                }
            }
        }
        return words;
    }

    private void promptForInput() {
        System.out.println("write a new word and press enter, or q to exit");
    }


    private void printProblemDescription() {
        System.out.println(problemDescription);
    }
}

