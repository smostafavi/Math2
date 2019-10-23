import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        /*Complete the following program. Use the Scanner class to read the following string into variables. Input String:
         "P Sherman 42 Wallaby Way Sydney" Variables: firstInitial,lastName, houseNumber,streetName,streetType,city*/

        String myAnswer = keyboard.next();
        String firstIntial="P";
                String LastName = "Sherman";
                String streetname="wallaby ";
                        String houseNumber = "42";
                        String streettype = "way";
                        String city = "Sydney";
        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);
    }
}
