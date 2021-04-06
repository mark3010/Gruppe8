package Gruppe8;
import Files.Student;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Search {
    private String assignment = "Skriv en metode, der som parametre modtager et array af typen String samt en String." +
            "Metoden skal undersøge om strengen findes i arrayet. Metoden skal returnere indekspositionen, " +
            "hvis strengen findes i arrayet og–1hvis strengen ikke findes i arrayet.Lav en alternativ fejlhåndtering, " +
            "hvis strengen ikke findes i arrayet, hvor du i stedet kasterenexception";

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("banana");
        list.add("monke");

        int test = searchArrayListForString(list,"doot");
        System.out.println(test);
    }
    public static int searchArrayListForString(ArrayList<String> list, String line) throws NullPointerException {
        int stringPos = -1;
        if (list.contains(line)) {
            for (String i : list) {
                if (line.equals(i)) {
                    stringPos = list.indexOf(i);
                }
            }
        }
        return stringPos;
    }
}
