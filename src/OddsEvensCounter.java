import java.util.HashMap;

/**
 * Created by cave on 2016.10.21..
 */
public class OddsEvensCounter {

    public static HashMap<String, Integer> counter(int n) {

        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("sumOdds", 0);

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) numbers.put("evens", numbers.containsKey("evens") ? numbers.get("evens") + 1 : 1);
            else {
                numbers.put("odds", numbers.containsKey("odds") ? numbers.get("odds") + 1 : 1);
                numbers.put("sumOdds", numbers.get("sumOdds") + i);
            }
        }
        return numbers;
    }

    public static HashMap<String, Integer> counter2(int n) {

        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("sumOdds", 0);

        numbers.put("evens", n / 2 + 1);
        numbers.put("odds", n / 2);
        for (int i = 1; i <= n; i += 2) numbers.put("sumOdds", numbers.get("sumOdds") + i);
        return numbers;
    }
}
