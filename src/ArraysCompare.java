import java.lang.reflect.Array;
import java.util.Objects;

public class ArraysCompare {

    static <T extends Comparable<T>, V extends T> boolean compareArrays(T[] arrayOne, V[] arrayTwo) {
//        if (arrayOne.length == 0 || arrayTwo.length == 0) {
//            return false;
//        }

        if (arrayOne.length != arrayTwo.length) {
            return false;
        }

        for (int i = 0; i < arrayOne.length; i++) {
            if (!Objects.equals(arrayOne[i], arrayTwo[i])) {
                return false;
            }
        }

        return true;
    }
}
