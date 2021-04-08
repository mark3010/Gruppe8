package Gruppe8;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Search {
    private String assignment = "Skriv en metode, der som parametre modtager et array af typen String samt en String." +
            "Metoden skal undersøge om strengen findes i arrayet. Metoden skal returnere indekspositionen, " +
            "hvis strengen findes i arrayet og–1hvis strengen ikke findes i arrayet.Lav en alternativ fejlhåndtering, " +
            "hvis strengen ikke findes i arrayet, hvor du i stedet kasterenexception";

    public static int searchArrayListForString(ArrayList<String> list, String line) throws Exception {
        if(list.indexOf(line) == -1) {
            throw new Exception();
        }
        return list.indexOf(line);
    }
}
