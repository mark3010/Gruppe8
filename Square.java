// Simon Gredal, DAT21V2

import java.util.Scanner;

public class Square {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ASCII Square Printer 2000");
        System.out.print("Enter size of square: ");
        Integer size = sc.nextInt();
        sc.nextLine(); //Move the scanner cursor forward so we don't read an empty line next time

        System.out.print("Enter character used to draw square: ");
        String character = sc.nextLine();

        System.out.println( drawSquare(size, character) );
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
}
