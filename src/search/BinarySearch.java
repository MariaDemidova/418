package search;
import java.util.List;

public class BinarySearch {

    public static <T extends Comparable<T>> int search(List<T> list, T itemToFind) {
        int firstIndex = 0;
        int lastIndex = list.size() - 1;

        int result = -1;

        while (firstIndex <= lastIndex) {
            int index = firstIndex + (lastIndex - firstIndex) / 2;
            T item = list.get(index);

            if (item.compareTo(itemToFind) > 0) {
                firstIndex = index + 1;
            } else if (item.compareTo(itemToFind) < 0) {
                lastIndex = index - 1;
            } else  {
                result = index;
                break;
            }
        }

        return result;
    }
}
