package my;

import java.util.List;

public class Search {
    //суть бинарного поиска-делит массив на две части, сравнивает со средним элементом, если он больше того, что мы ищем, то переходим на левую сторону и снова делим
    //работает только с отсортиров массивами
    //если возвращает отрицательное значение, значит элемент не найден
    public static <T extends Comparable<T>> int binarySearch(List<T> list, T element) {
        int left = 0;
        int right = list.size() - 1;

        while (left <= right) {

            int mid = left + ((right - left) / 2);

            T midVal = list.get(mid);

            if (midVal.compareTo(element) > 0) {
                right = mid - 1;
            } else if (midVal.compareTo(element) < 0) {
                left = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
