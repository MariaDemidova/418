package application.sort;


import java.util.Comparator;
import java.util.List;


public class SelectionSort {

    public  <T> void selectionSort(List<T> list, Comparator<T> comparator) {
        int listSize = list.size();

        for (int i = 0; i < listSize - 1; i++) {
            int min = i;
            for (int j = i + 1; j < listSize; j++) {
                if (comparator.compare(list.get(j), list.get(min)) < 0) {
                    min = j;
                }
            }

            if (min != i) {
                T temp = list.get(i);
                list.set(i, list.get(min));
                list.set(min, temp);
            }
        }
    }
}
