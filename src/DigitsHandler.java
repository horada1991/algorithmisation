/**
 * Created by cave on 2016.10.21..
 */
public class DigitsHandler {

    public static int summingDigits(int number) {

        int sumOfDigits = 0;
        for (String i: Integer.toString(number).split("")) sumOfDigits += Integer.parseInt(i);

        return sumOfDigits;
    }
}
