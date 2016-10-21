/**
 * Created by cave on 2016.10.21..
 */
public class ArrayHandler {

    public static int[] shiftLeft (int numberOfShifts, int[] arrayToShift) {
        int arrayLastIndex = arrayToShift.length - 1;

        int firstElement;
        for (int i = 0; i < numberOfShifts; i++) {
            firstElement = arrayToShift[0];
            for (int index = 0; index < arrayLastIndex; index++) arrayToShift[index] = arrayToShift[index + 1];
            arrayToShift[arrayLastIndex] = firstElement;
        }

        return arrayToShift;
    }
}
