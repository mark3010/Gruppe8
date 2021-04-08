// Simon Gredal, DAT21V2

import java.util.Scanner;

public class SquarePrinter2000 {

    public static void main(String[] args) {
        SquarePrinter2000 sp = new SquarePrinter2000();

        sp.printProblemDescription();
        sp.run();
    }

    private final String description =
                    """
                    Skriv en metode, der som parameter modtager et heltal.
                    Metoden skal udskrive et kvadrat på skærmen svarende til heltallet.
                    Udvid metoden, så den også modtager et tegn, som er det tegn, som printes på skærmen.
                    """;

    public SquarePrinter2000() {
    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("ASCII Square Printer 2000");
        System.out.print("Enter size of square: ");
        Integer size = sc.nextInt();
        sc.nextLine(); //Move the scanner cursor forward so we don't read an empty line next time

        System.out.print("Enter character used to draw square: ");
        String character = sc.nextLine();

        // Provide fallback in case of an empty string
        if (character.length() == 0) {
            System.out.println( drawSquare(size) );
        } else {
             System.out.println( drawSquare(size, character) );
        }
    }

    // Overload to provide default character
    private static String drawSquare(Integer size) {
        return drawSquare(size, "*");
    }

    private static String drawSquare(Integer size, String inputCharacter) {
        String character = inputCharacter.substring(0, 1);
        StringBuilder sb = new StringBuilder();

        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                sb.append(character + " ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    public void printProblemDescription() {
        System.out.println(this.getDescription());
    }

    public String getDescription() {
        return this.description;
    }
}
