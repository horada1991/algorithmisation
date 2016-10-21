import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by cave on 2016.10.21..
 */
public class Main {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Give me a number: ");
//        int userInput = scanner.nextInt();

        HashMap<String, Integer> result = OddsEvensCounter.counter3();
        System.out.println("Even numbers: " + result.get("evens"));
        System.out.println("Odd numbers: " + result.get("odds"));
        System.out.println("Odd numbers sum: " + result.get("sumOdds"));

//        System.out.println(DigitsHandler.summingDigits(userInput));
    }
}
