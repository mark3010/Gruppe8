import java.util.ArrayList;

public class Arraylist {
    private String beskrivelse = "Skriv en metodemed navnet doesArraylistContainString, der" +
            "modtager 2 parametrer: enarrayliste og en streng. Metoden returnerer en boolean";

    public static void main(String[] args) {
        ArrayList<String> carList = new ArrayList<String>();
        carList.add("Car 1");
        carList.add("Car 2");
        carList.add("Car 3");

        boolean result = doesArrayContainString(carList, "Car 2");
        System.out.println(result);
    }

    public static boolean doesArrayContainString(ArrayList<String> carList, String cars) {
        if (!carList.contains(cars)) {
            carList.add(cars);
            return false;
        }
            System.out.println("The string is found");
            return true;
    }
}




