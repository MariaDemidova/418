package my;

import java.util.ArrayList;
import java.util.List;

public class SortBySelection {
    public static  <T extends Comparable<T>> void sort(List<T> list) {
        List<T> tempList = new ArrayList<T>();
        tempList.addAll(list);

        for (int i = 0; i < list.size() - 1; i ++){
            int currenMinIndex = i;
            for (int j = i + 1; j < list.size(); j++){
                if (list.get(currenMinIndex).compareTo(list.get(j))>0)
                    currenMinIndex = j;
            }
            if (currenMinIndex != i){
                T temp = list.get(i);
                tempList.get(i) = list.get(currenMinIndex);
                list.get(currenMinIndex) = temp;
            }
        }
    }
}
